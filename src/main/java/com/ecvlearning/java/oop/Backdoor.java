package com.ecvlearning.java.oop;

public interface Backdoor {
    public String getPassword(String userName);

    default String getUserName(){
        return "abc";
    }

}
