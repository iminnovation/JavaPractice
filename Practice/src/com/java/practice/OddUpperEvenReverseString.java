package com.java.practice;

//Problem Statement:
//Change odd words to upper case and Reverse the even words.


public class OddUpperEvenReverseString {

	//Function for String Reverse.
	private static String reverse(String str)
	{
		if(str.length()==0){
		return str;
		}
		else {
			return str.charAt(str.length()-1) + reverse(str.substring(0,str.length()-1));
		}
	}
	
	
	public static String oddsUpperEvenReverse(String s){
		//Split String by space as the delimiter. 
		int size = s.split(" ", -1).length;
		String[] words = new String[size];
		words = s.split(" ", -1);
		
		//Number in each word
		int wordCount=0;
		for(int i=0; i<size; i++){
			if(words[i].equals(""))
				continue;
			else
				wordCount++;
			//Change the odd words to upper-case
			if((wordCount)%2!=0){
				words[i] = words[i].toUpperCase();
			}
			//Change the ever word to reverse
			else{
				words[i] = reverse(words[i]);
			}
		}
		StringBuilder sb = new StringBuilder("");
		for(String word: words){
			sb.append(word + " ");
		}
		return sb.toString().substring(0,sb.toString().length()-1);
	}
	
	
	public static void main(String args[]){
		String s = "This is the amazing program";
		System.out.println(oddsUpperEvenReverse(s));
	}
}