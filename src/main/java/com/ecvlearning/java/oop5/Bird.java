package com.ecvlearning.java.oop5;


public abstract class Bird implements Fly {
    Bird(String name) {
        this.name = name;
    }

    public Bird(String name, boolean hasFeather) {
        this.name = name;
        this.hasFeather = hasFeather;
    }

    public boolean isHasFeather() {
        return hasFeather;
    }

    public String getName() {
        return name;
    }

    protected String name;
    private boolean hasFeather;


    public void spawnEgg() {
        System.out.println(name + " lays an egg.");
    }


    @Override
    public String toString() {
        return "Bird{" +
                "name='" + name + '\'' +
                ", hasFeather=" + hasFeather +
                '}';
    }

}
