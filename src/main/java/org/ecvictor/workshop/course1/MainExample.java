package org.ecvictor.workshop.course1;

/**
 * Created by caoc on 3/11/17.
 * Copyright (c) 2015 Service ECVictor Inc. All rights reserved.
 */

public class MainExample {
    public static void main(String[] args) {
        //y=a * x * x + b * x + c
        double a, b, c, x, y;
        a = 3;
        b = 4;
        c = 5;
        //find x when y=5.6
        y = 1000000;


        int count = 0;
        double accuracy = 0.001 * y;
        // we want to use dynamic range for x
        // range start from 10, then 50 , then 100,then 1000 if not found the x
        //we could set a range array to iterate. Then we go throuhg the array
        //for each item in array , we will perform the same action

//        int[] rangeArray = {10, 50, 100, 1000};
        int step = 2;
        boolean found = false;
        double tempY;
        //xrange start from 10. multiple by 2 each loop. x not bigger than Double.MAX_VALUE.
        for (int xRange = 10; xRange < 32767; xRange = xRange * step) {
            x = -xRange;
            System.out.println(xRange);
            if (!found) {
                while (x < xRange) {
                    count++;
                    tempY = a * x * x + b * x + c;

                    if ((tempY - y <= accuracy) && (tempY - y >= -accuracy)) {
                        System.out.println("Found the x: " + x + " tempY=" + tempY);
                        found = true;
                        break;
                    } else {
                        x += 0.01;
                        System.out.println("Did not found the x: " + x + " tempY=" + tempY);
                    }

                }

            } else break;

        }
        System.out.println(count);
    }
}
