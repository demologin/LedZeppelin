package com.javarush.led.module01.lesson23;

import java.nio.charset.Charset;
import java.util.Map;
import java.util.SortedMap;

public class CharsetDemo {
    public static void main(String[] args) {
        SortedMap<String, Charset> charsets = Charset.availableCharsets();
        for (Map.Entry<String, Charset> entry : charsets.entrySet()) {
            System.out.print(entry.getKey()+"=(");
            Charset charset = entry.getValue();
            for (String alias : charset.aliases()) {
                System.out.print(alias+",");
            }
            System.out.println(");");
        }

    }
}
