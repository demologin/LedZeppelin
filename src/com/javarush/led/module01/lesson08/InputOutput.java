package com.javarush.led.module01.lesson08;

import java.util.Scanner;

public class InputOutput {
    static int[] readArrayFrom(Scanner scanner) {
        int sizeArray = scanner.nextInt();
        int[] array = new int[sizeArray];
        for (int i = 0; i < sizeArray; i++) {
            array[i] = scanner.nextInt();
        }
        return array;
    }

    static void printArray(int[] array) {
        printArray(array, "[", ", ", "]");
    }

    static void printArray(int[] array, String leftBracket, String rightBracket) {
        printArray(array, leftBracket, ", ", rightBracket);
    }

    static void printArray(int[] array, String leftBracket, String delimiter, String rightBracket) {
        System.out.print(leftBracket);
        for (int i = 0; i < array.length; i++) {
            String outString = array[i] + (i < array.length - 1 ? delimiter : rightBracket);
            System.out.print(outString);
        }
        System.out.println();
    }
}
