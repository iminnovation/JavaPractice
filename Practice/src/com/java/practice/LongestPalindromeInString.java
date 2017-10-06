package com.java.practice;


public class LongestPalindromeInString {
	
    public static void main(String args[]) { 
        String str = "I am friend of gaurav arora";
        int strLen = str.length();
        int matchLen = 0;
        int startIndex = 0;
        int sizeSubStr = 0;
        int finalIndex = 0;
        System.out.println("Given string is >>"+str+" <<");
        for( int i = 0 ; i < strLen ; i++ ) { 
            for( int j = (strLen - 1) ; j >= i ; j-- ) {
                if( str.charAt(i) == str.charAt(j) && ( i != j ) ) {
                System.out.println( "Character "+str.charAt(i)+" at : " + i + " matcheing with character at : " + j);                   
                matchLen = 0;
                    int k = 0;
                    int l = 0;
                    for( k = i , l = j ; ( k < strLen ) && ( l >= 0 )  ; k++ , l-- ) {
                        if( str.charAt(k) != str.charAt(l) ) {
                            break;
                        }
                        else {
                            matchLen++;
                            startIndex = i;
                        }
                    }
                    if( matchLen > sizeSubStr ) {
                    	sizeSubStr = matchLen;
                        finalIndex = startIndex;
                    }
                }      
            }   
        }
        System.out.println("The Maximum Size is of palindrome substring : " + sizeSubStr );
        System.out.println("Index is : " + finalIndex );
         for( int i = 0 ; i < sizeSubStr ; i++ ) {
            System.out.print(str.charAt(finalIndex+i));
        }      
    }    
}