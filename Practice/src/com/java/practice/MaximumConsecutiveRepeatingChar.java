package com.java.practice;

// To find the maximum consecutive repeating character in given string
public class MaximumConsecutiveRepeatingChar {
 static char maxRepeatingCharInStr(String str)
 {
     int len = str.length();
     int flag = 0;
     char ch = str.charAt(0);
     for (int i=0; i<len; i++)
     {		//Count is one in start
         int start_count = 1;
         for (int j=i+1; j<len; j++)
         {
             if (str.charAt(i) != str.charAt(j)){
                 break;
             }
             start_count++;
         }
         if (start_count > flag)
         {
        	 flag = start_count;
        	 ch = str.charAt(i);
         }
     }
     return ch;
 }

 public static void main(String args[])
 {

     String str = "cocacola";
     String str1 = "My Name is Tests";
     String str2 = "aaabbbccc";
     String str3 = "This is test string";
     System.out.println("Maximum Consecutive Repeating Char is :"+maxRepeatingCharInStr(str));
     System.out.println("Maximum Consecutive Repeating Char is :"+maxRepeatingCharInStr(str1));
     System.out.println("Maximum Consecutive Repeating Char is :"+maxRepeatingCharInStr(str2));
     System.out.println("Maximum Consecutive Repeating Char is :"+maxRepeatingCharInStr(str3));
 }
}