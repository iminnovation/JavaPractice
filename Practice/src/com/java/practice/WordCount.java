package com.java.practice;

//Word Count
public class WordCount {  
    static int countTheWords(String str)
    {
        int flag = 0;
        int word_count = 0; 
        int i = 0;
        while (i < str.length())
        {
            if (str.charAt(i) == ' ' || str.charAt(i) == '\t' || str.charAt(i) == '\n'){
                flag = 0;
            }   
            else if (flag == 0)
            {
                flag = 1;
                ++word_count;
            }
            ++i;
        }
        return word_count;
    }
    // Main 
    public static void main(String args[])
    {
        String st = "He is       the\n cool\t      guy  ";
        System.out.println("No of words in string : > " + countTheWords(st));
    }
}
