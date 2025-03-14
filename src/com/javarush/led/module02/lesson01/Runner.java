package com.javarush.led.module02.lesson01;

import com.javarush.led.module02.lesson01.repository.UserRepositoryMemoryImpl;
import com.javarush.led.module02.lesson01.service.UserService;

public class Runner {
    public static void main(String[] args) {
        Application application = build();
        start(application);
    }

    private static void start(Application application) {
        application.run();
    }

    private static Application build() {
        UserRepositoryMemoryImpl userRepository = new UserRepositoryMemoryImpl();
        UserService userService = new UserService(userRepository);
        return new Application(userService);
    }
}
