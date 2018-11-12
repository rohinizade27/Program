package com.bridgelabz.utility;

import com.bridgelabz.functionalprograms.*;
import java.util.*;

public class ReplaceStringFunction 
{
	Scanner scanner=new Scanner(System.in);
	public String acceptString()
	{
		return scanner.next();
	}


	public String replacestr(String username, String name)
	{
	
		int strlen=name.length();
		if(strlen>=3)
		{
		String result = username.replace("<<username>>",name);
		return result;
		}
		else
			System.out.println("Please input name with more than 3 characters");
			
		return null;
		
	 }
	
	
}
