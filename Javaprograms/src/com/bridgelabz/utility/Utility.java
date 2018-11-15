package com.bridgelabz.utility;

import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Utility {
	static Scanner scanner = new Scanner(System.in);

	/**
	 * This method takes an input integer from the user and returns it to the
	 * specified method.
	 * 
	 * @return integer:The input integer value given by the user
	 */
	public int getInput() {
		return scanner.nextInt();
	}

	/**
	 * This method is to generate random numbers.
	 * 
	 * @param numoftrials:Number of times to flip coin
	 * @return array of double type:It returns array of double type which contain
	 *         random number
	 */
	public double[] genrateRandom(int numoftrials) {
		double randomnumber[] = new double[numoftrials];
		for (int i = 0; i < numoftrials; i++) {
			randomnumber[i] = Math.random();
			System.out.println(i + " " + "flip:" + randomnumber[i]);
		}
		return randomnumber;
	}

	/**
	 * This method is to count heads from given trails.
	 * 
	 * @param numoftrials:Number of times to flip coin
	 * @param randomnumberarray:An array which contain random numbers
	 * @return integer:It returns integer value of head's count
	 */
	public int headCount(int numoftrials, double[] randomnumberarray) {
		int head = 0;
		for (int i = 0; i < numoftrials; i++) {
			if (randomnumberarray[i] > 0.5) {
				head = head + 1;
			}
		}
		return head;
	}

	/**
	 * This method is to count tails from given trails.
	 * 
	 * @param numoftrials:Number of times to flip coin
	 * @param randomnumberarray:An array which contain random numbers
	 * @return integer:It returns integer value of tail's count
	 */
	public int tailCount(int numoftrials, double[] randomnumberarray) {
		int tail = 0;
		for (int i = 0; i < numoftrials; i++) {
			if (randomnumberarray[i] < 0.5) {
				tail = tail + 1;
			}
		}
		return tail;
	}

	/**
	 * This method is to calculate head percentage.
	 * 
	 * @param numoftrials:Number of times to flip coin
	 * @param headcount:Total head count from given trails
	 * @return double:It returns the head's percentage
	 */
	public double headPercent(int numoftrials, int headcount) {
		return (headcount * 100) / numoftrials;

	}

	/**
	 * This method is to calculate tail percentage.
	 * 
	 * @param numoftrials:Number of times to flip coin
	 * @param tailcount:Total tail count from given trails
	 * @return double:It returns the tail's percentage
	 */
	public double tailPercent(int numoftrials, int tailcount) {
		return (tailcount * 100) / numoftrials;

	}

	/**
	 * This method compare head's and tail's percentage.
	 * 
	 * @param headpercent:Total head count from given trails
	 * @param tailpecent:Total tail count from given trails
	 * @return String:It return string which contain message regarding result
	 */
	public String compare(double headpercent, double tailpecent) {
		if (headpercent > tailpecent) {
			return (" head percentage is greater");
		} else {
			return (" Tail percentage is greater");
		}

	}

	/******************************
	 * Distinct_Coupon
	 ********************************************************/

	int randomnumber;
	int randomcount = 0;
	int distinctcount = 0;
	int count = 0;
	int flag = 0;

	/**
	 * This method is to create distinct coupon using among generated random
	 * numbers.
	 * 
	 * @param number:Total number of distinct coupon user want to generate
	 * @return integer:It returns the integer value which contain count of distinct
	 *         coupon.
	 */
	public int findDistinct(int number) {
		int distinctarray[] = new int[number];
		Random random = new Random();

		while (number > distinctcount)// generate distinct coupon till it reaches
		// to value(number of distinct coupon) entered by user
		{
			flag = 0;
			randomnumber = random.nextInt();// generate random number
			randomcount++;
			System.out.println(randomnumber);

			for (int i = 0; i < number; i++) {
				if (distinctarray[i] != randomnumber && 0 < randomnumber)// check generated random
					flag = 1; // is unique and should not contain any negative value
			}
			if (flag == 1)// if generated random number is unique
			{
				distinctarray[count] = randomnumber;// store that random number in array
				count++;
				distinctcount++;
			}
		}
		System.out.println("total random numbers required:" + randomcount);
		System.out.println("Distinct Coupons are:");
		for (int j = 0; j < distinctarray.length; j++)
			System.out.println(distinctarray[j]);
		return distinctcount;
	}

	/******************************
	 * Euclidean_Distance
	 *****************************************************/

	/**
	 * This method is to find Euclidean Distance.It accepts two command line
	 * arguments.
	 * 
	 * @param x:Frist command line argument
	 * @param y:Second command line argument
	 */
	public void FindEuclideanDistance(double x, double y) {
		double Result1 = Math.pow(x, x);
		double Result2 = Math.pow(y, y);
		double distance = Math.sqrt(Result1 + Result2);
		System.out.println("Euclidean Distance is:" + distance);
	}

	/******************************
	 * Gambler_Function
	 *************************************************************/

	int wincount = 0;
	int losscount = 0;
	int bets = 0;

	/**
	 * This function is to create gambler game logic
	 * 
	 * @param trials:Number of trails player want
	 * @param stake:Initial cash
	 * @param goal:Targeted cash player have to collect
	 */
	public void gamblerLogic(int trials, int stake, int goal) {
		if (stake < goal) {
			for (int i = 0; i < trials; i++) {
				int cash = stake;
				while (cash > 0 && cash < goal) // cash should not be negative
				// and not equal to goal condition
				{
					bets++;
					if (Math.random() < 0.5)
						cash++;
					else
						cash--;
				}
				if (cash == goal)
					wincount++;
				else
					losscount++;
			}
			System.out.println("wincount is" + " " + wincount);
			System.out.println("Percentage of games won:" + 100.0 * wincount / trials);
			System.out.println("percentage of game loss :" + 100.0 * losscount / trials);
		} else {
			System.out.println("goal should be greater than stake");
			System.out.println("Enter the number of trials:");
			trials = scanner.nextInt();
			System.out.println("Enter the stake:");
			stake = scanner.nextInt();
			System.out.println("Enter the goal:");
			goal = scanner.nextInt();
			gamblerLogic(trials, stake, goal);
		}

	}

	/***************************
	 * Harmonic_Function
	 ***********************************************************************/
	/**
	 * This method is to Print Nth harmonic number.
	 * 
	 * @param number:number which is accepted from user
	 * @return double:It returns the harmonic value of given number
	 */
	public double harmonicSeries(int number) {
		double result = 0.0;
		while (number > 0) {
			result = result + (double) 1 / number;
			number--;
		}
		return (result);
	}

	/******************************
	 * LeapYear_Function
	 *******************************************************************/
	/**
	 * This method is to find whether entered year is leap year or not
	 * 
	 * @param year:four digit number entered by the user
	 * @return string:It return the string which contain message regarding of result
	 */
	public String leapYear(int year) {
		int flag = 0;
		if (String.valueOf(year).length() < 4) {
			System.out.println("please enter 4 digit no:");
			year = scanner.nextInt();
			leapYear(year);
		} else if (year % 400 == 0) {
			if (year % 100 == 0) {
				if (year % 4 == 0)
					flag = 1;

				else
					flag = 0;
			} else
				flag = 1;
		} else
			flag = 0;

		if (flag == 1)
			return ("Entered year is leap year..!!");

		else
			return ("Entered year is  not leap year..!!");
	}

	/********************************
	 * PowerOfTwo
	 ******************************************************/
	/**
	 * This method is to prints a table of the powers of 2 that are less than or
	 * equal to 2^N.
	 * 
	 * @param number:It command-line argument to print table of power of two till it
	 *        reaches to value of number
	 */
	public void compute(int number) {
		int i = 0;
		int power = 1;
		if (number <= 31) {
			for (i = 0; i < number; i++) {
				System.out.println("power of 2^" + i + " = " + power);
				power = power * 2;
			}
		}
	}

	/********************************
	 * prime_Factors
	 ************************************************************************/

	/**
	 * This method is to find the prime factors of given number.
	 * 
	 * @param number:It is the number whose prime factor we want to generate.
	 * @return integer:It returns integer value contain prime factor of given number
	 */
	public int primeFactors(int number) {

		while (number % 2 == 0) // Print the number of 2's that divide n
		{
			System.out.print(2 + " ");
			number = number / 2;
		}
		for (int i = 3; i <= Math.sqrt(number); i = i + 2)// n must be odd
		{

			while (number % i == 0) {
				System.out.print(i + " ");
				number = number / i;
			}
		}
		if (number > 2)
			return (number);

		return (number);
	}

	/*******************************
	 * Quadratic_Function
	 **********************************************************************/

	/**
	 * This method takes an input integer from the user and returns it to the
	 * specified method.
	 * 
	 * @return double:The input double value given by the user
	 */
	public double getInputDouble() {
		return scanner.nextDouble();
	}

	/**
	 * This method is to calculate the delta.
	 * 
	 * @param a:input value entered by user
	 * @param b:input value entered by user
	 * @param c:input value entered by user
	 * @return duble:It returns double type delta value
	 */
	public double computDelta(double a, double b, double c) {
		return b * b - 4 * a * c;
	}

	/**
	 * This method is to find the quadratic equation
	 * 
	 * @param delta:Computed delta to find roots of quadratic equation
	 * @param a:input value entered by user
	 * @param b:input value entered by user
	 * @return double:It returns double value
	 */
	public void findRoot(double delta, double a, double b) {
		double root1, root2;
		double realPart;
		double imaginaryPart;
		if (delta > 0) {

			System.out.println("the roots are real and different");
			root1 = (-b + Math.sqrt(delta)) / (2 * a);
			root2 = (-b - Math.sqrt(delta)) / (2 * a);
			System.out.println(root1);
			System.out.println(root2);

		} else if (delta == 0) {
			System.out.println("the roots are real and equal");
			root1 = -b / (2 * a);
			System.out.println(root1);
		} else {
			System.out.println("the roots are complex and different");
			realPart = -b / (2 * a);
			System.out.println("realpart:" + realPart);
			imaginaryPart = Math.sqrt(-delta) / (2 * a);
			System.out.println("imaginaryPart:" + imaginaryPart);
		}

	}

	/**********************************
	 * ReplaceStringFunction
	 **********************************************************************************/

	/**
	 * This method takes an input integer from the user and returns it to the
	 * specified method.
	 * 
	 * @return string:The input String value given by the user
	 */
	public String inputString() {
		return scanner.nextLine();
	}

	/**
	 * This method is to replace the string with given template
	 * 
	 * @param username:the string which needs to be modified
	 * @param name:input string given by user
	 * @return string:output the modified string
	 */
	public String replacestring(String username, String name) {

		int strlen = name.length();
		if (strlen >= 3) {
			String result = username.replace("<<username>>", name);
			return result;
		} else
			System.out.println("Please input name with more than 3 characters");

		return null;

	}

	/*****************************
	 * StopWatch_Function
	 ********************************************************************/

	/**
	 * @param input
	 * @param start_time
	 * @return
	 */
	public long startTime(int input, long starttime) {
		starttime = System.currentTimeMillis();
		return starttime;
	}

	/**
	 * @param input
	 * @param stop_time
	 * @return
	 */
	public long stopTime(int input, long stoptime) {

		stoptime = System.currentTimeMillis();
		return stoptime;
	}

	/**
	 * @param start_time
	 * @param stop_time
	 * @return
	 */
	public void elapsedTime(long starttime, long stoptime) {
		long elapsed = stoptime - starttime;
		System.out.println("Elapsed time is: " + elapsed / 1000 + "  seconds");

	}

	/*
	 * public String convertTime(long c_time) { SimpleDateFormat sdf = new
	 * SimpleDateFormat("MMM dd,yyyy HH:mm"); Date resultdate = new Date(c_time);
	 * return(sdf.format(resultdate)); }
	 */
	/*****************************
	 * Triplate_Function
	 *****************************************************************/
	int i;
	static /*****************************
	 * Triplate_Function
	 *****************************************************************/
	int j;
	/*****************************
	 * Triplate_Function
	 *****************************************************************/
	int k;

	/**
	 * @param size
	 * @param array
	 */
	public void findDistinctTriplate(int size, int[] array) {
		int flag = 0;

		for (i = 0; i < size - 2; i++) {
			for (j = i + 1; j < size - 1; j++) {
				for (k = j + 1; k < size; k++) {
					if (array[i] + array[j] + array[k] == 0) {
						System.out.println("  " + array[i] + "	 " + array[j] + "  " + array[k]);

						flag = 1;
					}
				}
			}
		}
		if (flag == 0) {
			System.out.println("Distinct triplates not exist");
		}
	}

	/**
	 * @param size
	 * @param array
	 * @return
	 */
	public void inputAccept(int size, int[] array) {

		System.out.println("Enter elements of array:");
		for (i = 0; i < size; i++) {
			array[i] = scanner.nextInt();
		}
		for (i = 0; i < size; i++) {
			System.out.println(array[i]);
		}
	}

	/*********************************
	 * TwoDArrayFunction
	 ************************************************************/

	/**
	 * @param row
	 * @param column
	 */
	public void printTwoDArray(int row, int column) {
		PrintWriter printwriter = new PrintWriter(System.out, true);
		int arr1[][] = new int[row][column];
		System.out.println("Enter the values:");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				arr1[i][j] = scanner.nextInt();
			}
		}
		System.out.println("\n");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {

				printwriter.print(" " + arr1[i][j]);

			}
			printwriter.println();
		}
	}

	/**************************
	 * WindChill_Function
	 ************************************************************************************/
	/**
	 * @param t
	 * @param v
	 */
	public void computeWindChill(int t, int v) {

		double wc = 0.0;
		if (Math.abs(t) <= 50 && (Math.abs(v) <= 120 && Math.abs(v) >= 3)) {

			wc = (85.74 + 0.6215 + (0.4275 * t - 35.75) * Math.pow(v, 0.16));
			System.out.println("Result	" + wc);

		} else {
			System.out.println("Entered value for t and v are invalid..!!!");
			System.out.println("Entered value for t :");
			t = scanner.nextInt();
			System.out.println("Entered value for t :");
			v = scanner.nextInt();
			computeWindChill(t, v);
		}

	}

	/******************************** Anagram***********************************************************************/

	/**
	 * @return
	 */
	public static String acceptString() {
		return scanner.nextLine();

	}

	/**
	 * @param string1
	 * @param string2
	 */
	public static void checkAnagram(String string1, String string2) {
		string1.toLowerCase();
		string2.toLowerCase();
		string1 = string1.replace(" ", "");
		string2 = string2.replace(" ", "");

		char[] ch1 = string1.toCharArray();
		char[] ch2 = string2.toCharArray();

		Arrays.sort(ch1);
		Arrays.sort(ch2);

		if (string1.length() == string2.length())
			System.out.println(string1+" "+string2+" "+"are Anagram");
		else
			System.out.println(string1+" "+string2+" "+"are not Anagram");
	}

	/******************************* Prime_Range***************************************************/

	/**
	 * This method is to accept lower and upper limit to generate prime number
	 * between this range
	 * 
	 * @return integer:It returns the
	 */
	public static Integer acceptLimits() {
		Integer l = scanner.nextInt();
		return l;
	}

	/**
	 * This method is to generate prime number between given range.
	 * 
	 * @param lower_limit:lower limit of given range
	 * @param upper_limit:upper limit of given range
	 */
	public static int[] findPrimeRange(int lowerlimit, int upperlimit) {
		int[] storePrime = new int[upperlimit];
		int i = 0, j = 0, count = 0;
		boolean isprime = false;
		for (i = lowerlimit; i < upperlimit; i++) {
			if (i == 0 && i == 1)
				continue;

			for (j = 2; j < i; j++) {
				if (i % j == 0) {
					isprime = false;
					break;
				} else {
					isprime = true;
				}
			}
			if (isprime == true) {
				storePrime[count++] = i;
				
			}

		}
		return storePrime;

	}

/************************* Prime_Aanagram_Palindrom********************************************************************************************/

	static int reversenum = 0;
	static int r=0;

	public static void checkPalindrome(int[] primenumber) {

		for (int i = 0; i < primenumber.length; i++) {
			reversenum=0;
			if (primenumber[i] > 0) {
				int temp = primenumber[i];
				while (temp > 0) 
				{
					r = temp % 10;
					temp = temp / 10;
					reversenum = reversenum * 10 + r;
				}
                       temp=primenumber[i];
				if (temp == reversenum) 
					System.out.println(reversenum + "	is palindrome");
				
			}

		}

	}

	public static void checkAnagram(int[] primenumber)
	{
		System.out.println("The prime number which are Anagram:");
		
		for (int  i = 0; i < primenumber.length; i++)
		{
			for (int j = 0; j < primenumber.length; j++)
			{
				 if(primenumber[i]>0 && primenumber[j]>0)
				 {	 
				 String string1 = Integer.toString(primenumber[i]);
				 String string2 = Integer.toString(primenumber[j]);
				 Utility.checkPrimeAnagram(string1, string2);
				 }
			}
		}
		
    }

private static void checkPrimeAnagram(String string1, String string2)
{
		char[] ch1 = string1.toCharArray();
		char[] ch2 = string2.toCharArray();
		boolean result=false;
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		result = Arrays.equals(ch1,ch2);
		if(result==true)
			System.out.println(string1+" "+string2+" "+"are Anagram");
		else
		    System.out.println(string1+" "+string2+" "+"are not Anagram");
		
}
/*****************************************Binary_Search(Guess_game)*************************************************************************************/

public static int binarySearch(int low, int high) 
{
	
		if((high-low)==1)
		{
			return low;
		}
		System.out.println("Guess between "+low+" to "+high);	
		int mid=(low+high)/2;
		if(mid<high)
		{
			System.out.println("mid is "+mid);
			return binarySearch(mid,high);
		}
		else
		{
			System.out.println("mid is "+mid);
			return binarySearch(low,mid);
		}

}
/****************************************Bubble_Sort**************************************************************/
public static int getInt() 
{
	return scanner.nextInt();
}

public static int[] acceptElement(int size) 
{
	int inputarray[]=new int[size];
	for(int i=0;i<size;i++)
		inputarray[i]=scanner.nextInt();
	
  return inputarray;
}

public static void BubbleSort(int size, int[] storeElement) 
{
	 System.out.println("Array before sorting");
	 for(int i=0;i<size;i++)
	 {
		 System.out.print(" "+storeElement[i]);
	 }
	 
	for(int i=0;i<size;i++)
	{
		for(int j=i+1;j<size;j++)
		{
			if( storeElement[i]> storeElement[j])
			{
				int temp= storeElement[i];
				 storeElement[i]= storeElement[j];
				 storeElement[j]=temp;
			}
		}
	}
	 System.out.println("\n Array after sorting");
	 for(int i=0;i<size;i++)
	 {
		 System.out.print(" "+storeElement[i]);
	 }
	
}



/******************************************Insertion_Sort ***********************************************************/
public static String[] stringElement(int size) 
{
	 String storestring[]=new String[size];
	 for(int i=0;i<size;i++)
		 storestring[i]=scanner.nextLine();

 return storestring;	
}

public static void insertionSort(int size, String[] stringarray) 
{
	
	System.out.println("Array before sorting=>");
	 for(int i=0;i<stringarray.length;i++)
	 {
		 System.out.print(" "+ stringarray[i]);
	 }
	 
	for(int i=1;i<size;i++)
	{
		for(int j=0;j<i;j++)
		{
			if( (stringarray[i]).compareTo(stringarray[j])<=-1 )
			{
				String temp=stringarray[i];
				stringarray[i]=stringarray[j];
				stringarray[j]=temp;
			}
		}
	}
	 System.out.println("\n Array after sorting=>");
	 for(int i=0;i<size;i++)
	 {
		 System.out.print(" "+ stringarray[i]);
	 }
	
	
}
/************************************Binary_search_for_integer***********************************************************/

public static int binarySearchInteger(int low, int high, int key, int[] storeElement) 
{
    while(low<=high) 
    {
    	  int mid=(low+high)/2;
	      if(key==storeElement[mid])
		   return mid;
	     
	      if(key<storeElement[mid])
	       low=mid+1;
	      else
	        high=mid-1;
	 }
 return -1; 
}

}


