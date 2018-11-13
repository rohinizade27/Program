package com.bridgelabz.functionalprograms;

import com.bridgelabz.utility.Utility;

public class LeapYear 
{
	public static void main(String args[])
	{
		Utility utility=new Utility();
		System.out.println("Enter the year:");
		int year=utility.getInput();
		String result=utility.leapYear(year);
		System.out.println(result);
	}

}
