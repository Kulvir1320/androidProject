package com.example.finalproject;

public class Tester extends Employee {
    private int nbBugs;

    public Tester(String name, int age, int birthYear, int monthlySalary, double rate, Vehicle vehicle, int nbBugs) {
        super(name, age, birthYear, monthlySalary, rate, vehicle);
        this.nbBugs = nbBugs;
    }

    public Tester(String name, int age, int birthYear, int monthlySalary, Vehicle vehicle, int nbBugs) {
        super(name, age, birthYear, monthlySalary, vehicle);
        this.nbBugs = nbBugs;
    }
}
