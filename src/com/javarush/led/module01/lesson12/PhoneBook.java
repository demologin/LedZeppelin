package com.javarush.led.module01.lesson12;

import java.util.Arrays;

public class PhoneBook {

    private final Phone[][] phones = new Phone[16][0];


    public boolean add(Phone phone) {
        if (this.contains(phone)) {
            return false;
        } else {
            int hashCode = phone.hashCode();
            int bucketNumber = hashCode % phones.length;
            Phone[] row = phones[bucketNumber];
            phones[bucketNumber] = Arrays.copyOf(row, row.length + 1);
            phones[bucketNumber][row.length] = phone;
            return true;
        }
    }

    public boolean contains(Phone phone) {
        int hashCode = phone.hashCode();
        int bucketNumber = hashCode % phones.length;
        Phone[] row = phones[bucketNumber];
        for (Phone phoneInBucket : row) {
            if (phoneInBucket.equals(phone)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        StringBuilder out = new StringBuilder();
        for (Phone[] row : phones) {
            for (Phone phone : row) {
                out.append(phone);
                out.append("\n");
            }
        }
        return out.toString();
    }
}
