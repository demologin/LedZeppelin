package com.javarush.led.module02.lesson05;

import java.util.*;

public class UniqueCollectionNumbers {
    public static void main(String[] args) {
        Set<Double> doubles = new HashSet<>(List.of(3.0, 4.0, 5.0, Double.MAX_VALUE));
        Set<Integer> integers = new HashSet<>(List.of(1, 2, 3, 4, 5, 6, 7));
        Set<Long> longs = new HashSet<>(List.of(1L, 2L, 3L, 8L, 70L, Long.MAX_VALUE, Long.MAX_VALUE - 1));
        Set<? super Number> result = createUniqueData(doubles, integers, longs);
        System.out.println(result);
    }

    @SafeVarargs
    private static Set<? super Number> createUniqueData(Set<? extends Number>... sets) {
        Set<Number> result = new TreeSet<>(getComparator());
        for (Set<? extends Number> set : sets) {
            result.addAll(set);
        }
        return result;
    }

    private static Comparator<Number> getComparator() {
        return (o1, o2) -> o1.doubleValue() == o2.doubleValue() && o1.longValue() == o2.longValue()
                ? 0
                : o1.doubleValue() < o2.doubleValue() || o1.longValue() < o2.longValue()
                ? -1
                : 1;
    }


}
