package com.example.finalproject;

public class MotorBike extends Vehicle {
    private boolean sidecar;

    public MotorBike(String make, String plate, String color, String category, boolean sidecar) {
        super(make, plate, color, category);
        this.sidecar = sidecar;
    }
}
