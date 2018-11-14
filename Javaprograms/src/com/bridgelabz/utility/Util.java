package com.bridgelabz.utility;
import java.util.Scanner;
import java.util.Arrays; 
public class Util 
{
	static Scanner scanner=new Scanner(System.in);
	
	public static String acceptString()
	{
		String s1=scanner.nextLine();
		return s1;
	}
	
	
	public static void checkAnagram(String string1, String string2)
	{
		
		string1= string1.replace(" ","");
		string2= string2.replace(" ","");
		
		char[] ch1 = string1.toCharArray();
		char[] ch2 = string2.toCharArray();
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		
		boolean result = Arrays.equals(ch1, ch2);
		
		if(result==true)
		
			System.out.println("Enter String is Anagram");
		else
			System.out.println("Enter String is not Anagram");
		
	}
	
	
	
	
	
	public static Integer acceptLimits()
	{
		Integer l=scanner.nextInt();
		return l;
	}
	
	public static void findPrimeRange(int lower_limit,int upper_limit)
	{
		int i=0,j=0;
		int flag=0;
		int cnt=0;
		int prime_arr[]=new int[upper_limit];
		int reverse_num=0;
		int r;
		
		
		for( i=lower_limit;i<upper_limit;i++)
		{     
		 if(i==0 && i==1)
			 continue;
			for(j=2;j<i;j++)
			{
				if(i%j==0)
				{
					flag=1;
					break;
				}
				else
				{ flag=0; }
			}
			if(flag==0)
			{ cnt++;
			 prime_arr[i]=i;
			 System.out.println(" "+i);
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
		
		
		
		
	}
}

