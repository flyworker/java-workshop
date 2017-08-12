package org.ecvictor.workshop.course3.interfaceSample.car;

/**
 * Created by ccao on 3/18/17.
 */
public class OperateBMW760i implements OperateCar {

    public int turn(Direction direction, double radius, double startSpeed, double endSpeed) {
        return 0;
    }

    public int changeLanes(Direction direction, double startSpeed, double endSpeed) {
        return 0;
    }

    // the OperateCar method signatures, with implementation --
    // for example:
    public int signalTurn(Direction direction, boolean signalOn) {
        // code to turn BMW's LEFT turn indicator lights on
        // code to turn BMW's LEFT turn indicator lights off
        // code to turn BMW's RIGHT turn indicator lights on
        // code to turn BMW's RIGHT turn indicator lights off
        return 0;
    }

    public int getRadarFront(double distanceToCar, double speedOfCar) {
        return 0;
    }

    public int getRadarRear(double distanceToCar, double speedOfCar) {
        return 0;
    }

    // other members, as needed -- for example, helper classes not
    // visible to clients of the interface
}

