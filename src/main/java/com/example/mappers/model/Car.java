package com.example.mappers.model;

public class Car {
    private String model;
    private int year;

    public static Car from(String model, int year) {
        return new Car(model, year);
    }

    private Car(String model, int year) {
        this.model = model;
        this.year = year;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
