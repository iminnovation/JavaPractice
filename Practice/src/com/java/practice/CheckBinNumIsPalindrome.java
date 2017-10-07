package com.java.practice;


//Write a program that returns palindrome if the binary representation of an integer is a palindrome. 

public class CheckBinNumIsPalindrome {
	
	public static void checkBinOfIntIsPalin(int num) {
		String binaryString = convertToBinaryString(num);
		if (isPalindrome(binaryString.toCharArray())) {
			System.out.println("Its binary representation is palindrome");
		} else {
			System.out.println("Its binary representation is NOT palindrome");
		}
	}
	
	public static String convertToBinaryString(int n) {
		StringBuilder sb = new StringBuilder();
		 while(n > 0) {
		  if ((n & 1) == 1) {
		   sb.append("1");
		  } else {
		   sb.append("0");
		  }
		  n = n >> 1;
		 }
		 return sb.reverse().toString();
	}

	//To test Palindrome
	public static boolean isPalindrome(char[] c) {	 
		int start = 0;
	    int end = c.length - 1;
	    int mid = (start + end)/2;
	    int i;
	    for (i = start; i <= mid; i++) {
	      if (c[start] == c[end]) {
	        start++;
	        end--;
	      }
	      else {
	        break;
	      }
	    }
	    return (i == mid + 1); 			
	}
	
	public static void main(String[] args) {
		checkBinOfIntIsPalin(9);
		checkBinOfIntIsPalin(16);
		checkBinOfIntIsPalin(11);
		checkBinOfIntIsPalin(33);
	}
}