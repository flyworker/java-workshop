package org.concordia.workshop.course4.oo_design;

/**
 * Created by ccao on 3/19/17.
 */
public class Blueberry extends Fruit implements Pricing {
    Blueberry() {
        System.out.print("I am an Blueberry.  ");
    }

    public boolean isFromTree() {
        System.out.println("Get from vines  ");
        return false;
    }

    public void setPrice() {
//        price = 0.78;
    }
}
