package com.bridgelabz.utility;
import java.io.PrintWriter;
import java.util.Scanner;

public class TwoDArrayFunction 
{
	Scanner s= new Scanner(System.in);
	
    public int input() 
	{
		return s.nextInt();
	}
	public void printTwoDArray(int r, int c) 
	{
		PrintWriter printwriter = new PrintWriter(System.out,true); 
		int arr1[][] = new int[r][c]; 
	    System.out.println("Enter the values:");
	    for(int i=0;i<r;i++)
	    {
	    	for(int j=0;j<c;j++)
	    	{
	    		arr1[i][j]=s.nextInt();
	    	}
	    }
	    System.out.println("\n");
	    for(int i=0;i<r;i++)
	    {
	    	for(int j=0;j<c;j++)
	    	{
	    		
	            printwriter.print(" "+arr1[i][j]);
	    		
	    	}
	    	printwriter.println();
	    }
		
		
		}
		
	}

