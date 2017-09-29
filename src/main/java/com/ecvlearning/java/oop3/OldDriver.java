package com.ecvlearning.java.oop3;

public class OldDriver implements Driver{
    @Override
    public void drive(Vehicle v, String key) {
        v.startEngine(key);
        v.moveForward();
        v.turnLeft();
        v.turnRight();
        System.out.println("Drifting to parking spot!");
        v.stopEngine();
    }
}
