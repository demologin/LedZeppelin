package com.javarush.led.module01.lesson02;

public class Primitive {
    public static void main(String[] args) {
        byte b = (byte) 128;
        int i = 210000000;
        short s = 145;
        long l = 342L;

        double v = 0.1;
        float f = 0.1f;

        boolean bb = true;
        char c = 'a';
        int code = ++c;
        System.out.println(code);
        System.out.println(c);

        String hello = "Hello";
        System.out.println(hello);

    }
}
