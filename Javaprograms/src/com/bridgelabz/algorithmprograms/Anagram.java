package com.bridgelabz.algorithmprograms;
import com.bridgelabz.utility.util;

public class Anagram 
{
	public static void main(String args[])
	{
		System.out.println("Enter 1st String");
		String string1=util.acceptString();
		
		System.out.println("Enter 2nd String");
		String string2=util.acceptString();
		
		util.checkAnagram(string1,string2);
	}

}
