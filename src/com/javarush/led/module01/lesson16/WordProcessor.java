package com.javarush.led.module01.lesson16;

import java.util.*;

public class WordProcessor {
    public static void main(String[] args) {
        StringTokenizer tokenizer = new StringTokenizer(Data.TEXT,
                "0123456789 -+/!@#$%^&*()[]{}\\\"`'.,?\n;=:—\t><«");
        int cap = 2048;
        ArrayList<String> arrayList = new ArrayList<>(cap);
        List<String> myList = new MyList<>();
        Deque<String> linkedList = new LinkedList<>();
        Queue<String> priorityQueue = new PriorityQueue<>();
        Set<String> hashSet = new HashSet<>(cap);
        Set<String> linkedHashSet = new LinkedHashSet<>(cap);
        Set<String> treeSet = new TreeSet<>();
        while (tokenizer.hasMoreTokens()) {
            String word = tokenizer.nextToken();
            arrayList.add(word);
            linkedList.add(word);
            hashSet.add(word);
            linkedHashSet.add(word);
            treeSet.add(word);
            priorityQueue.add(word);
        }

        linkedList.removeFirst();
        linkedList.removeLast();

        String line = "-".repeat(100) + "\n";
        System.out.println(line + "arrayList size=" + arrayList.size());
        System.out.println(arrayList);

        System.out.println(line + "linkedList size=" + linkedList.size());
        System.out.println(linkedList);

        System.out.println(line + "hashSet size=" + hashSet.size());
        System.out.println(hashSet);

        System.out.println(line + "linkedHashSet size=" + linkedHashSet.size());
        System.out.println(linkedHashSet);

        System.out.println(line + "treeSet size=" + treeSet.size());
        System.out.println(treeSet);

        System.out.println(line + "priorityQueue size=" + priorityQueue.size());
        System.out.println(priorityQueue);

    }
}
