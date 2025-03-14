package com.javarush.led.module01.lesson19;

public class EnumClient {
    public static void main(String[] args) {
        WeekDay[] values = WeekDay.values();
        for (WeekDay value : values) {
            System.out.println(value);
        }
        String day = "tuesday";
        WeekDay currentDay = WeekDay.valueOf(day.toUpperCase());
        System.out.println(currentDay);
    }
}
