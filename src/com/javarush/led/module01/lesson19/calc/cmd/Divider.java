package com.javarush.led.module01.lesson19.calc.cmd;

import com.javarush.led.module01.lesson19.calc.Command;

public class Divider implements Command {
    @Override
    public double execute(double left, double right) {
        return left/right;
    }
}
