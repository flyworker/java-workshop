package org.concordia.workshop.course1;

/**
 * Created by caoc on 3/11/17.
 * Copyright (c) 2015 Service ECVictor Inc. All rights reserved.
 */
public class Initializing {
    static double[] sines, cosines;
    static
    {
        sines = new double[360];
        cosines = new double[360];
        for (int i = 0; i < sines.length; i++)
        {
            sines[i] = Math.sin(Math.toRadians(i));
            cosines[i] = Math.cos(Math.toRadians(i));
        }
    }

    public static void main(String[] args) {
        String hello = "Hello World!";
//        String helloWorld = "Hello World!";
//
//        int length = helloWorld.length();
//        for (int i = 0; i < helloWorld.length(); i++) {
//            length++;
//        }
        System.out.println(hello);
    }
}
