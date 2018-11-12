package com.bridgelabz.functionalprograms;

import com.bridgelabz.utility.WindChillFunction;

public class WindChill {
	public static void main(String args[])
	{
		WindChillFunction wcf=new WindChillFunction();
		int t= Integer.parseInt(args[0]);
		int v= Integer.parseInt(args[1]);
		wcf.computeWindChill(t,v);
		//System.out.println(w);
	}

}
