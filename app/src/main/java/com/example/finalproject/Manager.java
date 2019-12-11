package com.example.finalproject;

public class Manager extends Employee {
    private int nbClients;

    public Manager(String name, int age, int birthYear, int monthlySalary, double rate, Vehicle vehicle, int nbClients) {
        super(name, age, birthYear, monthlySalary, rate, vehicle);
        this.nbClients = nbClients;
    }

    public Manager(String name, int age, int birthYear, int monthlySalary, Vehicle vehicle, int nbClients) {
        super(name, age, birthYear, monthlySalary, vehicle);
        this.nbClients = nbClients;
    }
}
