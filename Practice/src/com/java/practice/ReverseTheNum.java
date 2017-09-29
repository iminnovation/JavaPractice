package com.java.practice;
//Program to reverse a number.
public class ReverseTheNum {
	 
    public int reverseNumber(int number){
        int reverse = 0;
        while(number != 0){
            reverse = (reverse*10)+(number%10);
            number = number/10;
        } 
        return reverse;
    }
     
    public static void main(String a[]){
    	ReverseTheNum nr = new ReverseTheNum();
        System.out.println("Reverse is: "+nr.reverseNumber(17868));
    }
}