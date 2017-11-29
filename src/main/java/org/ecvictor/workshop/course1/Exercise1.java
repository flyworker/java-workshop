package org.ecvictor.workshop.course1;

/**
 * Created by caoc on 3/12/17.
 * Copyright (c) 2015 Service ECVictor Inc. All rights reserved.
 */
/*
/*
(Summation of a series) Write a program that displays the result of
				1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9.
*/
public class Exercise1 {
    public static void main(String[] args) {

        String helloWolrd = "Hello wolrd!";
        helloWolrd +=  " Sunday";


        System.out.println(helloWolrd.substring(3));
        System.out.println(helloWolrd.replace("o","a"));
        System.out.println("Log:  "+helloWolrd);
        System.out.println(helloWolrd.length());
        System.out.println(helloWolrd.indexOf("a"));
        String[] chars = helloWolrd.split("");
        for(String char1:chars){
            System.out.println(char1);
        }
    }
}
