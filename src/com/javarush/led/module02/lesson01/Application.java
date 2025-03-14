package com.javarush.led.module02.lesson01;

import com.javarush.led.module02.lesson01.model.Manager;
import com.javarush.led.module02.lesson01.model.User;
import com.javarush.led.module02.lesson01.service.UserService;

import java.util.InputMismatchException;

public class Application {

    private final UserService userService;

    public Application(UserService userService) {
        this.userService = userService;
    }

    public void run() {
        User[] users = {
                new User("ivan@google.com", "qwerty", 25),
                new User("petr-google.com", "qwerty", 25),
                new Manager("olga@google.com", "qwerty", 23),
        };
        for (User user : users) {
            try {
                if (userService.saveUser(user)) {
                    System.out.println("saved " + user);
                }
            } catch (InputMismatchException e) {
                System.err.println("not saved " + e.getMessage());
            }
        }

    }
}
