package com.ecvlearning.java.multithreading;

public class UserRequestRunnable implements Runnable{

    public int count = 0;


    @Override
    public void run() {
        System.out.println("User "+Thread.currentThread().getName()+" is logged!");
        for(int i=0;i<100000000;i++){
            this.plus();

        }
    }

    private void plus(){
//        SharedResources.count = SharedResources.count + 1;
        this.count = this.count + 1;
    }



    public static void main(String[] args) throws InterruptedException {
        UserRequestRunnable urr = new UserRequestRunnable();

        Thread userRequest = new Thread(urr);
        Thread userRequest2 = new Thread(urr);
        Thread userRequest3 = new Thread(urr);
        userRequest.start();
        userRequest2.start();
        userRequest3.start();

//        Thread userRequest4 = new Thread(urr);
//        userRequest4.start();
//
//        Thread userRequest5 = new Thread(urr);
//        Thread userRequest6 = new Thread(urr);
//        Thread userRequest7 = new Thread(urr);
//
//        userRequest5.start();
//        userRequest6.start();
//        userRequest7.start();

        userRequest.join();
        userRequest2.join();
        userRequest3.join();
//        userRequest4.join();
//        userRequest5.join();
//        userRequest6.join();
//        userRequest7.join();
        System.out.println(urr.count);
        //waiting
    }
}
