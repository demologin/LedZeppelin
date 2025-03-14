package com.javarush.led.module01.lesson05;

public class WhileDemo {
    public static void main(String[] args) {
        int counter = 10;
        while (counter > 0) {
            System.out.println(counter);
            counter--;
        }
        System.out.println("Finish value=" + counter);
    }
}
