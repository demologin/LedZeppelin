package com.javarush.led.module02.lesson05;

import java.util.ArrayList;
import java.util.List;

public class ArrayListPECS {
    public static void main(String[] args) {
        List<Number> integers = new ArrayList<>(List.of(1, 2, 3, 4));
        List<Double> doubles = new ArrayList<>(List.of(1., 2., 3., 4.));
        Number result1 = getSum(integers);
        Number result2 = getSum(doubles);
        System.out.println(integers);
        System.out.println(doubles);
        addNumbers(integers, 5, 6, 7, 8, 9, 10, 11, 12);
    }

    private static void addNumbers(List<? super Number> list, Number... numbers) {
        for (Number number : numbers) {
            list.add(number);
        }
    }

    private static Double getSum(List<? extends Number> numbers) {
        double sum = 1;
        for (Number number : numbers) {
            sum = sum + number.doubleValue();
        }
        return sum;
    }


}
