package org.ecvictor.workshop.exercise5.interfaceExample;

/**
 * Created by ccao on 2017-08-26.
 */
public abstract class Animal {
    public void move() {
        System.out.println("Animals can move");
    }

    public boolean isAMammal() {
        return (true);
    }
    abstract public void speak();
}
