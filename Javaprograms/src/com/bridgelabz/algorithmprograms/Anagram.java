package com.bridgelabz.algorithmprograms;
import com.bridgelabz.utility.Utility;


public class Anagram 
{
	public static void main(String args[])
	{
		System.out.println("Enter 1st String");
		String string1=Utility.acceptString();
		
		System.out.println("Enter 2nd String");
		String string2=Utility.acceptString();
		
		 Utility.checkAnagram(string1,string2);
	}

}
