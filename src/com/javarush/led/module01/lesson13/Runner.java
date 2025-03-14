package com.javarush.led.module01.lesson13;


public class Runner {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            Application application = new Application();
            System.out.println(application);
        }
        System.out.println("counter app=" + Application.readCounter());
        Application application = new Application();
        Application.Button button = new Application.Button();

        int buttonsCount = Application.Button.buttonsCount;
    }
}
