package com.javarush.led.module01.lesson23;

import java.io.*;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class DemoIO {
    public static void main(String[] args) {
        DemoIO.class.getResourceAsStream("/test.txt");
        String src = System.getProperty("user.dir") + File.separator + "src" + File.separator;
        String path = DemoIO.class.getPackageName().replace(".", File.separator);
        String root = src + path + File.separator;
        String filename = root + "integers.dat";
        String filetxt = root + "integers.txt";
        writeRandomArraysTo(filename);
        List<Integer> integers = readListIntegersFrom(filename);
        writeListAndStatToTxt(filetxt, integers);
        readAndShowInConsole(filetxt);

    }

    private static void readAndShowInConsole(String filetxt) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filetxt))) {
            while (reader.ready()) {
                String line = reader.readLine();
                System.out.println(line);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static void writeListAndStatToTxt(String filetxt, List<Integer> integers) {
        try (PrintWriter printWriter = new PrintWriter(filetxt)) {
            double sum = 0;
            printWriter.println("Integers");
            for (Integer integer : integers) {
                sum += integer;
                printWriter.print(integer + " ");
            }
            double avg = sum / integers.size();
            printWriter.printf("\nSum: %.2f\nAvg=%.4f\n", sum, avg);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static List<Integer> readListIntegersFrom(String filename) {
        List<Integer> integers = new ArrayList<>();
        try (DataInputStream dataInputStream = new DataInputStream(
                new BufferedInputStream(
                        new FileInputStream(filename)))) {
            while (dataInputStream.available() > 0) {
                int value = dataInputStream.readInt();
                integers.add(value);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return integers;
    }

    private static void writeRandomArraysTo(String filename) {
        try (DataOutputStream dataOutputStream = new DataOutputStream(
                new BufferedOutputStream(
                        new FileOutputStream(filename)
                ))
        ) {
            for (int i = 0; i < 20; i++) {
                int value = ThreadLocalRandom.current().nextInt();
                dataOutputStream.writeInt(value);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
