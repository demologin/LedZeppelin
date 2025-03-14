package com.javarush.led.module01.lesson20.calc.io;

import com.javarush.led.module01.lesson20.calc.exception.CalcException;

import java.util.Scanner;

public class Input {

    private final Scanner scanner;

    public Input(Scanner scanner) {
        this.scanner = scanner;
    }

    public String readExpression() throws CalcException {
        String expression = scanner.nextLine();
        if (expression.startsWith("-")) {
            throw new CalcException("not start with '-");
        }
        return expression;
    }
}
