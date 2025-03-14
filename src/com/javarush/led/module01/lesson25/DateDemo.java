package com.javarush.led.module01.lesson25;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;

public class DateDemo {
    public static void main(String[] args) {
        Calendar instance = Calendar.getInstance();
        instance.set(1970, Calendar.JANUARY, 1, 3, 0,0);
        Date time = instance.getTime();
        System.out.println("milis="+time.getTime());
        System.out.println("hours="+time.getTime()/3600000);
        instance.set(1970, Calendar.JANUARY, 1, 3, 0,0);
        System.out.println("millis2="+instance.get(Calendar.MILLISECOND));

    }
}
