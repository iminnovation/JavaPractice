package com.java.practice;

//Sorted array as input
class BinarySearch
{
 // Returns index of x if it is present in arr[l..r], otherwise it will return -1

 int binarySearch(int arr[], int l, int r, int x)
 {
     if (r>=l)
     {
         int mid = l + (r - l)/2;
         // If the element is present at the middle
         if (arr[mid] == x)
            return mid;
         // If element is smaller than mid, then it will only in left sub array
       
         if (arr[mid] > x)
            return binarySearch(arr, l, mid-1, x);

      // If element is larger than mid, then it will only in right sub array
         return binarySearch(arr, mid+1, r, x);
     }
     // If element is not present in array
     return -1;
 }


 public static void main(String args[])
 {
     BinarySearch obj = new BinarySearch();
     int arr[] = {4,8,27,31,49};
     int n = arr.length;
     int x = 31;
     int result = obj.binarySearch(arr,0,n-1,x);
     if (result == -1)
         System.out.println("Element is not present");
     else
         System.out.println("Element found at array's index "+result);
 }
}