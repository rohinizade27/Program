package com.bridgelabz.functionalprograms;
import com.bridgelabz.utility.CouponFunction;
public class Coupon 
{
	public static void main(String args[])
	{
	    CouponFunction cf=new CouponFunction ();
		System.out.println("Enter the N distinct coupan number:");
		int n=cf.inputFunction();
		
		int distinct=cf.findDistinct(n);
		System.out.println("Total Distinct Coupons:"+ distinct);
	}
}
