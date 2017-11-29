package com.ecvlearning.java.oop5;

public class Main {
    public static void main(String[] args) {
//        Student jim = new Student();
//       System.out.println(jim.isMale);
//        Bird bird=new Bird("",true);
        String[] names = {"jim", "mary", "john"};


        for (String name : names)
            printHello(name);
        double result = calculation(3, 4, 5, 1000);
        System.out.println("The result is: " + result);
        System.out.println("The result is: " + calculation(3, 4, 7, 5000));

    }

    private static boolean printHello(String name) {
        System.out.println("Hello world: " + name);
        return true;
    }

    private static double calculation(double a, double b, double c, double y) {
        //y=a * x * x + b * x + c
        double x = 0;


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
//            System.out.println(xRange);

            while (x < xRange) {
                count++;
                tempY = a * x * x + b * x + c;

                if ((tempY - y <= accuracy) && (tempY - y >= -accuracy)) {
                    System.out.println("Found the x: " + x + " tempY=" + tempY);
                    return x;
                } else {
                    x += 0.01;
//                    System.out.println("Did not found the x: " + x + " tempY=" + tempY);
                }
            }
        }
        return x;
    }


}
