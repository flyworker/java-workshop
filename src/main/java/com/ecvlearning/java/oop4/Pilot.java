package com.ecvlearning.java.oop4;

import com.ecvlearning.java.oop3.Sedan;
import com.ecvlearning.java.oop3.Vehicle;

public class Pilot {

    /**
     * Encapsulate all fly related behavior
     */
    private void fly(Airplane h, String key){
        h.start(key);
        h.fly();
        h.land();
        h.stop();
    }


    private void drive(Vehicle v, String key){
        v.startEngine(key);
        v.moveForward();
        v.turnLeft();
        v.turnRight();
        System.out.println("Drifting to parking spot!");
        v.stopEngine();

        System.out.println("The pilot arrived airport!");
    }

    public int work(Vehicle v, Airplane a, String vehiclekey, String airplaneKey){
        this.drive(v,vehiclekey);
        this.fly(a,airplaneKey);

        return 1000;
    }

    public static void main(String[] args){
        Pilot p =new Pilot();
//        p.drive(new Sedan(),"Porsch");
//        p.fly(new Helicopter("Apache"), "Apache");
//        p.fly(new Jet("Bombardier"), "Bombardier");

        int money = p.work(new Sedan(), new Helicopter("Apache"),"Porsche","Apache");

    }
}
