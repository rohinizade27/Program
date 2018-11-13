package com.bridgelabz.functionalprograms;
import com.bridgelabz.utility.Utility;

public class PrimeFactor 
{

    public static void main(String args[]) 
    {
       Utility utility=new Utility();
       System.out.println("Enter the number:");
       int number=utility.getInput();
       System.out.println("prime factors of given number are:");
       int primefactor=utility.primeFactors(number); 
       System.out.println(primefactor);
    }
}
