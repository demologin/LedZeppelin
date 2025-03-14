package com.javarush.led.module01.lesson24;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.List;
import java.util.StringJoiner;

public class NioDemo {
    public static void main(String[] args) {
        //https://javarush.com/quests/lectures?quest=QUEST_JAVA_SYNTAX&level=24
        String[] folders = NioDemo.class.getPackageName().split("\\.");
        Path dataDir = Path.of("src",folders);
        Path filename = dataDir.resolve("data24.txt");
        List<String> list;
        try {
            list = Files.readAllLines(filename);
            System.out.println(list);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        StringJoiner joiner = new StringJoiner(",", "[", "]");
        for (String data : list) {
            joiner.add("\""+data+"\"");
        }
        String json = """
                {
                    "name": "Khmelov",
                    "data": %s
                }
                """.formatted(joiner);

        Path jsonPath = dataDir.resolve("data24.json");
        try (BufferedWriter writer = Files.newBufferedWriter(jsonPath, StandardOpenOption.CREATE)){
                writer.write(json);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        Path jsonPathNio = dataDir.resolve("data24nio.json");
        try {
            Files.writeString(jsonPathNio,json,StandardOpenOption.CREATE);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
