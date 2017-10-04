package com.java.practice;

//Swap number w/o third variable.
public class SwapNumber {
	 
    public static void main(String a[]){
        int x = 40;
        int y = 50;
        System.out.println("*Two number before swap*");
        System.out.println("First Number: "+x);
        System.out.println("Second Number: "+y);
        x=x+y;
        y=x-y;
        x=x-y;
        System.out.println("***After swap***");
        System.out.println("First Number: "+x);
        System.out.println("Second Number: "+y);
    }
}