//
//	PracticeClass
//
//	The purpose of this class is to convert numeric grades to letter grades
//
//	Author:		Sien Sun
//	Date:		29/10/18
//

package practicepackage;

import java.util.Scanner;  

public class practice
{
   
	public static void main(String[] args)
	{
		// declare all variables here
		double numericGrades;     
		
		Scanner input = new Scanner(System.in);	
		String cleanUpStr;		
		
		
		// initiate all variables here
		numericGrades = 0.0;
		cleanUpStr = "none yet";
		
		// specific code here 
		
		// prompt user enter the numeric grade
		System.out.println("Enter your numeric grade");
		
		// read in the numeric grade
		numericGrades = input.nextInt();
		
		// clean up the keyboard buffer
		cleanUpStr = input.nextLine( );

		
		// calculate numeric grade into letter grade
		if((numericGrades >= 90) && (numericGrades <= 100))
		{
			System.out.println("Letter Grade is A");
		}
		else if((numericGrades >= 80) && (numericGrades <= 89))
		{
			System.out.println("Letter Grade is B");
		}
		else if ((numericGrades >= 70) && (numericGrades <= 79))
		{
			System.out.println("Letter Grade is C");
		}
		else if((numericGrades >= 60) && (numericGrades <= 69))
		{
		    System.out.println("Letter Grade is D");
		}
		else if  ((numericGrades >= 0) && (numericGrades <= 59))
		{
			 System.out.println("Letter Grade is F");
		}
		
		     
		// close input stream
		input.close( );

	} // end main

} // end practiceClass
