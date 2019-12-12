package com.example.finalproject;

public class Manager extends Employee {
    private int nbClients;
    private final int GAIN_FACTOR_CLIENT = 500;

    public Manager(String name, int birthYear, int monthlySalary, double rate, Vehicle vehicle, int nbClients) {
        super(name, birthYear, monthlySalary, rate, vehicle);
        this.nbClients = nbClients;
    }

    public Manager(String name, int birthYear, int monthlySalary, Vehicle vehicle, int nbClients) {
        super(name, birthYear, monthlySalary, vehicle);
        this.nbClients = nbClients;
    }

    @Override
    public double annualIncome() {
        return super.annualIncome() + (nbClients + GAIN_FACTOR_CLIENT);
    }
}
