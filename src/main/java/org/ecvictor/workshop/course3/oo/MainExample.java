package org.ecvictor.workshop.course3.oo;

import org.ecvictor.workshop.course2.Bicycle;

/**
 * Created by caoc on 3/11/17.
 * Copyright (c) 2015 Service ECVictor Inc. All rights reserved.
 */

public class MainExample {
    public static void main(String[] args) {
        PermanentResident charlesNoConstructor = new PermanentResident();

        PermanentResident charles = new PermanentResident("Charles", 0, "1985-04-06");
        charles.setNation("Chinese");

        PermanentResident raj = new PermanentResident("Raj", 0, "1985-04-10");
        raj.setNation("Indian");


//        System.out.println("Is Charles Chinese?  " + charles.isChinese());
        System.out.println("Is Raj Chinese?  " + raj.isChinese());
        System.out.println(charles.getNation());
    }
}
