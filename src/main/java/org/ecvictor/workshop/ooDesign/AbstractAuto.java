package org.ecvictor.workshop.ooDesign;

/**
 * Template of automobile:
 * Implementation of common behavior
 */
public abstract class AbstractAuto implements Transportation {
    /**
     * @param direction: 1 - left, 2- right
     */
    public void steer(int direction){
        if(1 == direction){
            System.out.println("Turn left!");
        }else if(2 == direction){
            System.out.println("Turn right!");
        }else{
            System.out.println("Invalid input!");
        }
    }
}
