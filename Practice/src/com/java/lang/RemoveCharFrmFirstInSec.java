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
	public static String removeChars(String str1, String str2)
	{
		int count[]  = getCharCount(str2);
		int inputStringCharIndex  = 0, outputStrCharIndex = 0;
		char arr[] = str1.toCharArray();
		while (inputStringCharIndex != arr.length)
		{
			char temp = arr[inputStringCharIndex];
			if(count[temp] == 0)
			{
				arr[outputStrCharIndex] = arr[inputStringCharIndex];
				outputStrCharIndex ++;
			}
			inputStringCharIndex++;

		}    
		str1 = new String(arr);
		return str1.substring(0, outputStrCharIndex);  
	}
	public static void main(String[] args)
	{
		String str1 = "jamesbond";
		String str2 = "and";
		System.out.println(removeChars(str1, str2));
	}

}