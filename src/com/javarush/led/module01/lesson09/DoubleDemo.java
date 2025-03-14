package com.javarush.led.module01.lesson09;

public class DoubleDemo {

    public static void main(String[] args) {
        double[] array = {
                0.0, Double.MIN_VALUE, 1 / 16.0, 1.0, 1023, 1024L,
                Double.MAX_VALUE, Double.POSITIVE_INFINITY,
                -0.0, -1 * Double.MIN_VALUE, -1 / 16.0, -1.0, -1023, -1024L,
                -1 * Double.MAX_VALUE, Double.NEGATIVE_INFINITY,
                Double.NaN};
        for (double value : array) {
            long longAsDouble = Double.doubleToLongBits(value);
            String binaryString = Long.toBinaryString(longAsDouble);
            String stringWithSpaces = binaryString.formatted("%64s", binaryString);
            String stringAsDoubleBinary = stringWithSpaces.replace(' ', '0');
            System.out.println(stringAsDoubleBinary+" "+value);
        }
    }
}
