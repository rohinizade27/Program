package com.bridgelabz.functionalprograms;
import com.bridgelabz.utility.*;

public class ReplaceString 
{
	public static void main( String args[])
	{
		Utility utility=new Utility();
		String template="hello <<username>>";
		System.out.println("Enter name:");
		String name=utility.inputString();
		String result=utility.replacestring(template,name);
		System.out.println(result);
	}
}
