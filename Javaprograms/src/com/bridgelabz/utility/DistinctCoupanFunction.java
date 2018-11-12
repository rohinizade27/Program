package com.bridgelabz.utility;

import java.util.Random;
import java.util.Scanner;

public class DistinctCoupanFunction  
{
	int ran_no[]=new int[1000];
	Scanner scanner= new Scanner(System.in);
	int random_number;
	int randomcount=0;
	int distinct_cnt = 0;
	int count=0;
	public int inputFunction() 
	{
      return scanner.nextInt();
	}
	public int findDistinctCoupans(int number) 
	{
		Random random=new Random();
		while(number>=distinct_cnt)
		{
			random_number=random.nextInt();
			randomcount++;
			
			//ran_no[count]=random_number;
			//count++;
		}
		return 0;
	}

}
