package org.ecvictor.workshop.exercises;

import java.util.Arrays;
import java.util.Random;

/**
 * Step 1: Initialize an array {6,7,1,19,22,3,67,12,9,16,13,88,19,32,25,5,0}
 * Step 2: Find pairs of elements(2 elements close to each other) that the sum value is 25, print them line by line
 * Step 3: Find pairs of elements(2 elements may or may NOT close to each other) that the sum value is 25, print them line by line
 */
public class FlowControl2 {
    public static void main(String args[]){
        int[] arr = {6, 7, 1, 19, 22, 3, 67, 12, 9, 16, 13, 88, 19, 32, 25, 5, 0};

        // Step 2
        int prev = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] + prev == 25) {
                System.out.println(String.valueOf(prev) + ',' + String.valueOf(arr[i]));
            }
            prev = arr[i];
        }

        System.out.println();
        //Step 3, solution 1 with 2 for loops
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == 25) {
                    System.out.println(String.valueOf(arr[i]) + ',' + String.valueOf(arr[j]));
                }

            }
        }

        System.out.println();
        // Step 3, solution 2 with two pointers
        Arrays.sort(arr);
        int left = 0;
        int right = arr.length - 1;
        while (left < right && left < arr.length && right < arr.length) {

            if (arr[left] + arr[right] == 25) {
                System.out.println(String.valueOf(arr[left]) + ',' + String.valueOf(arr[right]));
                if (arr[left] == arr[left + 1]) {
                    left++;
                } else {
                    right--;
                }

            } else if (arr[left] + arr[right] < 25) {
                left++;
            } else if (arr[left] + arr[right] > 25) {
                right--;
            }

        }
    }
}
