package com.java.practice;


public class ConvertNumInWords  
{


	private static final String[] basicNums = {
			"",
			" One",
			" Two",
			" Three",
			" Four",
			" Five",
			" Six",
			" Seven",
			" Eight",
			" Nine",
			" Ten",
			" Eleven",
			" Twelve",
			" Thirteen",
			" Fourteen",
			" Fifteen",
			" Sixteen",
			" Seventeen",
			" Eighteen",
			" Nineteen"
	};


	private static final String[] tenNums = {
			"",
			" Ten",
			" Twenty",
			" Thirty",
			" Forty",
			" Fifty",
			" Sixty",
			" Seventy",
			" Eighty",
			" Ninety"
	};

	private static final String[] bigNums = {
			"",
			" Thousand",
			" Million",
			" Billion",
			" Trillion",
			" Quadrillion",
			" Quintillion"
	};

	
	private String convertNumLessThanOneThousand(int number) {
		String current;  
		//If num mod less then 20.
		if (number % 100 < 20){
			current = basicNums[number % 100];
			number /= 100;
		}
		else {
			current = basicNums[number % 10];
			number /= 10;

			current = tenNums[number % 10] + current;
			number /= 10;
		}
		if (number == 0) return current;
		return basicNums[number] + " Hundred" + current;
	}

	
	
	
	
}