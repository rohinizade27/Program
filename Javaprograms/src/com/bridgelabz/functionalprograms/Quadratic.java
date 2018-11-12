package com.bridgelabz.functionalprograms;

import com.bridgelabz.utility.QuadraticFunction;

public class Quadratic {
	public static void main(String args[])
	{
		double a=0,b=0,c=0;
		double root=0;
		double delta=0;
		QuadraticFunction qf=new QuadraticFunction();
		
		System.out.println("Enter value of a:");
		a=qf.getInput();
		System.out.println("Enter value of b:");
		b=qf.getInput();
		System.out.println("Enter value of c:");
		c=qf.getInput();
		
		System.out.println("delta:");
	    delta=qf.computDelta(a,b,c);
		
		System.out.println("Root1 is:");
		root=qf.findRoot(delta,a,b);
		
	
	}
}
