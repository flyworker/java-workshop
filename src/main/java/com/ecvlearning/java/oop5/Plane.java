package com.ecvlearning.java.oop5;


public class Plane implements Fly {
    Plane(String name) {
        this.name = name;
    }

    public Plane(String name, boolean hasFeather) {
        this.name = name;
        this.hasFeather = hasFeather;
    }

    public String getName() {
        return name;
    }

    protected String name;
    private boolean hasFeather;


    @Override
    public String toString() {
        return "Bird{" +
                "name='" + name + '\'' +
                ", hasFeather=" + hasFeather +
                '}';
    }

    @Override
    public double speed() {
        return 200;
    }

    @Override
    public void fly() {
        System.out.println("I can fly. i am using gas.");
        System.out.println("My limit is: "+ limit);
    }
}
