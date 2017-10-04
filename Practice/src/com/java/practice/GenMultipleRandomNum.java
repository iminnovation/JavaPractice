package com.java.practice;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;
//Non repeatable multiple random number in specified range.
public class GenMultipleRandomNum {
	public static final int TOTAL_COUNT_RANDOM_NUM = 5;
	public static final int RANGE = 500;

	public static void main(String[] args) {
		Random random = new Random();
		Set<Integer> set = new HashSet<Integer>(TOTAL_COUNT_RANDOM_NUM);
		if(RANGE>=TOTAL_COUNT_RANDOM_NUM){
			while(set.size()< TOTAL_COUNT_RANDOM_NUM) {
				while (set.add(random.nextInt(RANGE)) != true);
			}
			assert set.size() == TOTAL_COUNT_RANDOM_NUM;
			System.out.println(set);
		}
	}
}