package com.javarush.led.module02.lesson06;

public class Phone {
    private String vendor;
    private String model;
    private String ram;
    private String color;
    private double discountPrice;
    private double fullPrice;

    public Phone(String vendor, String model, String ram, String color, double discountPrice, double fullPrice) {
        this.vendor = vendor;
        this.model = model;
        this.ram = ram;
        this.color = color;
        this.discountPrice = discountPrice;
        this.fullPrice = fullPrice;
    }

    public String getVendor() {
        return vendor;
    }

    public String getModel() {
        return model;
    }

    public String getRam() {
        return ram;
    }

    public String getColor() {
        return color;
    }

    public double getDiscountPrice() {
        return discountPrice;
    }

    public double getFullPrice() {
        return fullPrice;
    }

    @Override
    public String toString() {
        return "Phone{" +
               "vendor='" + vendor + '\'' +
               ", model='" + model + '\'' +
               ", ram='" + ram + '\'' +
               ", color='" + color + '\'' +
               ", discountPrice=" + discountPrice +
               ", fullPrice=" + fullPrice +
               '}';
    }
}
