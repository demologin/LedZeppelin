package com.javarush.led.module01.lesson21;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SimpleStackTraceDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double number = getDoubleFromScanner(scanner);
        System.out.println("number = " + number);
    }

    private static double getDoubleFromScanner(Scanner scanner) {
        double number = Double.NaN;
        try {
            String strNumber = scanner.next();
            number = Double.parseDouble(strNumber);
        } catch (NumberFormatException|InputMismatchException e) {
            String message = e.getMessage();
            String exceptionClassName = e.getClass().getName();
            System.err.printf("%s: %s\n", exceptionClassName, message);
            StackTraceElement[] stackTrace = e.getStackTrace();
            for (StackTraceElement stackTraceElement : stackTrace) {
                String methodName = stackTraceElement.getMethodName();
                String fileName = stackTraceElement.getFileName();
                int lineNumber = stackTraceElement.getLineNumber();
                String className = stackTraceElement.getClassName();
                System.err.printf("\tat %s.%s(%s:%d)\n", className, methodName, fileName, lineNumber);
            }

        }
        return number;
    }
}
