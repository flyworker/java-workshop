package com.ecvlearning.java.oop3;

public class DriverFactory {
    /**
     * factory method to create instance of Driver
     * @param type
     * @return
     */
    public static Driver createDriver(String type){
        if("learner".equals(type)){
            return new Learner();
        }else{
            return new OldDriver();
        }
    }
}
