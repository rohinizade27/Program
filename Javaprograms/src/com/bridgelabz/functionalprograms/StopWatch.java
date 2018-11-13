package com.bridgelabz.functionalprograms;

import com.bridgelabz.utility.Utility;

public class StopWatch 
{
	public static void main( String args[])
	{
		long starttime=0;
		long stoptime=0;
		int input=0;
		int choice=0;
		Utility utility=new Utility();
		
		do
		{
			System.out.println("press 1 to start");
			System.out.println("Enter your choice:");
			choice=utility.getInput();
		if(choice==1)
		{
		switch(choice)
		{
		case 1:System.out.println("start time:");
		       starttime=utility.startTime(input,starttime);
		       System.out.println(starttime);
		       
		        System.out.println("press 0 to stop");
				System.out.println("Again Enter your choice:");
				choice=utility.getInput();
				if(choice==0)
				{
				do
				{
				  switch(choice)
				  {
				  case 0 :System.out.println("stop time:");
			              stoptime=utility.stopTime(input,stoptime);
			              System.out.println(stoptime);
			               break;
				  default: System.out.println("invalid input to the stop watch");
			               break;
				  }
				 }while(choice>0||choice<0);
				break;
				}
				else
					System.out.println("!!!!..Invalid input..!!!");
				
		 default: System.out.println("Invalid input to start stop watch");
         break;
	       } 
		}
		else
			System.out.println("!!!!..Invalid input..!!!");
	  }while(choice>1);
	  
	utility.elapsedTime(starttime,stoptime);
		  
		
	}	      
		       
}
		
		
		
		
		
		
		
		
		



