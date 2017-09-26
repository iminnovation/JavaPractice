package com.java.practice;

import java.util.Arrays;

public class SecondMax{ 
	public static void main(String args[]) 
	{ 
		secondMaximum(new int[]{2, 2, -2});
		secondMaximum(new int[]{12, 12, 8, 7, 9, Integer.MAX_VALUE}); 
		secondMaximum(new int[]{0, Integer.MIN_VALUE, -2, -1}); 	
	} 
	public static void secondMaximum(int[] numbers) 
	{ 
		int max1 = Integer.MIN_VALUE; 
		int max2 = Integer.MIN_VALUE; 
		for (int number : numbers) 
		{ 
			if (number > max1) 
			{ 
				max2 = max1; max1 = number;
				} else if (number > max2) {
					max2 = number; 
					} 
			} 
		System.out.println("Numbers are> " + Arrays.toString(numbers));
		System.out.println("Second max number> " + max2); }
	}

