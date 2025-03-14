package com.javarush.led.module01.lesson17;

import java.util.*;

public class DevTreeMapDemo {
    public static void main(String[] args) {
        Comparator<Dev> comparator = new NameComparator().reversed();
        comparator = comparator.thenComparing(new AgeComparator().reversed());
        Map<Dev, Integer> map = new TreeMap<>(comparator);
        map.put(new Dev("Oleg", 20), 2000);
        map.put(new Dev("Inga", 19), 2500);
        map.put(new Dev("Inga", 21), 3300);
        map.put(new Dev("Inga", 25), 3400);
        map.put(new Dev("Anna", 20), 3500);
        map.put(new Dev("Elon", 50), 1);
        for (var devIntegerEntry : map.entrySet()) {
            System.out.println(devIntegerEntry);
        }
    }

}


class AgeComparator implements Comparator<Dev> {
    @Override
    public int compare(Dev o1, Dev o2) {
        return o1.getAge() - o2.getAge();
    }
}

class NameComparator implements Comparator<Dev> {
    @Override
    public int compare(Dev o1, Dev o2) {
        return o1.getName().compareTo(o2.getName());
    }
}

class DevComparator implements Comparator<Dev> {
    @Override
    public int compare(Dev o1, Dev o2) {
        int result = o2.getAge() - o1.getAge();
        if (result == 0) {
            result = o2.getName().compareTo(o1.getName());
        }
        return result;
    }
}


