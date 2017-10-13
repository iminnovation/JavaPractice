package com.java.practice;
//Check Prime Number
public class PrimeNum {
 
    public boolean isPrimeNum(int number){
         
        for(int i=2; i<=number/2; i++){
            if(number % i == 0){
                return false;
            }
        }
        return true;
    }
     
    public static void main(String a[]){
    	PrimeNum obj = new PrimeNum();
        System.out.println("Is 1 prime number? "+obj.isPrimeNum(1));
        System.out.println("Is 3 prime number? "+obj.isPrimeNum(3));
        System.out.println("Is 48 prime number? "+obj.isPrimeNum(48));
    }
}