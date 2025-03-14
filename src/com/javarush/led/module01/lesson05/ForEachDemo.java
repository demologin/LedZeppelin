package com.javarush.led.module01.lesson05;

public class ForEachDemo {
    public static void main(String[] args) {
        String[] array = {"One", "Two", "Three", "Four", "Five"};
        for (String word : array) {
            System.out.print(word + " ");
        }
    }
}
