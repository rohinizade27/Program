package com.bridgelabz.functionalprograms;
import com.bridgelabz.utility.*;
import java.lang.Math;
public class Coin 
{
	public static void main(String args[])
    {
	
	int no_of_trials;
	int hcnt;
    int tcnt;
	
	double hper;
	double tper;
	String result;
	
	CoinFunction cfun=new CoinFunction();
	System.out.println("Enter the number of times to Flip Coin:");
	no_of_trials=cfun.getInput();
	double arr_rn[]=cfun.genrateRandom(no_of_trials);
	
	System.out.println("head count is:");
	hcnt=cfun.headCount(no_of_trials,arr_rn);
	System.out.println(hcnt);
	
	System.out.println("Tail count is:");
	tcnt=cfun.tailCount(no_of_trials,arr_rn);
	System.out.println(tcnt);
	
	
	hper=cfun.headPercent(no_of_trials,hcnt);
	System.out.println("percentage of head:"+hper);
	
	tper=cfun.tailPercent(no_of_trials,tcnt);
	System.out.println("percentage of tail:"+tper);
	
	result=cfun.compare(hper,tper);
	System.out.println(result);
	
	}
}
