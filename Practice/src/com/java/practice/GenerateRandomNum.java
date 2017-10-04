package com.java.practice;

import java.util.Random;
import java.util.Scanner;
// Genrate random number in specified range.
public class GenerateRandomNum {
	 public static void main(String[] args) {
	  
	  @SuppressWarnings("resource")
	  Scanner in = new Scanner(System.in);
	  System.out.println("Enter start point of range");
	  int minimum=in.nextInt();  
	  System.out.println("Enter end point of the range");
	  int maximum=in.nextInt();
	//Random is from Java package  
	  Random rn = new Random();
	  int range = maximum - minimum + 1;
	  int randomNum =  rn.nextInt(range) + minimum;
	  System.out.println("Random Number is= "+randomNum);
	 }

	}