package com.javarush.led.module01.lesson05;

public class MulTable {
    public static void main(String[] args) {
        System.out.println("=".repeat(80));
        for (int i = 2; i < 10; i++) {
            for (int j = 2; j < 10; j++) {
                System.out.printf("%1d*%1d=%-3d ", i, j, i * j);
            }
            System.out.println();
        }
        System.out.println("=".repeat(64));
    }
}
