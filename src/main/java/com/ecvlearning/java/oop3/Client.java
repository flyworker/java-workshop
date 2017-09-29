package com.ecvlearning.java.oop3;

public class Client {
    public static void main(String[] args){
        String type = args[0];
        Driver driver = DriverFactory.createDriver(type);

        driver.drive(new Sedan(),"BMW");
        driver.drive(new Truck(),"Dongfeng");
    }
}
