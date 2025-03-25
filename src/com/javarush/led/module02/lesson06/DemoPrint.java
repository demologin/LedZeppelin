package com.javarush.led.module02.lesson06;

import java.util.stream.Stream;

public class DemoPrint {
    public static void main(String[] args) {
        Stream
                .iterate(10L, i -> i - 1)
                .map(l -> Long.toString(l) + "!")
                .filter(o -> o.startsWith("-"))
                .limit(30)
                .sorted()
                .forEach(o -> System.out.print(o+" "));

        go();
    }

    private static void go() {
    }
}
