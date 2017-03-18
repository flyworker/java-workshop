package org.concordia.workshop.course3.interfaceSample.car;

/**
 * Created by ccao on 3/18/17.
 */
public interface OperateCar {

    // constant declarations, if any
    // base of natural logarithms
    double E = 2.718282;


    // method signatures

    // An enum with values RIGHT, LEFT
    int turn(Direction direction,
             double radius,
             double startSpeed,
             double endSpeed);
    int changeLanes(Direction direction,
                    double startSpeed,
                    double endSpeed);
    int signalTurn(Direction direction,
                   boolean signalOn);
    int getRadarFront(double distanceToCar,
                      double speedOfCar);
    int getRadarRear(double distanceToCar,
                     double speedOfCar);

    // more method signatures
}
