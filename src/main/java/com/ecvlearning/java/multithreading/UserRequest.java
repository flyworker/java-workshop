package com.ecvlearning.java.multithreading;

public class UserRequest extends Thread{

    /**
     * multithreading method
     */
    public void run(){
        System.out.println("User "+Thread.currentThread().getName()+" is logged!");
        for(int i=0;i<10000;i++){
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            SharedResources.count = SharedResources.count+1;
        }
    }

    public static void main(String[] args){
        UserRequest userRequest = new UserRequest();
        userRequest.start();

        Thread userRequest2 = new UserRequest();
        userRequest2.start();

        Thread userRequest3 = new UserRequest();
        userRequest3.start();

        Thread userRequest4 = new UserRequest();
        userRequest4.start();

//        try {
//            Thread.sleep(1);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        System.out.println(SharedResources.count);
        //waiting
    }
}
