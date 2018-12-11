// Class Name: Lab5Class
// 
// The purpose of this class is to generate random number
//
// Date: 11/28/18
//
// Author: Sien Sun

package lab5Package;

import java.util.Scanner;

public class Lab5Class
{

	public static void main(String[] args)
	{
		// declare variables
		Scanner input = new Scanner(System.in); // Open the input stream 
		
		String cleanUpStr;  // clean up key board buffer 
		
		String name;  // name of the student 
		int num; // integer number user types in 
		int cntr;  // counter number for for loop 
		double decimal; // decimal number user types in
		int rNum; // random numbers program generates
		int min;  // minimum number of the range 
		int max;  // maximum number of the range
		int ranNum; // how many numbers user wants to generate
		
		
		// initialize variables
		cleanUpStr = "none yet";
		
		name = "none yet";
		num = 0;
		decimal = 0.0;
		rNum = 0;
		min = 0;
		max = 0;
		ranNum = 0;
		
		// enter your name at the keyboard and print it out
		name = inputString("Enter your name:\t");
		System.out.println("My name is "+ name);

		// enter 5 integers at the keyboard and print each one out.
		for(cntr = 0; cntr < 5; ++cntr)
		{
			System.out.println("Integers from Keyboard");	
		
			num = inputInteger("Enter integer:\t");
			System.out.println("Integer is:\t" + num);
			
		} // end the for loop for integer numbers
		
		
		// enter 5 decimal numbers at the keyboard and print each one out
		for(cntr = 0; cntr < 5; ++cntr)
		{
		
			System.out.println("Decimal values from keyboard");
			
			decimal = inputDouble("Enter decimal:\t");
			System.out.println("Decimal is:\t" + decimal);
			
		} // end the for loop for decimal numbers 	
		
		// prompt user enter how many random numbers they want to generate 
		System.out.println("Enter how many random numbers you want to generate:\t");
		
		// read in the number user types in 
		ranNum = input.nextInt();
		
		// clean up key board buffer
		cleanUpStr = input.nextLine();
		
		// validate the number user types in 
		while(ranNum < 0)
		{
			System.out.println("Invalid number user wants to generate, please enter the number again");
			
			// prompt user reenter how many random numbers they want to generate 
			System.out.println("Reenter how many random numbers you want to generate:\t");
			
			// read in the number user types in 
			ranNum = input.nextInt();
			
			// clean up key board buffer
			cleanUpStr = input.nextLine();
			
		} // end the validation of how many numbers user wants to generate
		
		// enter the minimum number for the range
		System.out.println("Enter the lowerbounds for your random numbers:\t ");
	
		// read in the minimum number 
		min = input.nextInt();
	
		// clean up key board buffer
		cleanUpStr = input.nextLine();
	
		// enter the maximum number for the range
		System.out.println("Enter the upperbounds for your random numbers:\t ");
	
		// read in the maximum number 
		max = input.nextInt();
		
		// generate 20 random numbers and print each one out
		for (cntr = 0; cntr < ranNum; ++cntr) 
		{
			// generate the random number 
			rNum = genRandom(min, max);
			
			// print out the random number
			System.out.println(rNum);
			
		}
		

	} // end main
	
//
//	inputString
//
//	the purpose of this method is to input a string from the keyboard
//
//	Input:	prompt	  the prompt message for the dialog box
//
//	Return:	inputStr  the string that was entered at the keyboard
//
	

	public static String inputString(String prompt)
	{
		Scanner input = new Scanner(System.in);
		String inputStr;
		
		// prompt user to enter the string
		System.out.print(prompt);
		
		// read in value as string from keyboard
		inputStr = input.nextLine();
		
		// return input string
		return(inputStr);
		
	}// end inputString	
	
//
//	inputInteger
//
//	the purpose of this method is to input an integer value from the keyboard
//
//	Input:		prompt	the prompt message for the user
//	Return:		num		the integer entered at the keyboard
//
	
	public static int inputInteger(String prompt)
	{
		Scanner input = new Scanner(System.in);
		String cleanUpStr;
		int num;
		
		num = 0;
		cleanUpStr = "no string yet";
		
		System.out.print(prompt);
		num = input.nextInt();
		cleanUpStr = input.nextLine();
		
		return(num);

	}// end inputInteger

//
//	inputDouble 
//
//	the purpose of this method is to input decimal value from the keyboard
//
//	Input:		prompt	 the prompt message for the user
//	Return:		decimal  the decimal entered at the keyboard
//
	
	public static double inputDouble (String prompt)
	{
		Scanner input = new Scanner(System.in);
		String cleanUpStr;
		double decimal;
		
		decimal = 0.0;
		cleanUpStr = "no string yet";
		
		System.out.print(prompt);
		decimal = input.nextDouble();
		cleanUpStr = input.nextLine();
		
		return(decimal);

	}// end inputInteger
	
//
//	genRandom
//
//	The purpose of this method is to generate a random number
//	between the minimum and maximum values specified inclusively
//
//	Input:	min		the minimum value in the range of numbers
//			max		the maximum value in the range of numbers
//
//	Return:	num		the random number in the given range
//
	
	
	public static int genRandom(int min, int max)
	{
				
		double rNum;		// the original random number generated
		double range;		// the range of random numbers allowed
		int num;

		rNum = 0.0;
		range = 0.0;
		num = 0;

		// validate the input
		if ((min >=0) && (min < max) && (max >= 0))
		{
			// the input arguments are actually valid so we can generate a random number
			
			// generate a random number 0.0 <= rNum < 1.0
	   		rNum = Math.random( );
	        
	   		// determine the range
	    	range = (double)max - (double)min + 1.0;
	        
	    	// scale the number between min and max inclusively
	   		rNum = rNum * range;       
	    	rNum = rNum + (double)min;
	        
	    	// convert back to integer value
	    	num = (int)rNum;
		}
		else
		{
			System.out.println("Invalid input arguments of " + min + " and " + max);
			System.out.println("Random number cannot be generated");
		}
	    
	    	// return the integer
	    	return(num);      		
	}// end genRandom


} // end Lab5Class
