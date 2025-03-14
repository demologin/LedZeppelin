package com.javarush.led.module01.lesson03;


import java.util.Scanner;

public class SimpleIf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        if (age < 25) {
            System.out.print("You ");
            System.out.print("are ");
            System.out.print("junior "+age);
            System.out.println("!");
        } else {
            System.out.print("You are senior");
            System.out.println("!");
        }

    }
}
