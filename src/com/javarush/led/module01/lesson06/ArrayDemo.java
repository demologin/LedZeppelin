package com.javarush.led.module01.lesson06;

import java.util.Arrays;

public class ArrayDemo {
    public static void main(String[] args) {
        byte[] bytes = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        short[] shorts = new short[13];
        shorts[1] = 111;
        int[] ints = new int[]{11, 22, 33, 44, 55, 66, 77, 88, 99};
        long[] longs = new long[12];
        longs[longs.length-1] = 9999;
        float[] floats = new float[13];
        floats[2] = 222.0f;
        double[] doubles = {Double.NEGATIVE_INFINITY, -1, 0.1, 0.2, 0.3, 0.4};
        boolean[] booleans = {true, false, false};
        char[] chars = {'H', 'e', 'l', 'l', 'o', ' ', 'w', 'o', 'r', 'l', 'd'};
        System.out.println(Arrays.toString(bytes));
        System.out.println(Arrays.toString(shorts));
        System.out.println(Arrays.toString(ints));
        System.out.println(Arrays.toString(longs));
        System.out.println(Arrays.toString(floats));
        System.out.println(Arrays.toString(doubles));
        System.out.println(Arrays.toString(booleans));
        System.out.println(Arrays.toString(chars));
        String[] strings = null;
        System.out.println(strings);
    }
}
