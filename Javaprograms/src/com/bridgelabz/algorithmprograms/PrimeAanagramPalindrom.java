package com.bridgelabz.algorithmprograms;
import com.bridgelabz.utility.Utility;

public class PrimeAanagramPalindrom 
{
	public static void main(String args[])
	{
		System.out.println("ENTER THE LOWER LIMIT");
	    int lowerlimit=Utility.acceptLimits();
	    System.out.println("ENTER THE UPPER LIMIT");
	    int upperlimit=Utility.acceptLimits();
	    
	    int primenumber[]=new int[upperlimit];
	    
	    System.out.println("prime number between given range are:");
	    primenumber=Utility.findPrimeRange(lowerlimit, upperlimit);
	     
	    Utility.checkPalindrome(primenumber);
	    Utility.checkAnagram(primenumber);
	   
	}
}
