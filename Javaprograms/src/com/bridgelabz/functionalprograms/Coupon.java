package com.bridgelabz.functionalprograms;
import com.bridgelabz.utility.Utility;
public class Coupon 
{
	public static void main(String args[])
	{
		Utility utility=new Utility();
		System.out.println("Enter the N distinct coupan number:");
		int number=utility.getInput();
		
		int distinct=utility.findDistinct(number);
		System.out.println("Total Distinct Coupons:"+ distinct);
	}
}
