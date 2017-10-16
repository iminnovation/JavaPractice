package com.java.practice;

import java.util.HashMap;
import java.util.Map;

public class LongestSubStrUnRepChar {
	
	public static String longestSubstringUnrepeatedChar(String inputStr) {
        String longestTillNow = "";
        String longestSubStr = "";
        if (inputStr.isEmpty()) {
            return "";
        }
        if (inputStr.length() == 1) {
            return inputStr;
        }
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        for (int i = 0; i < inputStr.length(); i++) {
            char currentCharacter = inputStr.charAt(i);
            if (longestTillNow.indexOf(currentCharacter) == -1) {
                if (!map.containsKey(currentCharacter)) {
                    map.put(currentCharacter, i);
                }
                longestTillNow = longestTillNow + currentCharacter;
            } else {
                longestTillNow = inputStr.substring(map.get(currentCharacter) + 1, i + 1);
                map.put(currentCharacter, i);
            }
            if (longestTillNow.length() > longestSubStr.length()) {
                longestSubStr = longestTillNow;
                System.out.println(longestSubStr);
            }
        }
        return longestSubStr;
    }
	
	public static void main(String args[]){
		String inputStr="abcdeffffffffghijklmccnuuosssazzzzzxxpq";
		LongestSubStrUnRepChar.longestSubstringUnrepeatedChar(inputStr);
	}

}
