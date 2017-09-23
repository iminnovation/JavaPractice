package com.java.practice;
// To check Palindrome string using String functions
class PalindromeStrTest {
	
	public static boolean isPalindrome(String str){  
	    StringBuilder sb=new StringBuilder(str);  
	    sb.reverse();  
	    String rev=sb.toString();  
	    if(str.equals(rev)){  
	        return true;  
	    }else{  
	        return false;  
	    }  
	}  
	
	public static void main(String args[])
	 {
		
	     String str = "detartrated";
	     
	     boolean result = PalindromeStrTest.isPalindrome(str);
	     if (result)
	         System.out.println("Yes, Palindrome");
	     else
	         System.out.println("Not Palindrome");
	 }

}
