package com.java.practice;

public class SelectionSort
{
    void sort(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n-1; i++)
        {
            int min = i;
            for (int j = i+1; j < n; j++)
                if (arr[j] < arr[min]){
                    min = j;
                }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
        for (int j=0; j<n; ++j){
            System.out.print("Sorted Array : "+arr[j]+" ");
        }
    }
    public static void main(String args[])
    {
        SelectionSort ss = new SelectionSort();
        int arr[] = {34,675,2,68,644};
        ss.sort(arr);     
    }
}