package com.javarush.led.module02.lesson02.model;

import com.javarush.led.module02.lesson02.CalcException;

public abstract class Variable implements Operation {

    public static final String PATTERN_SCALAR = "-?[0-9]+(\\.[0-9]+)?";
    public static final String PATTERN_VECTOR = "\\[" + PATTERN_SCALAR + "(," + PATTERN_SCALAR + ")*]";
    public static final String PATTERN_OPERATION = "[-+*/]";

    @Override
    public Variable add(Variable other) {
        System.out.println(getMessage(this, "+", other));
        return null; //todo throw ex
    }

    @Override
    public Variable sub(Variable other) {
        System.out.println(getMessage(this, "-", other));
        return null; //todo throw ex
    }

    @Override
    public Variable mul(Variable other) {
        System.out.println(getMessage(this, "*", other));
        return null; //todo throw ex
    }

    @Override
    public Variable div(Variable other) {
        System.out.println(getMessage(this, "/", other));
        return null; //todo throw ex
    }

    private String getMessage(Object left, String operation, Object right) {
        return String.format("Operation %s %s %s impossible", left, operation, right);
    }

    public static Variable of(String string) {
        string = string.replaceAll("\\s+", "");
        if (string.matches(PATTERN_SCALAR)) {
            return new Scalar(string);
        } else if (string.matches(PATTERN_VECTOR)) {
            return new Vector(string);
        } else throw new CalcException("incorrect input: " + string);
    }

}
