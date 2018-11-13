package com.bridgelabz.functionalprograms;
import com.bridgelabz.utility.Utility;

public class Quadratic {
	public static void main(String args[])
	{
		double a=0,b=0,c=0;
		double delta=0;
		Utility utility=new Utility();
		
		System.out.println("Enter value of a:");
		a=utility.getInputDouble();
		System.out.println("Enter value of b:");
		b=utility.getInputDouble();
		System.out.println("Enter value of c:");
		c=utility.getInputDouble();
		
		System.out.println("delta:");
	    delta=utility.computDelta(a,b,c);
	    
		utility.findRoot(delta,a,b);
		
	
	}
}
