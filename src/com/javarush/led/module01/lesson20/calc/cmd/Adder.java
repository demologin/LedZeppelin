package com.javarush.led.module01.lesson20.calc.cmd;

import com.javarush.led.module01.lesson20.calc.Command;

public class Adder implements Command {
    @Override
    public double execute(double left, double right) {
        return left+right;
    }
}
