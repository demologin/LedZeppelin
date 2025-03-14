package com.javarush.led.module01.lesson09;

import java.util.Arrays;

public class ConstDemo {

    public static final int NAME_CONST = 1234;
    public  final int[] array = {1,2,3,4,5,6,7,8};
    public static final String HELLO_WORLD = "Hello World";
    public static final double PI = 3.1415926;

    public static void main(String[] args) {
        ConstDemo constDemo = new ConstDemo();
        constDemo.array[1]=12;
    }
}
