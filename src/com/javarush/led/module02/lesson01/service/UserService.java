package com.javarush.led.module02.lesson01.service;

import com.javarush.led.module02.lesson01.model.User;
import com.javarush.led.module02.lesson01.repository.Repository;

import java.util.InputMismatchException;

public class UserService {

    private final Repository<Long, User> repo;

    public UserService(Repository<Long, User> repo) {
        this.repo = repo;
    }

    public boolean saveUser(User user) {
        if (validate(user)) {
            repo.save(user);
            repo.toString();
            return true;
        } else {
            throw new InputMismatchException("incorrect data in " + user);
        }
    }

    private boolean validate(User user) {
        return user.getEmail().contains("@")
               && user.getPassword().length() > 5;
    }
}
