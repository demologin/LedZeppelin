package com.javarush.led.module01.lesson12;

import java.util.Objects;

public class Phone extends Object{

    private String countryCode;
    private String operatorCode;
    private int phoneNumber;

    public Phone() {
    }

    public Phone(String countryCode, String operatorCode, int phoneNumber) {
        this.countryCode = countryCode;
        this.operatorCode = operatorCode;
        this.phoneNumber = phoneNumber;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getOperatorCode() {
        return operatorCode;
    }

    public void setOperatorCode(String operatorCode) {
        this.operatorCode = operatorCode;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Phone otherPhone = (Phone) o;
        return this.phoneNumber == otherPhone.phoneNumber
               && Objects.equals(this.countryCode, otherPhone.countryCode)
               && Objects.equals(this.operatorCode, otherPhone.operatorCode);
    }

    @Override
    public int hashCode() {
        int result = Objects.hashCode(countryCode);
        result = 31 * result + Objects.hashCode(operatorCode);
        result = 31 * result + phoneNumber;
        return result;
    }

    @Override
    public String toString() {
        return "Phone{" +
               "countryCode='" + countryCode + '\'' +
               ", operatorCode='" + operatorCode + '\'' +
               ", phoneNumber='" + phoneNumber + '\'' +
               '}';
    }
}
