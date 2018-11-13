package com.bridgelabz.functionalprograms;
import com.bridgelabz.utility.Utility;

public class EuclideanDistance 
{
	public static void main(String args[])
	{
		double x= Double.parseDouble(args[0]);
		double y= Double.parseDouble(args[1]);
		
		Utility utility=new Utility();
		utility.FindEuclideanDistance(x,y);
	}
}