package com.bridgelabz.algorithmprograms;

import com.bridgelabz.utility.Utility;

public class binarySearchInteger 
{
	public static void main(String args[])
	{ 
		System.out.println("Enter the size of array:");
	    int size=Utility.getInt();
	    int storeElement[]=new int[size];
	    System.out.println("Enter the elements of array");
		storeElement=Utility.acceptElement(size);
		System.out.println("Enter the element you want to search:");
		int key=Utility.getInt();
		int low=0;
		int high=size-1;
		
		int result=Utility.binarySearchInteger(low,high,key,storeElement);
		if(result==-1)
			System.out.println("Element is not present in given array:");
		else
			System.out.println("Element "+key+" is found at "+result+" position");

		
	}
}
