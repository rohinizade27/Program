package com.bridgelabz.utility;
import com.bridgelabz.functionalprograms.*;
import java.util.*;

public class CouponFunction 
{
	Scanner scanner= new Scanner(System.in);
	int random_number;
	int randomcount=0;
	int distinct_cnt = 0;
	int count=0;
	int flag=0;
	
	public int inputFunction() 
	{
      return scanner.nextInt();
	}
	public int findDistinct(int n) 
	{
        int distinct_array[]=new int[n];
		Random random=new Random();
		
		while(n > distinct_cnt)
		{
			flag=0;
			random_number=random.nextInt();
			randomcount++;
			System.out.println(random_number);
		
			for(int i=0;i<n;i++)
			{  
			if(distinct_array[i]!=random_number && 0<random_number)
			   flag=1; 
			}
			if(flag==1)
		     {
			   distinct_array[count]=random_number;
			   count++;
			   distinct_cnt++;
			 }
		  }
    System.out.println("total random numbers required:" +randomcount);
    System.out.println("Distinct Coupons are:");
    for(int j=0;j<distinct_array.length;j++)
	  System.out.println(distinct_array[j]);
    return distinct_cnt; 
    }
}


