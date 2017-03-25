package org.concordia.workshop.course4;

/**
 * Created by ccao on 3/19/17.
 */
public class MyNewException extends RuntimeException {
    int anInt;
    float aFloat;

    public MyNewException(){
        super();
    }

    public MyNewException(String message){
        super(message);
    }
}

