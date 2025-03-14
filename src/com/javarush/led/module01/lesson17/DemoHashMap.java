package com.javarush.led.module01.lesson17;

import java.util.*;

public class DemoHashMap {
    public static void main(String[] args) {
        Map<String, Integer> mapPerson = new TreeMap<>();
        mapPerson.put("Ivanov", 2000);
        mapPerson.put("Ivanova", 3000);
        mapPerson.put("Petrov", 3500);
        mapPerson.put("Petrova", 2500);
        mapPerson.put("Sidirov", 4000);
        mapPerson.put("Sidirova", 5000);
        for (var entry : mapPerson.entrySet()) {
            System.out.println(entry);
        }
        Set<String> stringSet = mapPerson.keySet();
        Collection<Integer> values = mapPerson.values();
        stringSet.remove("Petrov");
        values.remove(2000);
        System.out.println(stringSet);
        System.out.println(values);


    }
}
