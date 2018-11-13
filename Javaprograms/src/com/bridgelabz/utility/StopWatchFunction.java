package com.bridgelabz.utility;

//import java.text.SimpleDateFormat;
import java.util.*;

public class StopWatchFunction 
{
   Scanner scanner=new Scanner(System.in);
	

	public long startTime(int input, long start_time) 
	{
		 start_time=System.currentTimeMillis();
		    return start_time;	
	}
	
	public long stopTime(int input, long stop_time) 
	{
		
		   stop_time=System.currentTimeMillis();
		   return stop_time;
	}


	public void elapsedTime(long start_time, long stop_time)
	{
		long elapsed=stop_time-start_time;
		System.out.println("elapsedtime" + elapsed/1000 + "  seconds");
		 
	}

	
	/*public String convertTime(long c_time) 
	{
		SimpleDateFormat sdf = new SimpleDateFormat("MMM dd,yyyy HH:mm");  
		Date resultdate = new Date(c_time);
		return(sdf.format(resultdate));
	}*/
}
