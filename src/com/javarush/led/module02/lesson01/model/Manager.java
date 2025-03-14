package com.javarush.led.module02.lesson01.model;

public class Manager extends User{

    public Manager(String email, String password, int age) {
        super(email, password, age);
    }

    @Override
    public String toString() {
        return "Manager as " + super.toString();
    }
}
