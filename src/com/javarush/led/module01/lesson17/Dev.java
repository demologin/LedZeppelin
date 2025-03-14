package com.javarush.led.module01.lesson17;

public class Dev implements Comparable<Dev>{

    private String name;
    private int age;

    public Dev(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Dev{" +
               "name='" + name + '\'' +
               ", age=" + age +
               '}';
    }

    @Override
    public int compareTo(Dev otherDev) {
        int result = this.name.compareTo(otherDev.name);
        if (result == 0){
            result = this.age-otherDev.age;
        }
        return result;
    }
}
