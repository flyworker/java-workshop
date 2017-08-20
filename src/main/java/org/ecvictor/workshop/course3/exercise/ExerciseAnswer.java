package org.ecvictor.workshop.course3.exercise;

/**
 * Created by ccao on 2017-08-19.
 */


import java.util.Random;
import java.util.logging.Logger;

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


    public static void main(String[] args) {
        //Create an object
        Car escape = new Car();
        escape.setBrandName("Escape 2013");
        escape.setColor("Silver");
        escape.setType("TandemBicycle");
        escape.setManufacture("Ford");
        escape.setCreatedDate("2013-08-08");
        System.out.println(escape.getBrandName() + " is Created.");
        int count = 1;
        while (!escape.isRetired()) {

            Random ran = new Random();
            int distance = ran.nextInt(10000);

            escape.addDrivingDistance(distance);
            count++;
        }

        if (escape.isRetired())
            System.out.println(escape.getBrandName()
                    + " is Retired."
                    + "It travels "
                    + count + " times.");


    }

}
