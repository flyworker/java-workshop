package org.concordia.workshop.course4.oo_design;

import java.awt.peer.SystemTrayPeer;

/**
 * Created by ccao on 3/19/17.
 */
public class Apple extends Fruit {
    Apple() {
        System.out.print("I am an apple  ");
    }

    public boolean isFromTree() {
        System.out.println("Get from tree  ");
        return true;
    }

}
