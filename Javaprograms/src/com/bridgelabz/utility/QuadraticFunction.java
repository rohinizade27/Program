package com.bridgelabz.utility;

import java.util.*;

public class QuadraticFunction {
	Scanner s=new Scanner(System.in);

	public double getInput() 
	{
		
		return s.nextDouble();
	}

	public double computDelta(double a, double b, double c) 
	{
		double d=0.0;
		return d = b*b - 4*a*c;
	}

	public double findRoot(double delta, double a, double b) 
	{	
		double r1,r2;
		double realPart;
		double imaginaryPart;
		if(delta>0)
		{
	
		System.out.println("the roots are real and different");
		r1= (-b + Math.sqrt(delta)) / (2 * a);
		r2= (-b - Math.sqrt(delta))/(2*a);
		System.out.println(r1);
		System.out.println(r2);
		
		}
		else if(delta==0)
		{
			System.out.println("the roots are real and equal");	
			return r1 = -b / (2 * a);
		}
		else
		{
			System.out.println("the roots are complex and different");
			realPart = -b / (2 *a);
			System.out.println("realpart:"+ realPart);
            imaginaryPart = Math.sqrt(-delta) / (2 * a);
            System.out.println( "imaginaryPart" +imaginaryPart);
		}
		return 0;
	}
	
	}
