package com.ecvlearning.java.exercises;

import java.util.Random;

/**
 * Step 1: Code the logic to generate a random array with length 20 (Random rand = new Random(); int a = rand.nextInt();) and print them separated by coma
 * Step 2: Extract all elements with value > 25 and print
 */
public class FlowControl1 {
    public static void main(String args[]) {
        int[] random = new int[20];
        Random rand = new Random();
        for (int i = 0; i < random.length; i++) {
            random[i] = rand.nextInt(50);
        }
        for(int i = 0; i < random.length; i++) {
            if(random[i] > 25) {
                System.out.print(random[i]+",");
            }
        }
    }
}
