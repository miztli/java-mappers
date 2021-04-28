package com.example.mappers.model;

public class User {
    private String name;
    private String email;
    private int age;
    private Car car;

    public static User from(String name, String email,  int age, Car car) {
        return new User(name, email, age, car);
    }

    private User(String name, String email, int age, Car car) {
        this.name = name;
        this.email = email;
        this.age = age;
        this.car = car;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public void setEmail(final String email)
    {
        this.email = email;
    }

    public String getEmail()
    {
        return email;
    }
}
