package com.bridgelabz.functionalprograms;
import com.bridgelabz.utility.Utility;

public class Gambler 
{
	public static void main(String args[])
	{
		
		Utility utility=new Utility();
		System.out.println("Enter the number of trials:");
		int trials= utility.getInput();
		System.out.println("Enter the stake:");
		int stake= utility.getInput();
		System.out.println("Enter the goal:");
		int goal= utility.getInput();
	    utility.gamblerLogic(trials,stake,goal);
	}
}
