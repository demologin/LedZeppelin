package com.javarush.led.module01.lesson19.calc;

public interface Command {
    double execute(double left, double right);
}
