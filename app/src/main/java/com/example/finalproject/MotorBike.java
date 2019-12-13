package com.example.finalproject;

public class MotorBike extends Vehicle {
    private boolean sidecar;

    public MotorBike(String make, String plate, String color, boolean sidecar) {
        super(make, plate, color);
        this.sidecar = sidecar;
    }
}
