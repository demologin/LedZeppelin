package com.javarush.led.module01.lesson20.calc.exception;

public class CalcException extends Exception {

    public CalcException() {
    }

    public CalcException(String message) {
        super(message);
    }

    public CalcException(String message, Throwable cause) {
        super(message, cause);
    }

    public CalcException(Throwable cause) {
        super(cause);
    }
}
