package com.java.practice;

public class LinearSearch {


public static int linerSearch(int[] arr, int key){
	
	int size = arr.length;
	for(int i=0;i<size;i++){
		if(arr[i] == key){
			return i;
		}
	}
	return -1;
}

public static void main(String a[]){
	
	int[] arr1= {12,78,65,56,898,34};
	int searchKey = 34;
	System.out.println("Key "+searchKey+" found at index, here index starts from 0 :"+linerSearch(arr1, searchKey));
	int[] arr2= {56,89,678,89,90,21,67,146,345};
	searchKey = 985;
	System.out.println("Key "+searchKey+" found at index, , here index starts from 0 :"+linerSearch(arr2, searchKey));
}
}