package com.ecvlearning.java.oop3;

public class Truck extends AbstractVehicle {
    @Override
    public void moveForward() {
        VehicleHelper.moveForward();
    }

    @Override
    public void startEngine(String key) {
        System.out.println("Truck engine started! "+key);
    }

    @Override
    public void stopEngine() {
        System.out.println("Truck engine stopped! ");
    }
}
