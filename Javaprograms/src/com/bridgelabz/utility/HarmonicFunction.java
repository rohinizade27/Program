package com.bridgelabz.utility;

import com.bridgelabz.functionalprograms.*;
import java.util.*;

public class HarmonicFunction
{
	Scanner scanner=new Scanner(System.in);
	

public double harmonicSeries(int n) 
{
	double r=0.0;
	while(n>0)
	{
		r = r + (double) 1 / n;
		n--;
	}
	return (r);
}


public int inputvalue() {
	return scanner.nextInt();
}



}
