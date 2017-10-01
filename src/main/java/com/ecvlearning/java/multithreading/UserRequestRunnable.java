package com.ecvlearning.java.multithreading;

public class UserRequestRunnable implements Runnable{
    @Override
    public void run() {
        System.out.println("User "+Thread.currentThread().getName()+" is logged!");
        for(int i=0;i<10000;i++){
//            try {
//                Thread.sleep(1);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }

            this.plus();
        }
    }

    private synchronized void plus(){
        SharedResources.count = SharedResources.count + 1;
    }


    public static void main(String[] args){
        Thread userRequest = new Thread(new UserRequestRunnable());
        userRequest.start();

        Thread userRequest2 = new Thread(new UserRequestRunnable());
        userRequest2.start();

        Thread userRequest3 = new Thread(new UserRequestRunnable());
        userRequest3.start();

        Thread userRequest4 = new Thread(new UserRequestRunnable());
        userRequest4.start();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(SharedResources.count);
        //waiting
    }
}
