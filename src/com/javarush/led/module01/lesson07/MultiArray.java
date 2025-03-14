package com.javarush.led.module01.lesson07;

import java.util.Arrays;

public class MultiArray {
    public static void main(String[] args) {
        int[][][][] tensor;
        tensor = new int[2][][][];
        for (int i = 0; i < tensor.length; i++) {
            tensor[i] = new int[3][][];
            for (int j = 0; j < tensor[i].length; j++) {
                tensor[i][j] = new int[4][];
                for (int k = 0; k < tensor[i][j].length; k++)
                    tensor[i][j][k] = new int[2];
            }
        }
        for (int[][][] array3D : tensor) {
            for (int[][] array2D : array3D) {
                System.out.println(Arrays.deepToString(array2D));
            }
            System.out.println();
        }

        int[][][] rubik = new int[3][3][3];

    }
}
