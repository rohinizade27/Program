package com.bridgelabz.functionalprograms;
import com.bridgelabz.utility.DistinctCoupanFunction;

public class DistinctCoupan
{
	public static void main(String args[])throws ArrayIndexOutOfBoundsException
	{
		DistinctCoupanFunction dcf=new DistinctCoupanFunction();
		System.out.println("Enter the N distinct coupan number:");
		int number=dcf.inputFunction();
		int ran_no[]=new int[1000];
		
		int distinct=dcf.findDistinctCoupans(number);
		
		
		System.out.println("Total Distinct Coupons:"+ distinct);
		
		
	}
}
