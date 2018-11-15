package com.bridgelabz.algorithmprograms;

import com.bridgelabz.utility.Utility;

public class Binary 
{
	public static void main(String args[])
	{
		System.out.println("Enter the value of N");
		int number = Integer.parseInt(args[0]);
		int N=(int)(Math.pow(2,number));
        int low=0;
		int high=N;
		int result =Utility.binarySearch(low,high);
		System.out.println(result+" is correct guess");
		
	}

}
