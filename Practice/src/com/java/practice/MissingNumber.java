package com.java.practice;

import java.util.Arrays;
import java.util.BitSet;
 
/**
 * Find missing elements in a Integer array.

 */
public class MissingNumber {
 
    public static void main(String args[]) {

        // For one missing number
        printMissingNumber(new int[]{1, 2, 3, 4, 6}, 6);
 
        // For two missing numbers
        printMissingNumber(new int[]{1, 2, 3, 4, 6, 7, 9, 8}, 10);
 
        // For three missing numbers
        printMissingNumber(new int[]{1, 2, 3, 4, 6, 9, 8}, 10);
 
        // For four missing number
        printMissingNumber(new int[]{1, 2, 3, 4, 9, 8}, 10);
 
        // Only one missing number in array
        int[] iArray = new int[]{1, 2, 3, 5};
        
        int missing = getMissingNumber(iArray, 5);
        System.out.printf("Missing number in array %s is %d %n", 
                           Arrays.toString(iArray), missing);
    }
    
  
    private static void printMissingNumber(int[] numbers, int count) {
        int missingCount = count - numbers.length;
        BitSet bitSet = new BitSet(count);
 
        for (int number : numbers) {
            bitSet.set(number - 1);
        }
 
        System.out.printf("Missing numbers in integer array %s, with total number %d is %n",
        Arrays.toString(numbers), count);
        int lastMissingIndex = 0;

        for (int i = 0; i < missingCount; i++) {
            lastMissingIndex = bitSet.nextClearBit(lastMissingIndex);
            System.out.println(++lastMissingIndex);
        }
 
    }
   /**
    * Java method to find missing number in array of size n containing
    * numbers from 1 to n only.
    */
    private static int getMissingNumber(int[] numbers, int totalCount) {
        int expectedSum = totalCount * ((totalCount + 1) / 2);
        int actualSum = 0;
        for (int i : numbers) {
            actualSum += i;
        }
 
        return expectedSum - actualSum;
    }
 
}
