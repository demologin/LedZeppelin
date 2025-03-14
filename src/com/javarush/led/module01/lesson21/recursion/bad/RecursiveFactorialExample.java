package com.javarush.led.module01.lesson21.recursion.bad;

public class RecursiveFactorialExample {
    public static void main(String[] args) {
        try {
            long result = factorial(21);
            System.out.println("Factorial: " + result);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    public static long factorial(int n) {
        if (n < 0 || n > 20) {
            throw new IllegalArgumentException("Number must be non-negative and less 21.");
        }
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }
}