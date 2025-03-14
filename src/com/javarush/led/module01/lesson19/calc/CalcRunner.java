package com.javarush.led.module01.lesson19.calc;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CalcRunner {
    public static void main(String[] args) {
        System.out.println("Start app");
        Scanner scanner = new Scanner(System.in);
        for (; ; ) {
            String expression = scanner.nextLine();
            if (!expression.equals("end")) {
                String regex = "[-+*/%]";
                Pattern pattern = Pattern.compile(regex);
                Matcher matcher = pattern.matcher(expression);
                if (matcher.find()) {
                    String operation = matcher.group();
                    String[] parts = expression.split(regex, 2);
                    double left=Double.parseDouble(parts[0]);
                    double right=Double.parseDouble(parts[1]);
                    Command command = Cmd.resolve(operation);
                    double result = command.execute(left, right);
                    System.out.println(expression+"="+result);
                }
            } else {
                break;
            }
        }
        System.out.println("Stop app");

    }
}
