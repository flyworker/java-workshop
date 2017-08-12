package org.ecvictor.workshop.course1;

/**
 * Created by caoc on 3/11/17.
 * Copyright (c) 2015 Service ECVictor Inc. All rights reserved.
 */
public class MCFICIB {
    static int x = 10;

    static double temp = 98.6;

    static
    {
        System.out.println("x = " + x);
        temp = (temp - 32) * 5.0/9.0; // convert to Celsius
        System.out.println("temp = " + temp);
    }

    static int y = x + 5;

    static
    {
        System.out.println("y = " + y);
    }

    public static void main(String[] args)
    {
    }
}
