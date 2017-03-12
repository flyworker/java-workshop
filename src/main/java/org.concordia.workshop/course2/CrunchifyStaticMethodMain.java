package org.concordia.workshop.course2;

/**
 * Created by caoc on 3/12/17.
 * Copyright (c) 2015 Service ECVictor Inc. All rights reserved.
 */
public class CrunchifyStaticMethodMain {

    public static void main(String args[]) {
        String[] crunchifyObject = new String[3];
        crunchifyObject = new String[] { "Google", "Facebook", "Crunchify" };

        // creating instnace
        CrunchifyStaticMethodMain object = new CrunchifyStaticMethodMain();
        object.crunchifyTestMethod(crunchifyObject);

    }

	/*
	 * Check this out: Let's understand little more...
	 *
	 * Here method crunchifyTestMethod is defined as
	 * public void crunchifyTestMethod(String[])
	 * so it is "non-static". It can't be called unless it is called on an instance of CrunchifyStaticMethodMain.
	 *
	 * If you declared your method as
	 * public static void crunchifyTestMethod(int[])
	 * then you could call: CrunchifyStaticMethodMain.crunchifyTestMethod(arr); within main without having created an instance for it.
	 */

    public void crunchifyTestMethod(String[] crunchifyObject) {
        for (int i = 0; i < crunchifyObject.length; i++)
            System.out.println(crunchifyObject[i]);

    }

}