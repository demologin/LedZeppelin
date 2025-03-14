package com.javarush.led.module01.lesson05;

public class ChristmasTree {
    public static void main(String[] args) {
        int height = 6;
        for (int row = 0; row < height; row++) {
            int left=height-row;
            int right=height+row;
            for (int col = 1; col < 2 * height; col++) {
                boolean isTreeChar = col >= left && col <= right;
                System.out.print(isTreeChar ? "*" : ".");
            }
            System.out.println();
        }
    }
}
/*
.....*.....
....***....
...*****...
..*******..
.*********.
***********
 */

