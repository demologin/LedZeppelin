package com.javarush.led.module01.lesson20.calc;

import com.javarush.led.module01.lesson20.calc.exception.CalcException;
import com.javarush.led.module01.lesson20.calc.io.ConsolePrinter;
import com.javarush.led.module01.lesson20.calc.io.Input;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CalcRunner {
    public static void main(String[] args) {
        Input input = new Input(new Scanner(System.in));
        ConsolePrinter consolePrinter = new ConsolePrinter();
        consolePrinter.print("Start app");
        for (; ; ) {
            try {
                String expression = input.readExpression();
                if (!expression.equals("end")) {
                    String regex = "[-+*/%]";
                    Pattern pattern = Pattern.compile(regex);
                    Matcher matcher = pattern.matcher(expression);
                    if (matcher.find()) {
                        String operation = matcher.group();
                        String[] parts = expression.split(regex, 2);
                        double left = Double.parseDouble(parts[0]);
                        double right = Double.parseDouble(parts[1]);
                        Command command = Cmd.resolve(operation);
                        double result = command.execute(left, right);
                        System.out.println(expression + "=" + result);
                    } else {
                        throw new CalcException("Incorrect expression:" + expression);
                    }
                } else {
                    break;
                }
            } catch (NumberFormatException e) {
                consolePrinter.print(e.getMessage());
            } catch (CalcException e) {
                consolePrinter.print(e);
            } finally {
                consolePrinter.print("one operation end");
            }
        }
        consolePrinter.print("Start app");

    }
}
