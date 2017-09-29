package com.java.practice;
//Write a program to find sum of each digit in the given number 

public class SumOfDigits {
    int sum = 0;
    public int getNumberSum(int number){  
        if(number == 0){
            return sum;
        } else {
            sum += (number%10);
            getNumberSum(number/10);
        }
        return sum;
    }
     
    public static void main(String a[]){
    	SumOfDigits obj = new SumOfDigits();
        System.out.println("Sum of the numbers is: "+obj.getNumberSum(456486));
    }
}