package com.bridgelabz.functionalprograms;
import com.bridgelabz.utility.Utility;

public class TwoDArray 
{
	public static void main(String args[])
	{
		Utility utility=new Utility();
		System.out.println("Enter the number of rows:");
		int row=utility.getInput();
		System.out.println("Enter the number of column:");
		int column=utility.getInput();
		utility.printTwoDArray(row,column);
	}

}
