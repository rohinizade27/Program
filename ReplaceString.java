package com.bridgelabz.functionalprograms;
import com.bridgelabz.utility.*;

public class ReplaceString 
{
	public static void main( String args[])
	{
		ReplaceStringFunction rsf=new ReplaceStringFunction();
		String template="hello <<username>>";
		System.out.println("Enter name:");
		String name=rsf.acceptString();
		String result=rsf.replacestr(template,name);
		System.out.println(result);
	}
	

}
