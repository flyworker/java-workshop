package org.ecvictor.workshop.ooDesign.template;

public class Controller {
    public void operate(Transporter machine, int direction){
        machine.startEngine();
        machine.steer(direction);
        //drive 100km
        //recharge/refill
        //stop
    }



}
