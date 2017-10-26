package com.java.practice;
//Check if an array contains all elements of a given range.
class AllElementInRange {
	public static boolean checkElementsExistInRange(int arr[], int n, int start, int end)
	{
		int range = end - start;
		for (int i = 0; i < n; i++) {
			if (Math.abs(arr[i]) >= start && Math.abs(arr[i]) <= end) {
				int k = Math.abs(arr[i]) - start;
				if (arr[k] > 0) {
					arr[k] = arr[k] * -1;
				}
			}
		}
		int count=0;
		for (int i = 0; i <= range && i<n; i++) {
			if (arr[i] > 0){
				return false;
			}
			else{
				count++;
			}
		}
		if(count!= (range+1)){
			return false;
		}
		return true;
	}
	//Main
	public static void main(String[] args) 
	{
		int arr[] = {21,68,23,98,75,24,9,0,22,3 };
		int n = arr.length;
		int startRange = 21, endRange = 24;
		if (checkElementsExistInRange(arr, n, startRange, endRange)){
			System.out.println("All number exist in array from "+startRange+" to "+endRange);
		}
		else{
			System.out.println("Number does not exist");
		}
	}
}
