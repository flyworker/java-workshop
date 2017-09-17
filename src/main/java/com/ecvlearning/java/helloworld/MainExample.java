package com.ecvlearning.java.helloworld;

public class MainExample {
    public static void main(String[] args){
//        String helloworld = "Hello world!";
//        System.out.println(helloworld);
//
//        boolean isPerfect = true;
//        isPerfect = false;
//
//        int a = 10;
//        System.out.println(a);
//        System.out.println(10);
//
//        float b =2.2f;
//        System.out.println(b);
//
//        boolean result = a < b;
//        System.out.println(result);
//
//        boolean logicalResult = result && isPerfect;
//        System.out.println(logicalResult);
//
//        logicalResult = (true && !result) && isPerfect;
//        System.out.println(logicalResult);
//
//        int value = (10+15)*22;
//
//        int testValue1 = 15;
//        int testValue2 = 6;
////        testValue2 = testValue1 + testValue2;
//        testValue2 += testValue1;
//        System.out.println(testValue2);


        String skewer = "Yang rou chuan";
        String skewer2 = "Yang rou chuan";
        System.out.println(skewer.length());
        System.out.println(skewer + " ji xin");
        String mixedSkewer = skewer + " ji xin";
        System.out.println(mixedSkewer.substring(14));

        int a = 10;
        int b = 10;
        System.out.println(a==b);
//        System.out.println(skewer == skewer2);
        System.out.println(skewer.equals(skewer2));

        System.out.println(skewer.indexOf("r"));

        String[] chars = mixedSkewer.split("");
        for(String char1:chars){
            System.out.println(char1);
        }
    }
}
