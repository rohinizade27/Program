package com.bridgelabz.algorithmprograms;

import com.bridgelabz.utility.Utility;

public class InsertionSort 
{
  public static void main(String args[])
  {
	     System.out.println("Enter the size of array:");
		 int size=Utility.getInt();
		 String stringarray[]=new String[size];
		 System.out.println("Enter the elements of array");
		 stringarray=Utility.stringElement(size);
	     Utility.insertionSort(size,stringarray);
  }
}
