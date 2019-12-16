package com.example.finalproject;

public class Car extends Vehicle {
    private String type;

    public Car(String make, String plate, String color, String type) {
        super(make, plate, color);
        this.type = type;
    }
    @Override
    public String details() {


        String desc = super.details() + "motorcycle \n" + "-Model:" + super.getMake() +"\n"
                +"-Plate:" + super.getPlate()+"\n" + "-Color:" + super.getColor() +"\n";
        desc += "-" + type;
        return desc;
    }
}
