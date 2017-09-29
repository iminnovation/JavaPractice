package com.java.practice;
//Program to reverse a number.
public class ReverseTheNum {
	 
    public int reverseNumber(int num){
        int reverse = 0;
        while(num != 0){
            reverse = (reverse*10)+(num%10);
            num = num/10;
        } 
        return reverse;
    }
    
    public static void main(String a[]){
    	ReverseTheNum nr = new ReverseTheNum();
        System.out.println("Reverse is: "+nr.reverseNumber(19697888));
    }
}