package com.javarush.led.module01.lesson20;

import java.util.Scanner;

public class SimpleException extends Object {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            String input = scanner.nextLine();
            calc100Div(input);
        } catch (ArithmeticException | NumberFormatException e) {
            e.printStackTrace();
        }
    }

    private static int calc100Div(String input) {
        int value = Integer.parseInt(input);
        int result = 100 / value;
        if (result == 1) {
            throw new RuntimeException("Not input 100!!!");
        }
        System.out.println("Value=" + value + ",  100/" + value + " = " + result);
        return result;
    }
}
