package com.example.finalproject;

public class Vehicle {

    private String make, plate, color, category;

    public Vehicle(String make, String plate, String color, String category) {
        this.make = make;
        this.plate = plate;
        this.color = color;
        this.category = category;
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

    public String getCategory() {
        return category;
    }
}
