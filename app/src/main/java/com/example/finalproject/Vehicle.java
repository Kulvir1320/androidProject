package com.example.finalproject;

public class Vehicle {

    private String make, plate, color;

    public Vehicle(String make, String plate, String color) {
        this.make = make;
        this.plate = plate;
        this.color = color;

    }

    public String getMake() {
        return make;
    }

    public String getPlate() {
        return plate;
    }

    public String getColor() {
        return color;
    }

}
