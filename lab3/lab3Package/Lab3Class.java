//
//	Lab3Class
//
//	the purpose of this class is to practice selection statement.
//
//	Author:		Sien Sun
//	Date:		29/10/18
//

package lab3Package;

import java.util.Scanner;

public class Lab3Class
{

	public static void main(String[] args)
	{
		
			// create an input stream object here
		    Scanner input = new Scanner(System.in);	           // create an input stream		
					
			// declare variables here
			int num;
			String cleanUpStr;		                           // clean up keyboard buffer
				
			// initialize variables here
			num = 0;
			cleanUpStr = "none yet";
					
			// print out your name to the console
			System.out.println("My name is Sien Sun");
				
			// prompt user to enter a number
			System.out.println("Enter the number:");
			
			// read in the number from the keyboard
			num = input.nextInt();
							
			// clean up the keyboard buffer
			cleanUpStr = input.nextLine( );

			// check to see if the number is a positive number
			if (num >= 0)
			{
				System.out.println(num + " is positive");

				// determine if this number is odd or even
				if (num %2 == 0)
				{
			    // number is even
				System.out.println(num + " is even");
				}
				else
				{
			    // number is odd
				System.out.println(num + " is odd");
				}

				// determine into which number range the value falls
				if ((num >= 10) && (num <= 20))
				{
					System.out.println(num + " falls into the lower range");
				}
				else if ((num >= 30) && (num <= 50))
				{
					System.out.println(num + " falls into the upper range");
				}
				else
				{
					System.out.println(num + " does not fall into either range");
				}
			}// end if positive number
			else
			{
				System.out.println(num + " is negative");
			}
		     // check to see if the negative value is one of two very specific values of interest
			 switch(num)
			 {
				case -1:	
					System.out.println(num + " matches the first case");
					break;
				case -3:
					System.out.println(num + " matches the second case");						
					break;
				default:
					System.out.println(num + " does not match either case");
					break;
			 }// end switch(num)

			  // close input stream here
			  input.close( );
			
				
	 } // end main

}// end Lab3Class
	



