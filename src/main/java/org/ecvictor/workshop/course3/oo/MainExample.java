package org.ecvictor.workshop.course3.oo;

import org.ecvictor.workshop.course2.Bicycle;

/**
 * Created by caoc on 3/11/17.
 * Copyright (c) 2015 Service ECVictor Inc. All rights reserved.
 */

public class MainExample {
    public static void main(String[] args) {
        PermanentResident charlesNoConstructor = new PermanentResident();

        PermanentResident charles = new PermanentResident();
        charles.setNation("Chinese");


        PermanentResident charles3 = new PermanentResident();
        System.out.println(charles3.getEyeColor());

        charles3.setEyeColor("Brown");
        System.out.println(charles3.getEyeColor());
        System.out.println(PermanentResident.miniteInDay());


        PermanentResident raj = new PermanentResident();
        raj.setName("Raj");
        raj.setNation("Indian");


//        System.out.println("Is Charles Chinese?  " + charles.isChinese());
        System.out.println("Is Raj Chinese?  " + raj.isChinese());


        System.out.println(raj.VISA_TYPE==charles.VISA_TYPE);
    }
}
