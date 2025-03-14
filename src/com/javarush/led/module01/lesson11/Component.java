package com.javarush.led.module01.lesson11;

public abstract class Component extends Object{

    private int x;
    private int y;
    protected String color;

    public Component(int x, int y, String color) {
        this.x = x;
        this.y = y;
        this.color = color;
    }

    public int getX() {
        return this.x;
    }


    public int getY() {
        return y;
    }


    public String getColor() {
        return color;
    }


    @Override
    public String toString() {
        return String.format("Component x=%d y=%d color=%s", x, y, color);
    }

}
