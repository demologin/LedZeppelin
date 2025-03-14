package com.javarush.led.module01.lesson05;

public class AllDemo {
    public static void main(String[] args) {
        int up = 0;
        System.out.println("While up demo:");
        while (up < 10) {
            System.out.print(up++ + " ");
        }
        System.out.println();


        int down = 10;
        System.out.println("Do while down demo:");
        do {
            System.out.print(down + " ");
            down--;
        } while (down > 0);
        System.out.println();

        System.out.println("Continue while demo:");
        int counter = 0;
        while (counter < 15) {
            counter++;
            boolean conditionPrint = counter % 5 != 0;
            if (!conditionPrint) {
                continue;
            }
            System.out.print(counter + " ");
        }
        System.out.println();

        System.out.println("Break while demo:");
        int counter2 = 0;
        while (counter2 < 10) {
            counter2++;
            if (counter2 % 5 == 0) {
                break;
            }
            System.out.print(counter2 + " ");
        }
        System.out.println();


        System.out.println("For demo:");
        for (int i = 0; i < 10; i++) {
            System.out.print(i+" ");
        }
        System.out.println();

        System.out.println("For reversed demo:");
        for (int i = 9; i >= 0; i--) {
            System.out.print(i+" ");
        }
        System.out.println();

        System.out.println("Continue for demo:");

        for (int counter4 = 0; counter4 < 15; counter4++) {
            if (counter4 % 5 == 0) {
                continue;
            }
            System.out.print(counter4 + " ");
        }
        System.out.println();

        System.out.println("For with two counters");
        for (int i = 10, j = 0; j < i; i--, j++) {
            System.out.printf("i=%d j=%d\n", i, j);
        }
        System.out.println();
    }
}