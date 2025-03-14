package com.javarush.led.module01.lesson16;

import java.util.*;

public class CollectionDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        List<String> numbers = List.of("one!", "two", "three", "four", "five");
        list.addAll(numbers);
        System.out.println(list);

        Set<String> set = new HashSet<>();
        set.addAll(numbers);

        for (Iterator<String> iterator = set.iterator(); iterator.hasNext(); ) {
            String oneWord = iterator.next();
            System.out.println(oneWord);
        }


    }
}
