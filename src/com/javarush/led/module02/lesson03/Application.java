package com.javarush.led.module02.lesson03;

import java.util.Comparator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Application {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(TextData.text);
        Set<Line> lines = new TreeSet<>((o1, o2) -> -o1.length() + o2.length());
        while (scanner.hasNext()) {
            String line = scanner.nextLine();
            lines.add(new Line(line));
        }
        for (Line line : lines) {
            line.print();
        }
    }
}
