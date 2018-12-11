// Homework5Class
// 
// The purpose of this class is to play random number game 
//
// Author: Sien Sun 
// 
// Date: 12/09/18 

package homework5Package;

import java.util.Scanner;

public class Homework5Class
{

	public static void main(String[] args)
	{
		{
			System.out.println("My Name is  Sien Sun");
			playGame( );
		}
		
	} // end main

		
//
//	playGame
//
//	the purpose of this method is to play the random number
//	game as described in this homework assignment
//
//	Input:	none
//	Return:	none
//
public static void playGame()
{
	
	String inputStr; // clean up key board buffer 
	
} // end method playGame 


//
//			playCoinToss
//
//			the purpose of this method is to play the coin toss
//			portion of the random number game
//
//			Input:	none
//			Return:	none
//
public static void playCoinToss()
{
	// declare all variables here 
	Scanner input = new Scanner(System.in); // open an input stream 
	String cleanUpStr; // clean up key board buffer 
	int numTosses; // the total number of times to toss a coin
	double tossResult; // the result of tossing a coin 1 stands for Head and 2 stands for Tails
	int cntr; // counter for loop 
	final int HEADS = 1; // 1 stands for Heads 
	int numHeads; // heads times 
	final int TAILS = 2; // 2 stands for Tails 
	int numTails; // tails times 
	double range; // range for the random number
	final int MIN = 1; // minimum number for range 
	final int MAX = 2; // maximum number for range 
	
	// initialize all variables here 
	numTosses =  0;
	tossResult = 0.0;
	cntr = 0; 
	numHeads = 0;
	numTails = 0; 
	range = 0.0;
	
	
	// call the method to determine how many times user want toss coin 
	numTosses = determineNumberOfTosses();
	
	// number of times is valid program continues 
	
	// for loop for tossing coin 
	for(cntr = 0; cntr < numTosses; ++cntr)
	{
		// generate a random number
		tossResult = Math.random( );
        
   		// determine the range
    	range = (double)MAX - (double)MIN + 1.0;
        
    	// scale the number between min and max inclusively
    	tossResult = tossResult * range;       
    	tossResult = tossResult + (double)MIN;

    	// convert back to integer value
    	tossResult = (int)tossResult;
    	
    	// if else statement for toss result 
    	if(tossResult == HEADS )
    	{
    		++numHeads;
    	}
    	else if(tossResult == TAILS)
    	{
    		++numTails;
    	}
    	else
    	{
    		System.out.println("Invalid toss results");
    	}
    	
	} // end method playCoinToss	
	 	
	// print out the results for coin tosses 
	
	System.out.println("Total:\t" + numTosses);
	
} // end method playCoinToss



//
//	determineNumberOfTosses
//
//	the purpose of this method is to determine a valid number
//	of coin tosses to complete
//
//	Input:	none
//	Return:	numTosses	the valid number of tosses to complete
//
public static int determineNumberOfTosses()		
{

	Scanner input = new Scanner(System.in); // open an input stream 
	String cleanUpStr; // clean up key board buffer 
	int numTosses; // the total number of times to toss a coin
	
	// initialize all variables here 
	numTosses =  0;
	
	//prompt user enters how many times that want to toss the coin.
	System.out.println("Please enter how many times you want to toss this coin:\t");
		
	// read in how many times user wants to toss coin 
	numTosses = input.nextInt();
	
	// clean up key board buffer 
	cleanUpStr = input.nextLine();
	
	// validate how many times user wants to toss coin 
	while(numTosses < 0)
	{
		// error message for invalid number
		System.out.println("Invalid number of times, please enter how many times you want to toss this coin again");
		
		// reenter how many times that want to toss the coin.
		System.out.println("Please reenter how many times you want to toss this coin:\t");
		
		// read in how many times user wants to toss coin 
		numTosses = input.nextInt();
		
		// clean up key board buffer 
		cleanUpStr = input.nextLine();
		
	} // end while validation loop
	
	// return statement 
	return(numTosses);
	
} // end method determineNumberOfTosses
	

//
//			printCoinTossResults
//
//			The purpose of this method is to print out the results
//			of the coin toss part of the game
//
//			Input:  	numHeads	the total number of heads that were tossed
//				  		numTails	the total number of tails that were tossed
//
//			Return:  none
//
public static void printCoinTossResults(int numHeads,int numTails)
{
	
	// print out toss results
	System.out.println("Tossing Results:\t");
	System.out.println("Heads:\t" + numHeads);
	System.out.println("Tails:\t" + numTails);
	
} // end method printCoinTossResults

			
//
//			playDiceRoll
//
//			the purpose of this method is to play the dice roll part of the
//			random number game.
//
//			Input:	none
//			Return:	none
//
public static void playDiceRoll()
{
		// declare all variables here 
		Scanner input = new Scanner(System.in); // open an input stream 
		String cleanUpStr; // clean up key board buffer 
		int numRolls; // the total number of times to roll a dice 
		double rollResult; // the result of rolling a dice 
		int cntr; // counter for loop 
		int num1; // number of times of 1 
		int num2; // number of times of 2
		int num3; // number of times of 3
		int num4; // number of times of 4
		int num5; // number of times of 5
		int num6; // number of times of 6
		double range; // range for the random number
		final int MIN = 1; // minimum number for range 
		final int MAX = 6; // maximum number for range 
		
		
		// initialize all variables here 
		numRolls =  0;
		rollResult = 0.0;
		cntr = 0; 
		num1 = 0;
		num2 = 0;
		num3 = 0;
		num4 = 0;
		num5 = 0;
		num6 = 0; 
		
		
		// call the method to determine how many times to roll a dice
		numRolls = determineNumberOfRolls();
		
		// number of times is valid program continues 
		
		// for loop for tossing coin 
		for(cntr = 0; cntr < numRolls; ++cntr)
		{
			// generate random numbers
			rollResult = Math.random( );
	        
	   		// determine the range
	    	range = (double)MAX - (double)MIN + 1.0;
	        
	    	// scale the number between min and max inclusively
	    	rollResult = rollResult * range;       
	    	rollResult = rollResult + (double)MIN;

	    	// convert back to integer value
	    	rollResult = (int)rollResult;
			
			switch(rollResult)
			{
			 case 1: 
				++num1;
			 	 break;
			 	
			 case 2:
				 ++num2;
			 	 break;
			 	 
			 case 3:
				 ++num3;
			 	 break;
			 	 
			 case 4:
				 ++num4;
			 	 break;
			 	 
			 case 5:
				 ++num5;
			 	 break;
			 	 
			 case 6:
				 ++num6;
			 	 break;
			 	 
			 default:
				 System.out.println("Invalid roll results");
				 break;
			} // end switch 
			
		} // end for loop 	
		
		// print out the results for coin tosses 
		System.out.println("Total:\t" + numRolls);
		
}
			
//
//			determineNumberOfRolls
//
//			the purpose of this method is to determine a valid number of
//			rolls of the die to complete
//
//			Input:	none
//			Return:	numRolls	the valid number of rolls to complete
//
public static int determineNumberOfRolls()
{
	Scanner input = new Scanner(System.in); // open an input stream 
	String cleanUpStr; // clean up key board buffer 
	int numRolls; // the total number of times to roll a dice 
	
	// initialize all variables here 
	numRolls =  0;
	
	//prompt user enters how many times that want to roll a dice.
	System.out.println("Please enter how many times you want to roll this dice:\t");
		
	// read in how many times user wants to toss coin 
	numRolls = input.nextInt();
	
	// clean up key board buffer 
	cleanUpStr = input.nextLine();
	
	// validate how many times user wants to toss coin 
	while(numRolls < 0)
	{
		// error message for invalid number
		System.out.println("Invalid number of times, please enter how many times you want to rol this dice again");
		
		// reenter how many times that want to toss the coin.
		System.out.println("Please reenter how many times you want to roll this dice:\t");
		
		// read in how many times user wants to toss coin 
		numRolls = input.nextInt();
		
		// clean up key board buffer 
		cleanUpStr = input.nextLine();
		
	} // end while validation loop
	
	// return statement 
	return(numRolls);
	
}
		
//
//	printDiceResults
//
//	The purpose of this method is to print out the results
//	of the dice roll part of the game
//
//	Input:  	num1	the total number of ones rolled
//				num2	the total number of twos rolled
//				num3	the total number of threes rolled
//			    num4	the total number of fours that were rolled
//			    num5	the total number of fives that were rolled
//				num6	the total number of sixes that were rolled
//
//	Return:	none
//
public void printDiceResults(int num1,int num2,int num3,int num4,int num5,int num6)
{
	System.out.println("Roll 1:\t" + num1 + "times");
	System.out.println("Roll 2:\t" + num2 + "times");
	System.out.println("Roll 3:\t" + num3 + "times");
	System.out.println("Roll 4:\t" + num4 + "times");
	System.out.println("Roll 5:\t" + num5 + "times");
	System.out.println("Roll 6:\t" + num6 + "times");
	
} // end the method printDiceResults

}
