package com.bridgelabz.functionalprograms;
import com.bridgelabz.utility.GamblerFunction;

public class Gambler 
{
	public static void main(String args[])
	{
		
		GamblerFunction gfun=new GamblerFunction();
		System.out.println("Enter the number of trials:");
		int trials=gfun.input();
		System.out.println("Enter the stake:");
		int stake=gfun.input();
		System.out.println("Enter the goal:");
		int goal=gfun.input();
		
		int result=gfun.gamblerLogic(trials,stake,goal);
	}
}
