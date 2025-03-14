package com.javarush.led.module01.lesson20.calc.io;

public class ConsolePrinter {

    public void print(String message) {
        System.out.println(message);
    }

    public void print(Exception e) {
        System.err.println(e.getMessage());
    }
}
