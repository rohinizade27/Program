package com.bridgelabz.functionalprograms;

import com.bridgelabz.utility.*;

public class Harmonic
{
	public static void main(String args[])
	{
     System.out.println("Enter the harmonic val n:");
     HarmonicFunction hf=new HarmonicFunction();
     int n=hf.inputvalue();
     System.out.println("Harmonic Series is");
     double r= hf.harmonicSeries(n);
     System.out.println(r);
    }
}
