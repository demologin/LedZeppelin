package com.javarush.led.module01.lesson11;

public class App {
    public static void main(String[] args) {

        Component[] array = {
                new Button(222, 333, "blue", 66, "Help button"),
                new Button(22, 33, "blue", 55, "Help button"),
                new Button(44, 55, "white", 44, "Help button"),
                new InputBox(321, 543, "yellow", "Hello world")
        };

        for (Component component : array) {
            System.out.println(component.getX());
        }

        String[] strings = {
                new String("One"),
                "Two",
                "Three",
                "Four",
                "Five"
        };
        for (Object string : strings) {
            System.out.println(string);
        }


    }
}
