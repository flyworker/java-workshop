package com.ecvlearning.java.oop3;

public class Learner implements Driver{

    public void drive(Vehicle v, String key){
        v.startEngine(key);
        v.moveForward();
        v.turnLeft();
        v.turnRight();
        v.moveBackward();
        v.stopEngine();
    }
}
