package com.ecvlearning.java.adb;

public class DBFactory {
    public static final String READ = "Read";
    public static final String MOD = "Mod";

    public static AwesomeDB createDB(String type){
        if(READ.equals(type)){
            return new AwesomeDBReadImpl();
        }else if(MOD.equals(type)){
            return new AwesomeDBModImpl();
        }else{
            return null;
        }
    }
}
