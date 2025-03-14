package com.javarush.led.module02.lesson02.service;

import com.javarush.led.module02.lesson02.model.Variable;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MathProcessor {
    public static Variable calc(String expression) { //2+[3,4,5]
        Pattern patternOperation = Pattern.compile(Variable.PATTERN_OPERATION);
        String[] parts = patternOperation.split(expression, 2);
        Variable left = Variable.of(parts[0]);
        if (parts.length == 2) {
            Variable right = Variable.of(parts[1]);
            Matcher operationFinder = patternOperation.matcher(expression);
            if (operationFinder.find()) {
                String operation = operationFinder.group();
                switch (operation) {
                    case "+":
                        return left.add(right);
                    case "-":
                        return left.sub(right);
                    case "*":
                        return left.mul(right);
                    case "/":
                        return left.div(right);
                }
            }
        }
        return left;
    }
}
