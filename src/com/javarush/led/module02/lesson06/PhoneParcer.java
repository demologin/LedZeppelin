package com.javarush.led.module02.lesson06;

import java.util.Arrays;
import java.util.Comparator;

public class PhoneParcer {
    public static void main(String[] args) {
        var phones = Arrays
                .stream(Data.text.split("\n"))
                .parallel()
                .map(String::trim)
                .filter(s -> !s.trim().isEmpty())
                .map(s -> s.replace(',', '.'))
                .map(line -> line.split("\\s+"))
                .map(PhoneParcer::getPhone)
                .sorted(getPhoneComparator())
                .filter(p -> p.getFullPrice() > 10)
                .toList();
        var optionalPhone = phones
                .stream()
                .findFirst();

        System.out.println(optionalPhone.orElseThrow(() -> new RuntimeException("no phone found")));

    }

    private static Phone getPhone(String[] stringData) {
        return new Phone(
                stringData[1],
                String.join(" ", Arrays.copyOfRange(stringData, 1, stringData.length - 4)),
                stringData[stringData.length - 4],
                stringData[stringData.length - 3],
                Double.parseDouble(stringData[stringData.length - 2]),
                Double.parseDouble(stringData[stringData.length - 1])
        );
    }

    private static Comparator<Phone> getPhoneComparator() {
        return (p1, p2) -> ((int) p2.getFullPrice() * 100) - ((int) p1.getFullPrice() * 100);
    }

}
