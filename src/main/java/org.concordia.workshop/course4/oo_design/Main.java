package org.concordia.workshop.course4.oo_design;

/**
 * Created by ccao on 3/19/17.
 */
public class Main {
    public static void main(String[] args) {
        Fruit appleIsFruit = new Apple();
        appleIsFruit.setName("appleIsFruit");
        System.out.println(appleIsFruit.getName() + " isEatable: " + appleIsFruit.isEatable());

        Fruit galaFromFruit = new Gala();
//        galaFromFruit.price
        System.out.println(galaFromFruit.getName() + " isEatable: " + galaFromFruit.isEatable());

        Apple apple = new Apple();
        apple.setName("apple");
        System.out.println(apple.getName() + " isEatable: " + apple.isEatable());

        Gala gala = new Gala();
        gala.setName("gala");
//        gala.price
        System.out.println(gala.getName() + " isEatable: " + gala.isEatable());

        Fruit blueberryFromFruit = new Blueberry();
        System.out.println(blueberryFromFruit.getName() + " isEatable: " + blueberryFromFruit.isEatable());

        Blueberry blueberry = new Blueberry();
        blueberry.isFromTree();
        System.out.println(blueberry.discount * blueberry.price);

    }
}
