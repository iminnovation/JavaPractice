package com.java.practice;

public class VowelCount {
	
	 static int countVowels(String str)
	    {
	        int count = 0;
	        for (int i = 0; i < str.length(); i++)
	            if (isVowels(str.charAt(i))){
	                ++count;
	            }
	        return count;
	    }
    
    // Return true if vowel
    static boolean isVowels(char ch)
    {
        ch = Character.toUpperCase(ch);
        return (ch=='A' || ch=='E' || ch=='I' ||
                           ch=='O' || ch=='U');
    }
         
    public static void main(String args[])
    {

        String str = "cocacola";
        System.out.println("Toatl number of vowels in "+str+" : "+countVowels(str));
    }
}