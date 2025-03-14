package com.javarush.led.module01.lesson07;

import java.util.Arrays;

public class Array2D {
    public static void main(String[] args) {
        String one = "One";
        String[] array = {one, "Two", "Three", "Four", "Five"};
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
                {10, 11, 12},
        };
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
        String line = "=".repeat(30);
        System.out.println(line);
        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }
        System.out.println(line);
        System.out.println(Arrays.deepToString(matrix));

        System.out.println(line);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.printf("m[%1d][%1d]=%-2d ", i, j, matrix[i][j]);
            }
            System.out.println();
        }

    }
}
