package com.javarush.led.module01.lesson13;

public class Application {

    private static int counter=10;


    public static int readCounter() {
        return counter;
    }
    //===================================================================

    Button[] buttons = new Button[10];

    public Application() {
        this.title = "App" + ++counter;
        Button button = new Button();
    }



    private String title;


    @Override
    public String toString() {
        return "Application{" +
               "title='" + title + '\'' +
               '}';
    }

    public static class Button {
        String name;
        public static int buttonsCount;

        public static int getButtonsCount() {
            return buttonsCount;
        }
    }
}


