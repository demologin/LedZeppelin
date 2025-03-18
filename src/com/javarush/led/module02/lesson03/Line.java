package com.javarush.led.module02.lesson03;

public class Line implements Printable, Comparable<Line> {

    private final String content;

    public int length() {
        return content.length();
    }

    public Line(String content) {
        this.content = content;
    }

    @Override
    public void print() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Line{" +
               "content='" + content + '\'' +
               '}';
    }

    @Override
    public int compareTo(Line other) {
        return this.content.compareTo(other.content);
    }
}
