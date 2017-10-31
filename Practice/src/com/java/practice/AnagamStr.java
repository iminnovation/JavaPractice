package com.java.practice;

import java.util.Arrays;  

public class AnagamStr {  
    static void isAnagramStr(String str1, String str2) {  
        String stg1 = str1.replaceAll("\\s", "");  
        String stg2 = str2.replaceAll("\\s", "");  
        boolean flag = true;  
        if (stg1.length() != stg2.length()) {  
            flag = false;  
        } else {  
        	//Convert String in Array
            char[] arr1 = stg1.toLowerCase().toCharArray();  
            char[] arr2 = stg2.toLowerCase().toCharArray();  
            Arrays.sort(arr1);  
            Arrays.sort(arr2);  
            flag = Arrays.equals(arr1, arr2);  
        }  
        if (flag) {  
            System.out.println(stg1 + " and " + stg2 + " are anagrams.");  
        } else {  
            System.out.println(stg1 + " and " + stg2 + " are not anagrams.");  
        }  
    }  
   //Main Method
    public static void main(String[] args) {  
    	isAnagramStr("Mother In Law", "Hitler Woman"); 
    	isAnagramStr("cocacola", "locccaaoc"); 
    	isAnagramStr("Tester", "Testre"); 
    }  
}  