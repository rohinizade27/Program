package com.bridgelabz.functionalprograms;

import com.bridgelabz.utility.TriplateFunction;
import java.util.Scanner;

public class Triplate {
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		TriplateFunction tf=new TriplateFunction();
		System.out.println("Enter size array:");
		int size=s.nextInt();
		int array[]=new int[size];
		int input=tf.inputAccept(size,array);
		System.out.println("Distinct triplates are:");
	    tf.findDistinctTriplate( size, array);
	}

}
