package com.example.finalproject;

public class Programmer extends Employee {
    private int nbProjects;
    private final int GAIN_FACTOR_CILENT = 10;

    public Programmer(String name, int birthYear, int monthlySalary, double rate, Vehicle vehicle, int nbProjects) {
        super(name, birthYear, monthlySalary, rate, vehicle);
        this.nbProjects = nbProjects;
    }

    public Programmer(String name, int birthYear, int monthlySalary, Vehicle vehicle, int nbProjects) {
        super(name, birthYear, monthlySalary, vehicle);
        this.nbProjects = nbProjects;
    }

    @Override
    public double annualIncome() {
        return super.annualIncome() + (nbProjects + GAIN_FACTOR_CILENT);
    }
}
