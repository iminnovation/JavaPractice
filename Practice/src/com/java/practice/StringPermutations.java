package com.java.practice;
import java.util.Scanner;

class StringPermutation
{
	public static void main(String[] args) {
		String str;
		System.out.println("Enter the String whose permutation you want: ");
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		str=sc.next();
		permutation("",str);
	}

	public static void permutation(String st,String sub)
	{
		if(sub.equals(""))
		{
			System.out.println(st);
		}
		else
		{
			int a[] = new int[256];
			for(int i=0;i<sub.length();i++)
			{
				if(a[(int)sub.charAt(i)]==0)
				{
					a[(int)sub.charAt(i)]=1;
					permutation((st+sub.charAt(i)),sub.substring(0,i)+sub.substring(i+1,sub.length()));
				}
			}
		}
	}
}

