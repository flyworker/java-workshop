package com.ecvlearning.java.flowControl;

public class FlowControl {
    public static void main(String[] args){
        //General Tao
        int price = 10;
//        price = 22;
//
//        //Shrimp
//        String shrimp = "5 zhi";
//
//        if(shrimp.equals("5 zhi") && price < 20){
//            System.out.println("Lai yi fen!");
//        }

//        price = 22;
//        switch(price){
//            case 10:
//                System.out.println("10 kuai qian, hai ke yi");
//                break;
//            case 12:
//                System.out.println("12 kuai, you dian gui");
//                break;
//            case 100:
//                System.out.println("Pian gui a");
//                break;
//
//            default:
//                System.out.println("Wo hai shi hui jia zuo fan ba");
//        }


        String skewer = "Yang rou chuan";
        String mixedSkewer = skewer + " ji xin";
        String[] words = mixedSkewer.split(" ");

//        for(int i = 0; i < words.length; i++){
//            System.out.println(words[i]);
//        }
//
//        System.out.println();
//        for(int i = 0; i < words.length; i++){
//            System.out.println(words[i]);
//        }
//        System.out.println();
//        for(String word:words){
//            System.out.println(word);
//        }

        int i = 0;
        do{
            System.out.println(words[i]);
            i++;
        }while (i < 0);

//        while(i<0){
//            System.out.println(words[i]);
//        }

    }
}
