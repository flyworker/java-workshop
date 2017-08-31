package org.ecvictor.workshop.ooDesign;

public class Controller {
    public void operate(Transportation machine, int direction){
        machine.startEngine();
        machine.steer(direction);
        //drive 100km
        //recharge/refill
        //stop
    }



}
