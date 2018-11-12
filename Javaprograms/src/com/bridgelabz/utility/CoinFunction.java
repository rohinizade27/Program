package com.bridgelabz.utility;

import com.bridgelabz.functionalprograms.*;
import java.util.*;

public class CoinFunction 
{
	Scanner scanner = new Scanner(System.in);

    public int getInput() 
	{
    	return scanner.nextInt();
	}
    
    

	public double[] genrateRandom(int no_of_trials) 
	{
		double rn[]=new double[no_of_trials];
		for(int i=0;i<no_of_trials;i++)
		{
		   rn [i]=Math.random();
		   System.out.println(i+"flip:"+rn[i]);
	    }
		 return rn;
	}
	

	public int headCount(int no_of_trials, double[] arr_rn) 
    {
        int h=0;
		for(int i=0;i<no_of_trials;i++)
		{
		  if(arr_rn[i]>0.5)
		  {
			  h=h+1;		
			  
		  }
		 
		}
		return h;
	}
	

	public int tailCount(int no_of_trials, double[] arr_rn) 
	{
		int t=0;
		for(int i=0;i<no_of_trials;i++)
		{
		  if(arr_rn[i]<0.5)
		  {
			  t=t+1;		
			  
		  }
		 
		}
		return t;
	}


	public double headPercent(int no_of_trials, int hcnt)
	{
		return (hcnt * 100)/no_of_trials;

	}
	
	public double tailPercent(int no_of_trials, int tcnt) 
	{
		return (tcnt * 100)/no_of_trials;

	}


   public String compare(double hper, double tper) 
	{
		if(hper>tper)
		{
		return(" head percentage is greater");
		}
		else
		{
		return(" Tail percentage is greater");	
		}

	}



	







	




	


	

   





	

}
