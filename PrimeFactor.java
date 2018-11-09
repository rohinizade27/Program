package com.bridgelabz.functionalprograms;
import com.bridgelabz.utility.*;

public class PrimeFactor 
{

    public static void main(String args[]) 
    {
       PrimeFunction pf=new PrimeFunction();
       System.out.println("Enter the number:");
       int number=pf.inputFunction();
       System.out.println("prime factors of given number are:");
       int num=pf.primeFactors(number); 
       System.out.println(num);

       
       
       
    }
}
