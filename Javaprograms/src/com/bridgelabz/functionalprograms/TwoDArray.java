package com.bridgelabz.functionalprograms;
import com.bridgelabz.utility.TwoDArrayFunction;

public class TwoDArray 
{
	public static void main(String args[])
	{
		TwoDArrayFunction tdf=new TwoDArrayFunction();
		System.out.println("Enter the number of rows:");
		int r=tdf.input();
		System.out.println("Enter the number of column:");
		int c=tdf.input();
		tdf.printTwoDArray(r,c);
		
		
	}

}
