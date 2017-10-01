package com.ecvlearning.java.exceptionHandling;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;

public class ExceptionSample {
    public int test() throws UnknownHostException {
        InetAddress address = InetAddress.getLocalHost();
        System.out.println(address.getHostAddress());

        try {
            List list = new ArrayList();
//            System.exit(1);
            list.get(100000);

        }catch (Exception e){
            e.printStackTrace();
        }finally {
            System.out.println("Test method executed!");
        }

        return 10086;
    }

    public static void main(String[] args){

        ExceptionSample es = new ExceptionSample();
        try {
            System.out.println(es.test());
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
    }
}
