package com.javarush.led.module01.lesson03;

import java.util.Scanner;

public class PSample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int temperature = scanner.nextInt();
        if (temperature < 0) {
            System.out.println("На улице мороз");
            System.out.println("Шапку надень");
        } else {
            System.out.println("Тепло");
        }
    }
}
