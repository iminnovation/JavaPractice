package com.java.practice;

import java.util.Scanner;

public class SquareNum {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
	    System.out.println("Enter number for Sq Root: ");
        double square = scanner.nextDouble();
        double squareRoot = Math.sqrt(square);
        System.out.printf("Square root of the number: %f is : %f %n" , square, squareRoot);
	}

}
