package com.javarush.led.module01.lesson03;

import java.util.Scanner;

public class DemoIf {

    public static final int MIN_AGE = 18;
    public static final int MAX_JUNIOR_AGE = 25;
    public static final int MIN_EXP = 0;
    public static final int MIN_JUNIOR_SALARY = 400;
    public static final int MAX_JUNIOR_SALARY = 1000;
    public static final int MAX_SALARY = 5000;
    public static final int MIN_SALAY_SENIOR = 3500;
    public static final int MIN_EXP_SENIOR = 4;
    public static final int MIN_AGE_SENIOR = 26;
    public static final int MAX_AGE = 60;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Начинаем собеседование");
        System.out.println("Укажите возраст!");
        int age = scanner.nextInt();
        System.out.println("Укажите ожидаемую зп.");
        int salary = scanner.nextInt();
        System.out.println("Укажите ваш опыт");
        int exp = scanner.nextInt();

        boolean isJunior = (exp == MIN_EXP)
                && (age >= MIN_AGE && age <= MAX_JUNIOR_AGE)
                && (salary > MIN_JUNIOR_SALARY && salary < MAX_JUNIOR_SALARY);

        boolean isSenior = (exp > MIN_EXP_SENIOR) &&
                (age >= MIN_AGE_SENIOR && age <= MAX_AGE) &&
                (salary > MIN_SALAY_SENIOR && salary < MAX_SALARY);

        boolean isOffer = isJunior || isSenior;
        if (isOffer) {
            System.out.println("Ок. Предлагаем оффер!");
            String message = isJunior
                    ? "Предлагаем позицию джуна"
                    : "Предлагаем позицию синьора";
            System.out.println(message);
        }

        System.out.println("Если вы согласны то напишите YES!");
        String confirm = scanner.next();
        if (confirm.equals("YES")) {
            System.out.println("Поздравляем!");
        } else {
            System.out.println("Пока!");
        }


    }
}
