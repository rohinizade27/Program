package com.bridgelabz.functionalprograms;

import com.bridgelabz.utility.Utility;

public class Triplate {
	public static void main(String[] args) 
	{
		
		Utility utility=new Utility();
		System.out.println("Enter size array:");
		int size=utility.getInput();
		int array[]=new int[size];
		utility.inputAccept(size,array);
		System.out.println("Distinct triplates are:");
		utility.findDistinctTriplate( size, array);
	}

}
