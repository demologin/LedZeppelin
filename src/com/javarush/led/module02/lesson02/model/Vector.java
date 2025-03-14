package com.javarush.led.module02.lesson02.model;


import com.javarush.led.module02.lesson02.CalcException;

import java.util.Arrays;

public class Vector extends Variable {

    private final double[] value;

    Vector(double[] value) {
        this.value = value.clone();
    }

    public Vector(String stringArray) {
        String[] strings = stringArray //[1,2,3, 4,7]
                .replace("[", "")
                .replace("]", "")
                .replaceAll("\\s+", "")
                .split(",");
        value = new double[strings.length];
        for (int i = 0; i < strings.length; i++) {
            value[i] = Double.parseDouble(strings[i]);
        }
    }


    @Override
    public Variable add(Variable other) {
        if (other instanceof Scalar scalar) {
            double[] clone = this.value.clone();
            for (int i = 0; i < clone.length; i++) {
                clone[i] += scalar.getValue();
            }
            return new Vector(clone);
        } else if (other instanceof Vector vector) {
            if (value.length == vector.value.length) {
                double[] clone = this.value.clone();
                for (int i = 0; i < clone.length; i++) {
                    clone[i] += vector.value[i];
                }
                return new Vector(clone);
            } else {
                throw new CalcException("incorrect size");
            }
        }
        return super.add(other);
    }



    @Override
    public String toString() {
        return Arrays.toString(value);
    }
}
