package com.bridgelabz.algorithmprograms;
import com.bridgelabz.utility.Utility;

public class PrimeRange 
{
  public static void main(String args[])
  {
    System.out.println("ENTER THE LOWER LIMIT");
    int lower_limit=Utility.acceptLimits();
    System.out.println("ENTER THE UPPER LIMIT");
    int upper_limit=Utility.acceptLimits();
    
    System.out.println("prime number between given range are:");
    Utility.findPrimeRange(lower_limit, upper_limit);
    
  }
}
