package com.javarush.led.module02.lesson01.repository;

import com.javarush.led.module02.lesson01.model.User;

import java.util.Collection;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;

public class UserRepositoryMemoryImpl implements Repository<Long,User> {


    private final Map<Long, User> users = new ConcurrentHashMap<>();
    private final AtomicLong idGenerator = new AtomicLong();


    @Override
    public Collection<User> getAll() {
        return users.values();
    }

    @Override
    public User getById(Long id) {
        return users.get(id);
    }

    @Override
    public void save(User user) {
        long id = idGenerator.incrementAndGet();
        user.setId(id);
        users.put(id, user);
    }

    @Override
    public void update(User user) {
        users.put(user.getId(), user);
    }

    @Override
    public void delete(Long id) {
        users.remove(id);
    }
}
