package com.bridgelabz.functionalprograms;
import java.util.Scanner;

import com.bridgelabz.utility.*;

public class Coupon 
{
	public static void main(String args[])
	{
		
		CouponFunction cf=new CouponFunction ();
		System.out.println("Enter the N distinct coupan number:");
		int n=cf.inputFunction();
		System.out.println("Enter range to generate random number:");
		int range=cf.inputFunction();
		System.out.println("Random no generated are:");
		int rn=cf.generateRandom(n,range);
		System.out.println(rn);
		System.out.println("Distinct Coupons are:");
		int distinct=cf.distinctCoupons(n);
		System.out.println(distinct);
		System.out.println("Distinct Coupons are:");

		
		
		
	}
}
