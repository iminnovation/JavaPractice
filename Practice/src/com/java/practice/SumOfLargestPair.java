package com.java.practice;

//Sum of largest and second largest number in unsorted array

class SumOfLargestPair
{
	static int arrGiven[] = new int[]{2,55,12,55,6,646,33,345};

	static int findLargestSumPair()
	{
		// There should be minimum two number in array and l1 first largest and l2 second large.
		int l1, l2;
		if (arrGiven[0] > arrGiven[1])
		{
			l1 = arrGiven[0];
			l2 = arrGiven[1];
		}
		else
		{
			l1 = arrGiven[1];
			l2 = arrGiven[0];
		}

		for (int i = 2; i<arrGiven.length; i ++)
		{
			if (arrGiven[i] > l1)
			{
				l2 = l1;
				l1 = arrGiven[i];
			}

			else if (arrGiven[i] > l2 && arrGiven[i] != l1){
				l2 = arrGiven[i];
			}
		}
		return (l1 + l2);
	}

	public static void main(String[] args) 
	{

		System.out.println("Sum is " + findLargestSumPair());

	}
}