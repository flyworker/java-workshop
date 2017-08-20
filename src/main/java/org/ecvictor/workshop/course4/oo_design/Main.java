package org.ecvictor.workshop.course4.oo_design;

/**
 * Created by ccao on 2017-08-19.
 */


import java.util.Random;

/**
 * Create a car factory.
 * Color, type, manufacture , created date, distance,
 * Create two type of cars: e.g. escape, carola.
 * init a 0km driving distance.
 * <p>
 * We want to have those functions:
 * Add traveling distance until it is retired.
 * <p>
 * <p>
 * The car will be retired after 200,000km.
 */
public class Main {


    public static final int DISTANCE_LIMIT = 100;

    public static void main(String[] args) {
        runBicycle();
        runTandemBicycle();
    }

    private static void runTandemBicycle() {
        System.out.println("############################################");
        //Create an object
        Bicycle tandemBicycle = new TandemBicycle();
        tandemBicycle.setBrandName("Giant Tandem Bicycle");
        tandemBicycle.setColor("Silver");
        tandemBicycle.setManufacture("Giant");
        tandemBicycle.setCreatedDate("2013-08-08");
        System.out.println(tandemBicycle);


        System.out.println(tandemBicycle.getBrandName() + " is Created.");
        int count = 1;
        while (!tandemBicycle.isRetired()) {
            Distance distance = new Distance();

            Random ran = new Random();
//            int newDistance = ran.nextInt(DISTANCE_LIMIT);
            int newDistance = DISTANCE_LIMIT;
            distance.setQuantity(newDistance);
            distance.setUnit(Unit.MILE);
            System.out.println(tandemBicycle.getDistance());

            tandemBicycle.addDrivingDistance(distance);
            count++;
        }

        if (tandemBicycle.isRetired())
            System.out.println(tandemBicycle
                    + " is Retired."
                    + " It travels "
                    + count + " times.");
    }

    private static void runBicycle() {
        System.out.println("############################################");
        //Create an object
        Bicycle bicycle = new Bicycle();
        bicycle.setBrandName("Giant Bicycle 2013");
        bicycle.setColor("Silver");
        bicycle.setManufacture("Giant");
        bicycle.setCreatedDate("2013-08-08");
        System.out.println(bicycle);


        System.out.println(bicycle.getBrandName() + " is Created.");
        int count = 1;
        while (!bicycle.isRetired()) {
            Distance distance = new Distance();

            Random ran = new Random();
//            int newDistance = ran.nextInt(DISTANCE_LIMIT);
            int newDistance = DISTANCE_LIMIT;
            distance.setQuantity(newDistance);
            distance.setUnit(Unit.MILE);
            System.out.println(bicycle.getDistance());

            bicycle.addDrivingDistance(distance);
            count++;
        }

        if (bicycle.isRetired())
            System.out.println(bicycle
                    + " is Retired."
                    + " It travels "
                    + count + " times.");

    }

}
