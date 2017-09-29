package com.ecvlearning.java.oop3;

public abstract class AbstractVehicle implements Vehicle{
//    public void moveForward(){
//        System.out.println("Move forward!");
//    }
    public void moveBackward(){
        System.out.println("Move backward!");
    }
    public void turnLeft(){
        System.out.println("Turn left!");
    }
    public void turnRight(){
        System.out.println("Turn right!");
    }

    public abstract void startEngine(String key);
}
