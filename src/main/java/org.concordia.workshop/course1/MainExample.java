package org.concordia.workshop.course1;

/**
 * Created by caoc on 3/11/17.
 * Copyright (c) 2015 Service ECVictor Inc. All rights reserved.
 */

public class MainExample {
    public static void main(String[] args) {
        String hello = "Hello World!";
        String helloWorld = "Hello World!";

        int length = helloWorld.length();
        for (int i = 0; i < helloWorld.length(); i++) {
            length++;
        }
        System.out.println(hello.length());
    }
}
