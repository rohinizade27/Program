package com.bridgelabz.functionalprograms;

import com.bridgelabz.utility.*;
import java.util.*;

public class DistinctTriples
{
   public static void main(String[] args) 
	{
	 Scanner scanner = new Scanner(System.in);
	 DistinctTriplesFunction dtf= new DistinctTriplesFunction();
	 System.out.println("Enter the size of array:");
	 int size=scanner.nextInt();
	 int[] array= new int[size];
	 System.out.println("Enter the elements of array:");
     for(int i=0;i<array.length;i++)
     {
      array[i]=scanner.nextInt();
     }
     
    }
}
