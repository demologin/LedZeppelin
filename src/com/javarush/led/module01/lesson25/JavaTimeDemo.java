package com.javarush.led.module01.lesson25;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAccessor;

public class JavaTimeDemo {
    public static void main(String[] args) {
        LocalDateTime startYear = LocalDateTime.of(2024, Month.JANUARY, 1, 0, 0);
        LocalDateTime programmerDay = startYear.plusDays((1 << 8) - 1);
        System.out.println("startYear=" + startYear);
        System.out.println("programmerDay=" + programmerDay);

        ZonedDateTime now = ZonedDateTime.now();
        ZoneId zone = now.getZone();
        Instant instant = now.toInstant();
        LocalDateTime localDateTime = LocalDateTime.ofInstant(instant, zone);
        System.out.println("Instant=" + instant);
        System.out.println("localDateTime=" + localDateTime);
        System.out.println("now=" + now);
        long data = ChronoUnit.DAYS.between(programmerDay, now);
        System.out.println(data);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm:ss");
        TemporalAccessor temporalAccessor = formatter.parse("21.02.2025 20:45:08");
        LocalDateTime parseTime = LocalDateTime.from(temporalAccessor);
        System.out.println(formatter.format(parseTime));
    }
}
