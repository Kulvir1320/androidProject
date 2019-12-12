package com.example.finalproject;

import java.io.Serializable;
import java.util.ArrayList;

public class Employee implements Serializable {

    private String name;
    private int age , birthYear, monthlySalary;
    private double rate;
    private Vehicle vehicle;

    public Employee(String name, int birthYear, int monthlySalary, double rate, Vehicle vehicle) {
        this.name = name;

        this.birthYear = birthYear;
        this.age = getAge();
        this.monthlySalary = monthlySalary;
        this.vehicle = vehicle;

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


    public Employee(String name, int birthYear, int monthlySalary, Vehicle vehicle) {
        this.name = name;
        this.birthYear = birthYear;
        this.age = getAge();
        this.monthlySalary = monthlySalary;
        this.rate = 100.00;
        this.vehicle = vehicle;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return 2019 - birthYear;
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
