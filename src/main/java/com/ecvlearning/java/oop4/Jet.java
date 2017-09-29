package com.ecvlearning.java.oop4;



public class Jet implements Airplane{
    private String key;
    private boolean started = false;
    private int attitude = 0;
    public Jet(String key){
        this.key = key;
    }

    public void start(String key){
        if(this.key.equals(key)){
            this.started = true;
            System.out.println("Start Jet Engine!");
        }else{
            System.out.println("Wrong key, calling 911!");
        }
    }

    public void fly(){
        if(this.started){
            this.attitude = 100;
            System.out.println("I believe I can fly!");
        }else{
            System.out.println("Engine is not started yet!");
        }
    }

    public void land(){
        if(this.started && this.attitude == 100){
            this.attitude = 0;
            System.out.println("Jet is landing!");
        }else {
            System.out.println("I don;t know what to do!");
        }
    }

    public void stop(){
        if(this.started && this.attitude == 0){
            this.started = false;
            System.out.println("Jet engine is stopping!");
        }else{
            System.out.println("Not allowed!");
        }
    }
}
