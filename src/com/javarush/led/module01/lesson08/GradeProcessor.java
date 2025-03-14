package com.javarush.led.module01.lesson08;

import java.util.Scanner;

public class GradeProcessor {


    public static void main(String[] args) {
        String in = """
                10
                11 22 33 44 66 55 77 99 88 0
                """;
        Scanner scanner = new Scanner(in);

        //input
        int[] grades = InputOutput.readArrayFrom(scanner);
        //output
        InputOutput.printArray(grades, "(", ")");
        InputOutput.printArray(grades, "<", ">");
        InputOutput.printArray(new int[]{1, 2, 3, 2, 1, 10}, "{", ":", "}");

        double median = Statistics.getMedian(grades);
        int min = Statistics.getMinimum(grades);
        int max = Statistics.getMaximum(grades);
        int sum = Statistics.getSum(grades);
        double avg = Statistics.getAverage(grades);
        System.out.printf("Median: %f, min=%d, max=%d, sum=%d%n, avg=%f%n"
                , median, min, max, sum, avg);
        InputOutput.printArray(grades);
    }

}
