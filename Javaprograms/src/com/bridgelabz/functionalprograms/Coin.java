package com.bridgelabz.functionalprograms;
import com.bridgelabz.utility.Utility;

public class Coin 
{
	public static void main(String args[])
    {
	
	int numoftrials;
	int headcount;
    int tailcount;
	double headpercent;
	double tailpecent;
	String result;
	
	Utility utility=new Utility();
	System.out.println("Enter the number of times to Flip Coin:");
	numoftrials=utility.getInput();
	double randomnumberarray[]=utility.genrateRandom(numoftrials);
	
	System.out.println("head count is:");
	headcount=utility.headCount(numoftrials,randomnumberarray);
	System.out.println(headcount);
	
	System.out.println("Tail count is:");
	tailcount=utility.tailCount(numoftrials,randomnumberarray);
	System.out.println(tailcount);
	
	
	headpercent=utility.headPercent(numoftrials,headcount);
	System.out.println("percentage of head:"+headpercent);
	
	tailpecent=utility.tailPercent(numoftrials,tailcount);
	System.out.println("percentage of tail:"+tailpecent);
	
	result=utility.compare(headcount,tailpecent);
	System.out.println(result);
	
	}
}
