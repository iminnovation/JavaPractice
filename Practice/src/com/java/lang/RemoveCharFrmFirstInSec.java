package com.java.lang;

//Java program to remove chars from first string which exist in second string

public class RemoveCharFrmFirstInSec 
{
 static final int MAX_CHAR = 200;
 

 static int[] getCharCount(String strng)
 {
    int count[] = new int[MAX_CHAR];
    for (int i = 0; i<strng.length();  i++){
       count[strng.charAt(i)]++;
    }
    return count;
 }
  
 
}