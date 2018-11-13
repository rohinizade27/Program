package com.bridgelabz.functionalprograms;

import com.bridgelabz.utility.Utility;

public class StopWatch 
{
	public static void main( String args[])
	{
		long starttime=0;
		long stoptime=0;
		int input=0;
		int ch=0;
		Utility utility=new Utility();
		
		do
		{
			System.out.println("Press 1 start");
			System.out.println("Enter your choice:");
			ch=utility.getInput();
		if(ch==1)
		{
		switch(ch)
		{
		case 1:System.out.println("start time:");
		       starttime=utility.startTime(input,starttime);
		        System.out.println(starttime/1000);
		       
		        System.out.println("press 0 stop");
				System.out.println(" again Enter your choice:");
				ch=utility.getInput();
				if(ch==0)
				{
				do
				{
				  switch(ch)
				  {
				  case 0 :System.out.println("stop time:");
			              stoptime=utility.stopTime(input,stoptime);
			              System.out.println(stoptime);
			               break;
				  default: System.out.println("invalid input to the stop watch");
			               break;
				  }
				 }while(ch>0||ch<0);
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
	  }while(ch>1||ch<1);
	  
	System.out.println("elapsed time:");
	utility.elapsedTime(starttime,stoptime);
		//time=swf.convertTime(elapsed_time);
		//System.out.println(elapsedtime + "  seconds"); 
		// System.out.println(time);
		
	}	      
	
}
		
		
		
		
		
		
		
		
		
		
		
		
		



