package com.javarush.led.module02.lesson02;

import com.javarush.led.module02.lesson02.model.Variable;
import com.javarush.led.module02.lesson02.service.MathProcessor;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Start application");
        while (true) {
            String expression = scanner.nextLine();
            if (!expression.equals("exit")) {
                Variable result = MathProcessor.calc(expression);
                System.out.println(expression + " = " + result);
            } else {
                break;
            }
        }
        System.out.println("Stop application");
    }
}
