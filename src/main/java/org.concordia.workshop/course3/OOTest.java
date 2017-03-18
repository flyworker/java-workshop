package org.concordia.workshop.course3;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by ccao on 3/18/17.
 */
public class OOTest {
    static class Fruit {
        //...
    }

    static class Apple extends Fruit {
        //...
    }

    static class Orange extends Fruit {
        //...
    }


    public static void main(String[] args) {
        Collection<Object> coll = new ArrayList<Object>();

        Apple app1 = new Apple();
        Apple app2 = new Apple();
        coll.add(app1);
        coll.add(app2);

        Orange or1 = new Orange();
        Orange or2 = new Orange();
        coll.add(or1);
        coll.add(or2);

        Fruit x = new Apple();
        Fruit y = new Orange();
        coll.add(x);
        coll.add(y);
        printColl(coll);
    }

    private static void printColl(Collection<?> coll) {
        for (Object obj : coll) {
            if (obj instanceof Object) {
                System.out.print("It is a Java Object and");
            }
            if (obj instanceof Fruit) {
                System.out.print("It is a Fruit and");
            }
            if (obj instanceof Apple) {
                System.out.println("it is an Apple");
            }
            if (obj instanceof Orange) {
                System.out.println("it is an Orange");
            }
        }
    }

}
