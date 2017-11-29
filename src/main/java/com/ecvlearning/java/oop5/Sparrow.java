package com.ecvlearning.java.oop5;

public class Sparrow extends Bird {

    public Sparrow(String name) {
        super(name);
        this.name = name;
    }


    @Override
    public double speed() {
        return 50.0;
    }

    public void fly() {
        System.out.println(this.name + " can fly.");
    }


}
