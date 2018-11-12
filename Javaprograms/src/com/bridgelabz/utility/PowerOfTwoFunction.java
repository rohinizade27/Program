package com.bridgelabz.utility;
import java.util.Scanner;

public class PowerOfTwoFunction 
{

	public void compute(int n) 
	{
		int i = 0;
        int power = 1;
        if(n<=31)
        {
         for(i=0;i<n;i++)
         {
           System.out.println("power of 2"+i+" = " + power);
           power = power * 2;
          } 
         }
     }
}
