package com.ecvlearning.java.oop5;

public class BirdMain {

    public static void main(String[] args) {
        Penguin penguin = new Penguin("PP");
        penguin.fly();
        penguin.swim();
        System.out.println(penguin.speed());

        Plane airbus=new Plane("Airbus");
        airbus.fly();
        System.out.println(airbus.speed());
    }
}
