package com.example.finalproject;

public class Tester extends Employee {
    private int nbBugs;

    public Tester(String name, int birthYear, int monthlySalary, double rate, Vehicle vehicle, int nbBugs) {
        super(name, birthYear, monthlySalary, rate, vehicle);
        this.nbBugs = nbBugs;
    }

    public Tester(String name, int birthYear, int monthlySalary, Vehicle vehicle, int nbBugs) {
        super(name, birthYear, monthlySalary, vehicle);
        this.nbBugs = nbBugs;
    }
}
