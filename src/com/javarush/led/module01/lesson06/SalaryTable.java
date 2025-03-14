package com.javarush.led.module01.lesson06;

import java.util.Scanner;

public class SalaryTable {
    public static void main(String[] args) {
        String input = "3 " +
                       "Mike Elon Nick " +
                       "5000 6666 3333";
        Scanner scanner = new Scanner(input);

        System.out.print("Input count devs: ");
        int count = scanner.nextInt();
        String[] names = new String[count];
        for (int i = 0; i < count; i++) {
            names[i] = scanner.next();
        }

        int[] salaries = new int[count];
        for (int i = 0; i < count; i++) {
            System.out.print("Input salaries for " + names[i] + ": ");
            salaries[i] = scanner.nextInt();
        }

        String line = "=".repeat(25);
        System.out.println(line);
        System.out.println("     SALARY TABLE");
        System.out.println(line);
        for (int i = 0; i < count; i++) {
            System.out.printf("%9s:    $%-6d\n", names[i], salaries[i]);
        }
        System.out.println(line);

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        double sum = 0;
        for (int salary : salaries) {
            min = Math.min(min, salary);
            max = Math.max(max, salary);
            sum += salary;
        }
        double avg = sum / count;
        System.out.printf("Stat: \n\tmin=%d, max=%d \n\tsum=%f, avg=%f\n", min, max, sum, avg);
    }

}
