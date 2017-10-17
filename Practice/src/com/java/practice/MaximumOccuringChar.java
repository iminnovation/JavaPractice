package com.java.practice;

public class MaximumOccuringChar 
{
    static final int ASCII_SIZE = 256;
    static char getMaximumOccurChar(String str)
    {
   
        int count[] = new int[ASCII_SIZE];
        // create character count array from the input
        int len = str.length();
        
        for (int i=0; i<len; i++){
            count[str.charAt(i)]++;
        }
        int maxCount = -1;  
        char result = ' ';   
      
        // Iterate each char of the string and maintain the count of each char.
        for (int i = 0; i < len; i++) {
            if (maxCount < count[str.charAt(i)]) {
            	maxCount = count[str.charAt(i)];
                result = str.charAt(i);
            }
        }
        return result;
    }
     
    public static void main(String[] args)
    {
        String str = "This is test string";
        String str1 = "";
        String str2 = "RandomStringCreatingFromTestStringToFoundMaxOccouringChar";
        
        System.out.println("Maximum occurring character> " + getMaximumOccurChar(str));
        System.out.println("Maximum occurring character> " + getMaximumOccurChar(str1));
        System.out.println("Maximum occurring character> " + getMaximumOccurChar(str2));
    }
}