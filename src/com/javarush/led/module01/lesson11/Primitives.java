package com.javarush.led.module01.lesson11;

public class Primitives {
    public static void main(String[] args) {
        byte b = 12;
        b %= 2;
        int i = 123456;
        i += 1.0;
        print(i);
    }

    static void print(double data) {
        System.out.println(data);
    }
}
