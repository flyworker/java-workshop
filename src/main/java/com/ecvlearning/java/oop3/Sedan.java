package com.ecvlearning.java.oop3;

public class Sedan extends AbstractVehicle {
    @Override
    public void moveForward() {
        VehicleHelper.moveForward();
    }

    @Override
    public void startEngine(String key) {
        System.out.println("Sedan engine started! "+key);
    }

    @Override
    public void stopEngine() {
        System.out.println("Sedan engine stopped! ");
    }
}
