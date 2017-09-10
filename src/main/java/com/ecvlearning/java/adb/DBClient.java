package com.ecvlearning.java.adb;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DBClient {
    public static void main(String args[]){
        System.out.println("Underlying database engine: "+args[0]);
        AwesomeDB adb = DBFactory.createDB(args[0]);
        adb.insert(Constants.ID,1);
        adb.insert(Constants.NAME,"Sicong");
        adb.insert(Constants.Gender,"Unkonwn");
        adb.insert(Constants.Age,30);
        adb.insert(Constants.DESCRIPTION,"A rich guy");
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date date = new Date();
        adb.insert(Constants.DATE_CREATED,date);

        System.out.println(adb.select("ID")+" "+adb.select("NAME")+" "+adb.select("DateCreated"));

        adb.next();
        adb.insert(Constants.ID,2);
        adb.insert(Constants.NAME,"Papi");
        adb.insert(Constants.Gender,"Female");
        adb.insert(Constants.Age,30);
        adb.insert(Constants.DESCRIPTION,"A rich girl");
        DateFormat dateFormat2 = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date date2 = new Date();
        adb.insert(Constants.DATE_CREATED,date2);

//        System.out.println(adb.select("ID")+" "+adb.select("NAME")+" "+adb.select("DateCreated")+" "+adb.select("ABC"));

//        adb.update("NAME","Peter");
//        adb.update("ABC","Gotcha!");
//        System.out.println(adb.select("ID")+" "+adb.select("NAME")+" "+adb.select("DateCreated")+" "+adb.select("ABC"));

//        adb.delete("NAME");
//        System.out.println(adb.select("ID")+" "+adb.select("NAME")+" "+adb.select("DateCreated")+" "+adb.select("ABC"));

        System.out.println("*******************************");

        adb.next();
        adb.insert(Constants.ID,3);
        adb.insert(Constants.NAME,"Hanmeimei");
        adb.insert(Constants.Gender,"Female");
        adb.insert(Constants.Age,30);
        adb.insert(Constants.DESCRIPTION,"A girl does not know English");
        DateFormat dateFormat3 = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date date3 = new Date();
        adb.insert(Constants.DESCRIPTION,date3);

        adb.first();
        Printer printer = new Printer();
        printer.printTable(adb);
    }
}
