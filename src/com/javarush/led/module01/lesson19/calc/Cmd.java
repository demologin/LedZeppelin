package com.javarush.led.module01.lesson19.calc;

import com.javarush.led.module01.lesson19.calc.cmd.*;

public enum Cmd {
    ADD(new Adder()),
    MUL(new Multiplicator()),
    SUB(new Subtractor()),
    DIV(new Divider()),
    NOT_OPERATION(new NoOperation());

    private final Command command;

    Cmd(Command command) {
        this.command = command;
    }

    public static Command resolve(String operation) {
        return switch (operation) {
            case "ADD", "add", "+" -> ADD.command;
            case "sub", "-" -> SUB.command;
            case "mul", "*" -> MUL.command;
            case "div", "/" -> DIV.command;
            default -> NOT_OPERATION.command;
        };
    }

    
}
