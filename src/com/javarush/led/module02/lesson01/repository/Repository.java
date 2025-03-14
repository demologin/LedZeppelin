package com.javarush.led.module02.lesson01.repository;

import java.util.Collection;

public interface Repository<K, E> {

    Collection<E> getAll();

    E getById(K id);


    void save(E user);

    void update(E user);

    void delete(K id);
}
