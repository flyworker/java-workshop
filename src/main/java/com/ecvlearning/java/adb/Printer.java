package com.ecvlearning.java.adb;

public class Printer {
    public void printTable(AwesomeDB adb){
        System.out.println("Number of rows/records: "+adb.size());
        for(int i=0;i<adb.size();i++) {
            System.out.println(adb.select(Constants.ID) + " " + adb.select(Constants.NAME) + " "+ adb.select(Constants.Gender)+" "+ adb.select(Constants.DATE_CREATED));
            adb.next();
        }
    }
}
