package com.java.practice;


public class ConvertNumInWords  
{
//Convert Number in to words
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

	public String convert(int number) {

		if (number == 0) { return "Zero"; }

		String prefix = "";
		//For Negative Numbers
		if (number < 0) {
			number = -number;
			prefix = "Minus";
		}
		//For blank
		String current = "";
		int place = 0;

		do {
			int n = number % 1000;
			if (n != 0){
				String s = convertNumLessThanOneThousand(n);
				current = s + bigNums[place] + current;
			}
			place++;
			number /= 1000;
		} while (number > 0);

		return (prefix + current).trim();
	}

	public static void main(String[] args) {
		ConvertNumInWords conNum = new ConvertNumInWords();
		System.out.println( "Conversion of the number is :" + conNum.convert(14));
		System.out.println("Conversion of the number is :" + conNum.convert(-39));
		System.out.println("Conversion of the number is :" + conNum.convert(-13));
		System.out.println("Conversion of the number is :" + conNum.convert(13132));
		System.out.println("Conversion of the number is :" + conNum.convert(5363));
		System.out.println("Conversion of the number is :" + conNum.convert(0));
		System.out.println("Conversion of the number is :" + conNum.convert(8));
		System.out.println("Conversion of the number is :" + conNum.convert(53676683));
	}
	
	
	
}