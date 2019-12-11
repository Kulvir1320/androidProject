package com.example.finalproject;

import java.util.ArrayList;

public class Employee {

    private String name;
    private int age , birthYear, monthlySalary;
    private double rate;

    public Employee(String name, int age, int birthYear, int monthlySalary, double rate) {
        this.name = name;
        this.age = 2019 - birthYear;
        this.birthYear = birthYear;
        this.monthlySalary = monthlySalary;

        if (rate < 10.0) {

            this.rate = 10.0;

        }
        else if (rate > 100.00){

            this.rate = 100.00;
        }
        else{
            this.rate = rate;
        }
    }


    public Employee(String name, int age, int birthYear, int monthlySalary) {
        this.name = name;
        this.age = 2019 - birthYear;
        this.birthYear = birthYear;
        this.monthlySalary = monthlySalary;
        this.rate = 100.00;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public int getMonthlySalary() {
        return monthlySalary;
    }

    public double getRate() {
        return rate;
    }

    public static ArrayList<Employee> allEmployees = new ArrayList<>();
}
