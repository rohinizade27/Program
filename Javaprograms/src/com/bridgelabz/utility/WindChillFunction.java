package com.bridgelabz.utility;
import java.util.*;

import java.math.*;

public class WindChillFunction 
{
	Scanner s= new Scanner(System.in);

	public void  computeWindChill(int t, int v) 
	{
		
		double wc=0.0;
		if(Math.abs(t)<=50 && (Math.abs(v)<=120 && Math.abs(v)>=3))
		{
			
				wc=(85.74+0.6215+(0.4275*t-35.75)*Math.pow(v,0.16));
				System.out.println("Result	"+ wc);
			  
		}
		else
		{
			System.out.println("Entered value for t and v are invalid..!!!");
			System.out.println("Entered value for t :");
			t=s.nextInt();
			System.out.println("Entered value for t :");
			v=s.nextInt();
			computeWindChill(t,v);
		}
		
		}
			
      
	}

	
