package com.javarush.led.module02.lesson02.exp;

import com.javarush.led.module02.lesson02.model.Variable;

public class RunnerDemo {
    public static void main(String[] args) {
        Variable left = Variable.of("5");
        Variable right = Variable.of("6");
        Variable vector = Variable.of("[1,2,3]");
        System.out.println(left.add(right)); //5+6
        System.out.println(left.sub(right)); //5-6
        System.out.println(left.mul(right)); //5*6
        System.out.println(left.div(right)); //5/6
        System.out.println(left.add(right));
        System.out.println(left.add(vector)); //5+[1,2,3]
        System.out.println(vector.add(left)); //[1,2,3]+5
        System.out.println(right.add(left));
        System.out.println(vector.add(vector));
        System.out.println(vector.mul(vector));

    }
}
