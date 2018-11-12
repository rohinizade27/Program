package com.bridgelabz.functionalprograms;
import com.bridgelabz.utility.EuclideanDistanceFunction;

public class EuclideanDistance 
{
	public static void main(String args[])
	{
		double x= Double.parseDouble(args[0]);
		double y= Double.parseDouble(args[1]);
		
		EuclideanDistanceFunction edf=new EuclideanDistanceFunction(); 
		double result=edf.FindDistance(x,y);
	}
}