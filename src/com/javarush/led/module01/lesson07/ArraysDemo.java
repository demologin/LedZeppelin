package com.javarush.led.module01.lesson07;

import java.util.Arrays;

public class ArraysDemo {
    public static void main(String[] args) {
        int[][] ints = {
                {1, 2, 3, 4, 5, 6},
                {7, 8, 9, 10, 11, 12},
                {13, 14, 15, 16, 17, 18},
                {19, 20, 21, 22, 23, 24},
        };

        for (int[] row : ints) {
            int margin = 1;
            Arrays.fill(row, 42);
        }


        for (int[] row : ints) {
            System.out.println(Arrays.toString(row));
        }
    }
}
