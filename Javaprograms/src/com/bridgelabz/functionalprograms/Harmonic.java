package com.bridgelabz.functionalprograms;
import com.bridgelabz.utility.Utility;
 public class Harmonic
{
	public static void main(String args[])
	{
     Utility utility=new Utility();
     System.out.println("Enter the n:");
     int number=utility.getInput();
     System.out.println("Harmonic value is");
     double result= utility.harmonicSeries(number);
     System.out.println(result);
    }
}
