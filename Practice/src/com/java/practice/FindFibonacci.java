package com.java.practice;
import java.util.Scanner;
public class FindFibonacci {



	public static void main(String args[]) { 
		//Input for print Fibonacci series  
		System.out.println("Enter a number upto which Fibonacci series you want to print: ");
		@SuppressWarnings("resource")
		int number = new Scanner(System.in).nextInt(); 
		System.out.println("Fibonacci series upto :" + number +" numbers : "); 

		for(int i=1; i<=number; i++)
		{ 
			System.out.print(fibonacci2(i) +" "); 
		}

	}

	public static int fibonacci2(int number)
	{ 
		if(number == 1 || number == 2)	
		{ 
			return 1; 
		}
		int fibo1=1, fibo2=1, fibonacci=1; 
		for(int i= 3; i<= number; i++){ 
			//Fibonacci number is the sum of previous two Fibonacci number 
			fibonacci = fibo1 + fibo2; 
			fibo1 = fibo2; fibo2 = fibonacci; 

		} 

		return fibonacci;  
	}
}







