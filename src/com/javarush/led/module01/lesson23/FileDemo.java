package com.javarush.led.module01.lesson23;

import java.io.File;

public class FileDemo {
    public static void main(String[] args) {
        File file = new File("src/com/javarush/lesson23/demo.txt");
        System.out.println(file);
        System.out.println("exists:" + file.exists());
        File dir = file.getParentFile();
        System.out.println("file is dir:" + file.isDirectory());
        System.out.println("parent:" + dir);
        System.out.println("parent is dir:" + dir.isDirectory());
        System.out.println("abs:" + file.getAbsoluteFile());
    }
}
