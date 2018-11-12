package com.bridgelabz.utility;

import com.bridgelabz.functionalprograms.*;
import java.util.*;

public class LeapYearFunction 
{
	Scanner scanner=new Scanner(System.in);

	public int inputYear() 
	{
		return scanner.nextInt();
	}

	public String leapYear(int year) 
	{
		int flag=0;
		if(String.valueOf(year).length()<4)
		{
			System.out.println("please enter 4 digit no:");
			year=scanner.nextInt();
			leapYear(year);
		}
		
		else if(year%4==0)
		{
			if(year%100==0)
			{
				if(year%400==0)
			        flag=1;
					
				else
					flag=0;
			}
			else
				flag=1;
			
		}
		else
		 flag=1;
		
		if(flag==1)
		return("Entered year is leap year..!!");
	
		else
			return("Entered year is  not leap year..!!");
	}
}	
	

