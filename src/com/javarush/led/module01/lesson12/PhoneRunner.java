package com.javarush.led.module01.lesson12;

import java.util.Scanner;

public class PhoneRunner {
    public static void main(String[] args) {
        String input = """
                +375 33 1234567
                +7 495 1234567
                +48 34 7654321
                +1 234 1234567
                +7 495 1234567
                end
                """;
        Scanner scanner = new Scanner(input);
        PhoneBook phoneBook = new PhoneBook();
        for (; ; ) {
            String countryCode = scanner.next();
            if (countryCode.equals("end")) {
                break;
            }
            String operatorCode = scanner.next();
            int phoneNumber = scanner.nextInt();
            Phone phone = new Phone(countryCode, operatorCode, phoneNumber);
            boolean add = phoneBook.add(phone);
            if (add) {
                System.out.println("add: " + phone);
            } else {
                System.out.println("skip "+phone);
            }

        }
        System.out.println("=".repeat(71));
        System.out.println(phoneBook);

    }
}
