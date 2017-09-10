package com.ecvlearning.java.oop;

public class Operator {

    public static void main(String args[]){
        //abstract class/parent class define the method signature(definition)
        //subclass defines the implementation
        //the program(main()) will call parent class's implementation only if it's not found in subclass
        AbstractAuto car = new Car();
//        ElectricalCar car2 = new ElectricalCar();
        AbstractAuto eCar = new ElectricalCar();

//        ((ElectricalCar)car).recharge();
//        car2.recharge();
        car.steer(2);
        car.startEngine();

        eCar.steer(2);
        eCar.startEngine();


        System.out.println();
        Transportation helicopter = new Helicopter();
        Transportation airplane = new Airplane();
        Transportation niubiCar =new Car();

        helicopter.startEngine();
        airplane.startEngine();
        niubiCar.startEngine();

        helicopter.steer(3);
        airplane.steer(3);
        niubiCar.steer(3);


        //--------------
        Controller c = new Controller();
        c.operate(new Helicopter(),3);

    }
}
