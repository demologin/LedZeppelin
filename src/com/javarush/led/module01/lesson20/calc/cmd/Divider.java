package com.javarush.led.module01.lesson20.calc.cmd;

import com.javarush.led.module01.lesson20.calc.Command;
import com.javarush.led.module01.lesson20.calc.exception.CalcException;

public class Divider implements Command {
    @Override
    public double execute(double left, double right) throws CalcException {
        if (right == 0){
            throw new CalcException("div by zero");
        }
        return left/right;
    }
}
