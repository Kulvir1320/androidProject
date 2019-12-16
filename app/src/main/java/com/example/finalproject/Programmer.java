package com.example.finalproject;

public class Programmer extends Employee {
    private int nbProjects;
    private final int GAIN_FACTOR_CILENT = 10;

    public Programmer(String name, int id, int birthYear, int monthlySalary, double rate, Vehicle vehicle, int nbProjects) {
        super(name, id, birthYear, monthlySalary, rate, vehicle);
        this.nbProjects = nbProjects;
    }

    public Programmer(String name, int id, int birthYear, int monthlySalary, Vehicle vehicle, int nbProjects) {
        super(name, id, birthYear, monthlySalary, vehicle);
        this.nbProjects = nbProjects;
    }

    @Override
    public double annualIncome() {
        return super.annualIncome() + (nbProjects * GAIN_FACTOR_CILENT);
    }
    @Override
    public String allDescription() {

        String des = super.allDescription()+", a Tester \n" + " Age:" + super.getAge() + "\n";
        des += "Employee has a" + super.getVehicle().details() + "\n" + "Occupation rate: " + super.getRate()
                + "%n" + "Annual income : " + "$" +super.annualIncome() +"\n"+ "He/She has brought "+
                nbProjects +"new clients";
        return des;




    }
}
