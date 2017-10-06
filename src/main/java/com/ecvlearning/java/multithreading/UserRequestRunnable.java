package com.ecvlearning.java.multithreading;

public class UserRequestRunnable implements Runnable{

    public int count = 0;


    @Override
    public void run() {
        System.out.println("User "+Thread.currentThread().getName()+" is logged!");
        for(int i=0;i<100000000;i++){
//            Thread.sleep(1000);
            this.plus();
        }
    }

    private synchronized void plus(){
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

        userRequest.join();
        userRequest2.join();
        userRequest3.join();

        System.out.println(urr.count);
        //waiting
    }
}
