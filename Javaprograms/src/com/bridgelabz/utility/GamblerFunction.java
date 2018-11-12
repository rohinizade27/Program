package com.bridgelabz.utility;
import java.util.*;

public class GamblerFunction 
{
	Scanner scanner=new Scanner(System.in);
	int wincnt=0;
	int losscnt=0;
	int bets=0;

	public int input() 
	{
		return scanner.nextInt();
	}

	public int gamblerLogic(int trials, int stake, int goal) 
	{
		 for (int t = 0; t < trials; t++) 
		    {
		    	int cash = stake;
	            while (cash > 0 && cash < goal) 
	            {
	                bets++;
	                if (Math.random() < 0.5) cash++;     
	                else                     cash--;   
	            }
	            if (cash == goal) wincnt++;  
	            else 
	            	losscnt++;
		    }
		 System.out.println(wincnt + " wins of " + trials);
	     System.out.println("Percentage of games won:" + 100.0 * wincnt / trials);
	     System.out.println("percentage of game loss :"+100.0*losscnt/trials);
	     System.out.println("Avg bets :" + 1.0 * bets / trials);
		 
		 return 0;
		 
	}
	

}
