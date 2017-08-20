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
public class ExerciseAnswer {


    public static final int DISTANCE_LIMIT = 10000;

    public static void main(String[] args) {
        //Create an object
        Bicycle escape = new Bicycle();
        escape.setBrandName("Escape 2013");
        escape.setColor("Silver");
        escape.setManufacture("Ford");
        escape.setCreatedDate("2013-08-08");
        System.out.println(escape);


        System.out.println(escape.getBrandName() + " is Created.");
        int count = 1;
        while (!escape.isRetired()) {
            Distance distance = new Distance();

            Random ran = new Random();
//            int newDistance = ran.nextInt(DISTANCE_LIMIT);
            int newDistance = DISTANCE_LIMIT;
            distance.setQuantity(newDistance);
            distance.setUnit(Unit.MILE);
            System.out.println(escape.getDistance());

            escape.addDrivingDistance(distance);
            count++;
        }

        if (escape.isRetired())
            System.out.println(escape
                    + " is Retired."
                    + "It travels "
                    + count + " times.");


    }

}
