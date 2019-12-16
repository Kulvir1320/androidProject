package com.example.finalproject;

public class MotorBike extends Vehicle {
    private boolean sidecar;


    public MotorBike(String make, String plate, String color, boolean sidecar) {
        super(make, plate, color);
        this.sidecar = sidecar;
    }

    public String isSidecar() {
        if(sidecar){
            return "without sidecar";
        }
        else {
            return "without a sidecar";
        }
    }

    @Override
    public String details() {


        String desc = super.details() + "motorcycle \n" + "-Model:" + super.getMake() +"\n"
                +"-Plate:" + super.getPlate()+"\n" + "-Color:" + super.getColor() +"\n";
        desc += "-" + isSidecar();
        return desc;
    }
}
