package com.java.practice;

import java.util.Scanner;

public class DecimalToRoman
{    
    public static void main(String[] args) 
    {
        //String array that containing 13 Roman symbols
         String[] romanSymbols = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
         
        //int array that containing 13 decimal numbers corresponds to Roman 
        int[] decimals = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
         
        @SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in); 
        System.out.println("Enter the decimal num between 1 and 3999");
        int inputNumber = sc.nextInt();
        int copyOfInputNumber = inputNumber;
        String romanStr = "";         
        if (inputNumber >= 1 && inputNumber <= 3999)
        {
            for (int i = 0; i < romanSymbols.length; i++) 
            {
                while(inputNumber >= decimals[i])
                {
                    inputNumber = inputNumber - decimals[i];
                     
                    romanStr = romanStr + romanSymbols[i];
                }
            }
             
            System.out.println("Roman Equivalent : "+copyOfInputNumber+" is : "+romanStr);
        }
        else
        {
            System.out.println("Number is not in between 1 to 3999");
        }
    }
}