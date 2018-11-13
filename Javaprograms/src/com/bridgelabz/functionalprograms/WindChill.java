package com.bridgelabz.functionalprograms;
import com.bridgelabz.utility.Utility;
public class WindChill
{
	public static void main(String args[])
	{
		Utility utility=new Utility();
		int t= Integer.parseInt(args[0]);
		int v= Integer.parseInt(args[1]);
		 utility.computeWindChill(t,v);
		//System.out.println(w);
	}

}
