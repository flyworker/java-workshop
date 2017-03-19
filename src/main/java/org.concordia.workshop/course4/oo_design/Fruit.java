package org.concordia.workshop.course4.oo_design;

/**
 * Created by ccao on 3/19/17.
 */
public abstract class Fruit {
    private double price;
    boolean isEatable() {
        return true;
    }

    public String getName() {
        return name;
    }

    void setName(String name) {
        this.name = name;
    }

    private String name;

}
