package com.bridgelabz.utility;
import java.math.*;

public class EuclideanDistanceFunction 
{

	public double FindDistance(double  x, double  y) 
	{
		double Result1 = Math.pow(x, x);
		double Result2 = Math.pow(y, y);
		double distance = Math.sqrt(Result1 + Result2 );
		System.out.println("Euclidean Distance is:"+distance);
		return 0;
	}
	
	
}
