package com.javarush.led.module01.lesson07;

import java.util.Scanner;

public class SalariesProcessor {

    public static final int COUNT_PERIODS = 4;

    public static void main(String[] args) {
        String debugInput = "3 " +
                            "Ivanov Petrov Sidorov " +
                            "1 2 3 4 " +
                            "5 6 7 8 " +
                            "9 10 11 12 ";
        Scanner scanner = new Scanner(debugInput);
        System.out.println("Input the number of employee");
        int count = scanner.nextInt();

        String[] names = new String[count];
        for (int i = 0; i < count; i++) {
            names[i] = scanner.next();
        }

        int[][] salaries = new int[count][COUNT_PERIODS];
        for (int i = 0; i < count; i++) {
            System.out.printf("Input %d salaries for %s:%n", salaries[i].length, names[i]);
            for (int j = 0; j < salaries[i].length; j++) {
                salaries[i][j] = scanner.nextInt();
            }
        }

        String title = "Name      Quarter1  Quarter2  Quarter3  Quarter4  Sum ";
        String line = "=".repeat(title.length());
        System.out.println(line);
        System.out.println(title);
        System.out.println(line);
        double total = 0;
        for (int i = 0; i < names.length; i++) {
            System.out.printf("%8s:  ", names[i]);
            int sum = 0;
            int[] oneRow = salaries[i];
            for (int salary : oneRow) {
                System.out.printf("%-8d  ", salary);
                sum += salary;
            }
            System.out.printf("%-8d  %n", sum);
            total += sum;
        }
        System.out.println(line);
        System.out.printf("Total salaries: %f%n", total);
        double average = total / count / COUNT_PERIODS;
        System.out.printf("Average salary: %f%n", average);
    }
}
