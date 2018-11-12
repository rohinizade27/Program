package com.bridgelabz.functionalprograms;

import com.bridgelabz.utility.*;

public class LeapYear 
{
	public static void main(String args[])
	{
		LeapYearFunction ly=new LeapYearFunction();
		System.out.println("Enter the year:");
		int year=ly.inputYear();
		String result=ly.leapYear(year);
		System.out.println(result);
		
	}

}
