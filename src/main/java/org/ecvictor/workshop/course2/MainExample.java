package org.ecvictor.workshop.course2;

/**
 * Created by caoc on 3/11/17.
 * Copyright (c) 2015 Service ECVictor Inc. All rights reserved.
 */

public class MainExample {
    public static void main(String[] args) {

        Bicycle bicycle = new Bicycle(1, 2, 3);
        bicycle.setCadence(5);
        System.out.println(bicycle.getCadence());
    }
}
