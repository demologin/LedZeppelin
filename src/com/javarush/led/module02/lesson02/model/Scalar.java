package com.javarush.led.module02.lesson02.model;

public class Scalar extends Variable {

    private final double value;

    Scalar(double value) {
        this.value = value;
    }

    Scalar(String value) {
        this.value = Double.parseDouble(value);
    }

    Scalar(Scalar other) {
        this.value = other.value;
    }

    public double getValue() {
        return value;
    }

    @Override
    public Variable add(Variable other) {
        if (other instanceof Scalar scalar) {
            return new Scalar(this.value + scalar.value);
        }
        return other.add(this);
    }

    @Override
    public Variable mul(Variable other) {
        if (other instanceof Scalar scalar) {
            return new Scalar(this.value * scalar.value);
        }
        return other.mul(this);
    }

    @Override
    public Variable sub(Variable other) {
        if (other instanceof Scalar scalar) {
            return new Scalar(this.value - scalar.value);
        }
        return other.sub(this).mul(new Scalar(-1));
    }

    @Override
    public Variable div(Variable other) {
        if (other instanceof Scalar scalar) {
            return new Scalar(this.value / scalar.value);
        }
        return super.div(this);
    }

    @Override
    public String toString() {
        return Double.toString(this.value);
    }
}
