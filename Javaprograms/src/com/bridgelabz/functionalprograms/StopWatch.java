package com.bridgelabz.functionalprograms;

import com.bridgelabz.utility.StopWatchFunction;

public class StopWatch 
{
	public static void main( String args[])
	{
		long start_time=0;
		long stop_time=0;
		long elapsed_time=0;
		//String time="";
		int input=0;
		int ch=0;
		StopWatchFunction swf=new StopWatchFunction();
		
		do
		{
			System.out.println("1.start");
			System.out.println("Enter your choice:");
			ch=swf.inputStartNStop();
		if(ch==1)
		{
		switch(ch)
		{
		case 1:System.out.println("start time:");
		       start_time=swf.startTime(input,start_time);
		      // time=swf.convertTime(start_time);
		      // System.out.println(time);
		       System.out.println(start_time/1000);
		       
		        System.out.println("2.stop");
				System.out.println(" again Enter your choice:");
				ch=swf.inputStartNStop();
				if(ch==0)
				{
				do
				{
				  switch(ch)
				  {
				  case 0 :System.out.println("stop time:");
			              stop_time=swf.stopTime(input,stop_time);
			             // time=swf.convertTime(stop_time);
			               //System.out.println(time);
			              System.out.println(stop_time);
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
		  elapsed_time=swf.elapsedTime(start_time,stop_time);
		  //time=swf.convertTime(elapsed_time);
		  System.out.println(elapsed_time + "  seconds"); 
		 // System.out.println(time);
		
	}	      
		       
		       
              /*case 0:System.out.println("stop time:");
		       stop_time=swf.stopTime(input,stop_time);
		       time=swf.convertTime(stop_time);
		       System.out.println(time);
		       break;*/
	  
		      }
		
		
		
		
		
		/*System.out.println("Press '1' to Start Time:");
	    input=swf.inputStartNStop();
		System.out.println("start time:");
		start_time=swf.startTime(input,start_time);
		time=swf.convertTime(start_time);
		System.out.println(time);*/
		
		
		
		
		/*System.out.println("Press '0' to Stop Time: ");
		input=swf.inputStartNStop();
		System.out.println("stop time:");
		stop_time=swf.stopTime(input,stop_time);
		time=swf.convertTime(stop_time);
		System.out.println(time);*/
		
		
		
		



