package com.javarush.led.module01.lesson09;

public class CipherSystem {
    public static void main(String[] args) {
        int[] array = {0, 1, 2, 3, 4, 5, 6, 0b111, 010, 011, 0xA, 11, 12, 13, 14, 0xF};
        String title = " DEC  BIN  HEX  OCT ";
        String line = "-".repeat(title.length());
        System.out.println(line);
        System.out.println(title);
        System.out.println(line);
        for (int value : array) {
            String hex = Integer.toHexString(value);
            String bin = Integer.toBinaryString(value);
            String rawBin = String.format("%4s", bin);
            bin = rawBin.replace(' ', '0');
            String oct = Integer.toOctalString(value);
            String dec = Integer.toString(value);
            System.out.printf("%4s %4s %4s %4s%n", dec, bin, hex, oct);
        }
        System.out.println(line);
    }
}
