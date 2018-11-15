package com.bridgelabz.algorithmprograms;

import com.bridgelabz.utility.Utility;

public class BubbleSort 
{
	public static void main(String args[])
	{
		
	 System.out.println("Enter the size of array:");
	 int size=Utility.getInt();
	 int storeElement[]=new int[size];
	 System.out.println("Enter the elements of array");
	 storeElement=Utility.acceptElement(size);
     Utility.BubbleSort(size,storeElement);
	 
	 
	}

}
