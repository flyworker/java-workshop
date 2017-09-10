package com.ecvlearning.java.oop;

public class ElectricalCar extends AbstractAuto{

    @Override
    public void startEngine() {
        System.out.println("Start Electrical engine!");
    }

    public void recharge(){
        System.out.println("Recharge!");
    }
}
