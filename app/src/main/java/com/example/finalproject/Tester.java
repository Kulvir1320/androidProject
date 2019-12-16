package com.example.finalproject;

public class Tester extends Employee {
    private int nbBugs;
    private final int GAIN_FACTOR_PROJECTS = 200;

    public Tester(String name, int id, int birthYear, int monthlySalary, double rate, Vehicle vehicle, int nbBugs) {
        super(name, id, birthYear, monthlySalary, rate, vehicle);
        this.nbBugs = nbBugs;
    }

    public Tester(String name, int id, int birthYear, int monthlySalary, Vehicle vehicle, int nbBugs) {
        super(name, id, birthYear, monthlySalary, vehicle);
        this.nbBugs = nbBugs;
    }

    @Override
    public double annualIncome() {
        return super.annualIncome() +(nbBugs * GAIN_FACTOR_PROJECTS);
    }


    @Override
    public String allDescription() {

        String des = super.allDescription()+", a Tester \n" + " Age:" + super.getAge() + "\n";
        des += "Employee has a" + super.getVehicle().details() + "\n" + "Occupation rate: " + super.getRate()
                + "%n" + "Annual income : " + "$" +super.annualIncome() +"\n"+ "He/She has brought "+
                nbBugs +"new clients";
        return des;




    }
}
