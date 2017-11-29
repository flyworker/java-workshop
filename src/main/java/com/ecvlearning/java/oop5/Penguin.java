package com.ecvlearning.java.oop5;


public class Penguin extends Bird {


    Penguin(String name) {
        super(name);
    }

    public Penguin(String name, boolean hasFeather) {
        super(name, hasFeather);
    }

    @Override
    public double speed() {
        return 10.0;
    }

    @Override
    public void fly() {
        System.out.println("I can fly");
    }


    public void swim(){
        System.out.println("I can swim.");
    }
}
