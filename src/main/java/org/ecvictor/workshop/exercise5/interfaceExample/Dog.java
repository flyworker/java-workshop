package org.ecvictor.workshop.exercise5.interfaceExample;

/**
 * Created by ccao on 2017-08-26.
 */
public class Dog extends Animal implements DogBehavior {

    public void bark() {
        System.out.println("woof");
    }

    public void speak() {

    }
}
