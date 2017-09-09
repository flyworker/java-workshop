package org.ecvictor.workshop.ooDesign;

public class Car extends AbstractAuto {


    @Override
    public void startEngine() {
        try {
            System.out.println("Start Gas engine!");
        }catch(Exception e){
            e.printStackTrace();
        }
    }
//
//    static int hashCode(Object o){
//        return 1;
//    }
//    static boolean	equals(Object a, Object b){
//        if(b instanceof )
//        return true;
//    }



//    /**
//     *
//     * @param direction: 1 - left, 2- right, 3- up. 4- down
//     */
//    public void steer(int direction){
//        if(3 == direction){
//            System.out.println("Turn up!");
//        }else if(4 == direction){
//            System.out.println("Turn down!");
//        }else{
//            System.out.println("Invalid input!");
//        }
//    }
}
