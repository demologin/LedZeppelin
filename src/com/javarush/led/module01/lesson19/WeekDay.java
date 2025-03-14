package com.javarush.led.module01.lesson19;

public enum WeekDay {
    SUNDAY("вс"),
    MONDAY("пн"),
    TUESDAY("вт"),
    WEDNESDAY("ср"),
    THURSDAY("чт"),
    FRIDAY("пт"),
    SATURDAY("сб");

    private final String russianName;

    WeekDay(String russianName) {
        this.russianName = russianName;
    }

    public String getRussianName() {
        return russianName;
    }

    public String getEnglishName() {
        return name().toLowerCase();
    }

    @Override
    public String toString() {
        return "\n"+super.toString()+"{" +
               "\n\truName='" + getRussianName() + '\'' +
               "\n\tenName='" + getEnglishName() + '\'' +
               "\n}";
    }
}
