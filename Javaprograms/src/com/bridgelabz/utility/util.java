package com.bridgelabz.utility;
import java.util.Scanner;
public class util 
{
	static Scanner scanner=new Scanner(System.in);
	
	public static String acceptString()
	{
		String s1=scanner.next();
		return s1;
	}
	
	
	public static boolean checkAnagram(String string1, String string2)
	{
		int flag=0;
		int cnt=0;
		char[] ch1 = string1.toCharArray();
		char[] ch2 = string2.toCharArray();
		if(ch1.length==ch2.length)
		{
		  for(int i=0;i<ch1.length;i++)
		  {  
			 for(int j=0;j<ch2.length;j++)
			 {
				 if(ch1[i]==ch2[j])
				 {
					cnt++; 
				 }
			 }
		  }
		}
		if(ch1.length==cnt)
		{
			flag=1;
			System.out.println("Enter String is Anagram");
			
		}
		else
		{
			System.out.println("Enter String is not Anagram");
		}
		return false;
	}
	
	
	
	
	
	public static Integer acceptLimits()
	{
		Integer l=scanner.nextInt();
		return l;
	}
	
	public static int[] findPrimeRange(int lower_limit,int upper_limit)
	{
		
		int i=0,j=0;
		int flag=0;
		int cnt=0;
		int prime_arr[]=new int[upper_limit];
		int reverse_num=0;
		int r;
		
		
		for( i=lower_limit;i<upper_limit;i++)
		{     if(i==0 && i==1)
			continue;
			for(j=2;j<i;j++)
			{
				if(i%j==0)
				{
					flag=1;
					break;
				}
				else
				{
					flag=0;
					
				}
			}
			if(flag==0)
			{
			cnt++;
			
			prime_arr[i]=i;
			//System.out.println(" "+i);
			}
			
		}
		/*System.out.println("total no of prime number : "+cnt);
		for(i=0;i<cnt;i++)
		{
			System.out.println(prime_arr[i]);
		}
		
		// Code for finding weather given prime numbers are palindrome or not
		for(i=0;i<cnt;i++)
		{
			
			 int temp = prime_arr[i];
			 
			 while( prime_arr[i]!=0 )
			 {
			 r=prime_arr[i]%10;
			 reverse_num= reverse_num*10+r;
			 prime_arr[i]=prime_arr[i]/10;
			 }
			 if(temp==reverse_num)
			 {
				 System.out.println( prime_arr[i]+"	is palindrome");
			 }
	
		}*/
		
		
		
		
		return prime_arr;
	}
}

