package com.ecvlearning.java.oop3;

public interface Vehicle {
    public void moveForward();
    public void moveBackward();
    public void turnLeft();
    public void turnRight();

    public void startEngine(String key);
    public void stopEngine();
}
