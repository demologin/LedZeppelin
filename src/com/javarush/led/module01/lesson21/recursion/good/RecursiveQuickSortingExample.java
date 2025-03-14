package com.javarush.led.module01.lesson21.recursion.good;

import java.util.Arrays;

public class RecursiveQuickSortingExample {
    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 1, 4, 6}; // 2 1 4 [5] 9 6
                                        // 1 2 4 [5] 6 9
                                        // 5 1 4 2 6 9
        try {
            sort(arr, 0, arr.length - 1);
            System.out.println("Sorted array: " + Arrays.toString(arr));
        } catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
        }
    }

    public static void sort(int[] arr, int low, int high) {
        if (low < 0 || high >= arr.length) {
            throw new IllegalArgumentException("Indexes must be within array bounds.");
        }
        if (low < high) {
            int pivotIndex = partition(arr, low, high);
            sort(arr, low, pivotIndex - 1);
            sort(arr, pivotIndex + 1, high);
        }
    }

    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, high);
        return i + 1;
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}