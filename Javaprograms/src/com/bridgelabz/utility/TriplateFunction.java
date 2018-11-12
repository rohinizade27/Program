package com.bridgelabz.utility;
import java.util.Scanner;

public class TriplateFunction
{
	
	Scanner s=new Scanner(System.in);
	int i,j,k;
	public void findDistinctTriplate(int size, int[] array) 
	{ 
		int flag=0;

	 for(i=0;i<size-2;i++)
	 {
		 for(j=i+1;j<size-1;j++)
		 {
			  for(k=j+1;k<size;k++)
			  {
					if(array[i]+ array[j]+ array[k]==0) 
					{
						System.out.println("  "+array[i] +"	 "+array[j]+"  "+array[k]);
					
						flag=1;
					}
				 }
		       }
		  }
	 if(flag==0)
	 {
		 System.out.println("Distinct triplates not exist");
	 }
		}
	
	public int inputAccept(int size, int[] array) 
	{
		
		System.out.println("Enter elements of array:");
	     for(i=0;i<size;i++)
	     {
		 array[i]=s.nextInt();
	     }
	     for(i=0;i<size;i++)
	     {
		 System.out.println(array[i]);
	     }
	  return 0;
	  }

	}


