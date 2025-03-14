package com.javarush.led.module01.lesson08;

import java.util.Arrays;

public class Statistics {

    static double getAverage(int[] grades) {
        return getSum(grades) / (double) grades.length;
    }

    static int getSum(int[] grades) {
        int sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        return sum;
    }

    static int getMinimum(int[] array) {
        int result = Integer.MAX_VALUE;
        for (int element : array) {
            result = Math.min(result, element);
        }
        return result;
    }

    static int getMaximum(int[] array) {
        int result = Integer.MIN_VALUE;
        for (int element : array) {
            result = Math.max(result, element);
        }
        return result;
    }

    static double getMedian(int[] array) {
        array = array.clone();
        Arrays.sort(array);
        return array[array.length / 2];
    }
}
