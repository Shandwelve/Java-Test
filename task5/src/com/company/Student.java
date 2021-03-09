package com.company;

import org.jetbrains.annotations.NotNull;

public class Student {

    protected String name;

    protected int age;

    protected String registrationNumber;

    protected double marksAverage;

    public Student(String name, int age, String registrationNumber, double marksAverage ) {
        this.name = name;
        this.age = age;
        this.registrationNumber = registrationNumber;
        this.marksAverage = marksAverage;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public String getRegistrationNumber() {
        return this.registrationNumber;
    }

    public double getMarksAverage() {
        return this.marksAverage;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public void setMarksAverage(float marksAverage) {
        this.marksAverage = marksAverage;
    }

    public String say(@NotNull String dayPeriod) {
        return switch (dayPeriod) {
            case ("morning") -> "Good Morning";
            case ("day") -> "Hello";
            case ("evening") -> "Good evening";
            case ("night") -> "Good night";
            default -> "I don't know what to say";
        };
    }

    public boolean getAScholarship() {
        return this.marksAverage >= 7;
    }
}
