package com.javarush.led.module01.lesson15;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {

    public static void main(String[] args) {

        List<Integer> integers = List.of(1, 2, 3);
        ArrayList<Integer> list = new ArrayList<>(integers);
        list.add(4);
        list.addAll(List.of(5, 6, 7));
        System.out.println(list);
        Integer o = 2;
        list.remove(o);
        System.out.println(list);

        for (Iterator<Integer> iterator = list.iterator(); iterator.hasNext(); ) {
            Integer value = iterator.next();
            if (value == 5) {
                iterator.remove();
            }
        }
    }
}
