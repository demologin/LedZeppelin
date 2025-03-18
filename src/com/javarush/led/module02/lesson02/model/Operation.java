package com.javarush.led.module02.lesson02.model;

public interface Operation {

    Variable add(Variable other);

    Variable sub(Variable other);

    Variable mul(Variable other);

    Variable div(Variable other);

}
