package com.javarush.led.module01.lesson20.calc.cmd;

import com.javarush.led.module01.lesson20.calc.Command;

public class NoOperation implements Command {
    @Override
    public double execute(double left, double right) {
        System.out.println("NoOperation");
        return Double.NaN; //todo throw ex??
    }
}
