package com.ecvlearning.java.oop;

public class StringHelper {
    public static boolean isEmptyString(String str){
        if(str == null || "".equals(str)){
            return true;
        }else{
            return false;
        }
    }
}
