package com.bridgelabz.utility;

//import java.text.SimpleDateFormat;
import java.util.*;

public class StopWatchFunction 
{
   Scanner scanner=new Scanner(System.in);
	

	public long startTime(int input, long start_time) 
	{
		/*
		if(input==1)
		{*/
		    start_time=System.currentTimeMillis();
		    return start_time;
	/*
		else
		{
			System.out.println("invalid input to start the stop watch");
			System.exit(0);
		}
		return 0;	*/
		
	}
	
	public long stopTime(int input, long stop_time) 
	{
		
		/*if(input==0)
		{*/
		   stop_time=System.currentTimeMillis();
		   return stop_time;
		   /* }
		else
		{
			System.out.println("invalid input to stop the stop watch");
			System.exit(0);
		}
		return 0;*/
	}


	public long elapsedTime(long start_time, long stop_time)
	{
		long elapsed=stop_time-start_time;
		return elapsed/1000;
	}

	public Integer inputStartNStop() 
	{
	return scanner.nextInt();
	}

	/*public String convertTime(long c_time) 
	{
		SimpleDateFormat sdf = new SimpleDateFormat("MMM dd,yyyy HH:mm");  
		Date resultdate = new Date(c_time);
		return(sdf.format(resultdate));
	}*/

	
	



}
