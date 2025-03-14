package com.javarush.led.module01.lesson09;

import java.util.Scanner;

public class StringDemo {
    public static void main(String[] args) {
        String ok = "OK.";
        String ok1 = "OK";
        String ok2 = "O".concat("K").intern();
        Scanner scanner = new Scanner("OK");
        String ok3 = scanner.next().intern();
        System.out.println(ok.equals(ok3));
        ok=ok.replaceAll("\\.","!!!");
        System.out.println(ok);
    }
}
