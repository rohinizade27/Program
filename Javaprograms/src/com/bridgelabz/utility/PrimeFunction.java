package com.bridgelabz.utility;

import com.bridgelabz.functionalprograms.*;
import java.util.*;

public class PrimeFunction 
{
	Scanner scanner = new Scanner(System.in);
	public int inputFunction()
	{
		return scanner.nextInt();
		
	}

	public int primeFactors(int number)
	{
		//int arr_num[]=new int[100];
		 while (number%2==0) 
	        { 
	            System.out.print(2 + " "); 
	            number = number/2; 
	        } 
	        for (int i = 3; i <= Math.sqrt(number); i+= 2) 
	        { 
	            
	            while (number%i == 0) 
	            { 
	           System.out.print(i+ " "); 
	            number =number/i; 
	              
	               
	            } 
	        } 
	        if (number > 2) 
	            return(number);
	        return (number);
	}
	
 
}
