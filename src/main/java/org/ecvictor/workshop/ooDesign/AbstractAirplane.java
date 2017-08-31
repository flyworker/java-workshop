package org.ecvictor.workshop.ooDesign;

public abstract class AbstractAirplane implements Transportation {
    /**
     * @param direction: 1 - left, 2- right, 3-up, 4-down
     */
    public void steer(int direction){
        if(1 == direction){
            System.out.println("Turn left!");
        }else if(2 == direction){
            System.out.println("Turn right!");
        }else if(3 == direction){
            System.out.println("Turn up!");
        }else if(4 == direction){
            System.out.println("Turn down!");
        }else{
            System.out.println("Invalid input!");
        }
    }
}
