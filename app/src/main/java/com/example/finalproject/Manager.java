package com.example.finalproject;

public class Manager extends Employee {
    private int nbClients;
    private final int GAIN_FACTOR_CLIENT = 500;

    public Manager(String name, int id, int birthYear, int monthlySalary, double rate, Vehicle vehicle, int nbClients) {
        super(name, id, birthYear, monthlySalary, rate, vehicle);
        this.nbClients = nbClients;
    }

    public Manager(String name, int id, int birthYear, int monthlySalary, Vehicle vehicle, int nbClients) {
        super(name, id, birthYear, monthlySalary, vehicle);
        this.nbClients = nbClients;
    }

    @Override
    public double annualIncome() {
        return super.annualIncome() + (nbClients * GAIN_FACTOR_CLIENT);
    }

    @Override
    public String allDescription() {

        String des = super.allDescription()+", a Manager \n" + " Age:" + super.getAge() + "\n";
        des += "Employee has a" + super.getVehicle().details() + "\n" + "Occupation rate: " + super.getRate()
                + "%n" + "Annual income : " + "$" +super.annualIncome() +"\n"+ "He/She has brought "+
                nbClients +"new clients";
        return des;




    }
}
