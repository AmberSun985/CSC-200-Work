//
// ThursdayClass
// The purpose of this class is to learn about Eclipse
// Author: Sien Sun
// Date:   10/18/18



package thursdayPackage;

import java.util.Scanner;

public class ThursdayClass 
{

	public static void main(String[] args) 
	{
		// declare all variables 
		Scanner input = new Scanner (System. in);
		int age;            // age of student
		String cleanUpStr;  // clean up the keyboard buffer 
		String theName;     // the name of students
		double lunchMoney;  // money of lunch
		
		
		
		// initialize all variables
		age = 0;
		cleanUpStr = "none yet";
		lunchMoney = 0;
		
		
		// problem specific code here 
	    
		// prompt user to enter their age 
		System.out.println("Enter age of student");
		
		// read in age 
		age = input.nextInt();
		cleanUpStr = input.nextLine();
		
		// prompt user to enter  name of student
		System.out.println("Enter name of student");
		
		// read in the name of student
		theName = input.nextLine();
		
		
		// prompt user enter their money of lunch
		System.out.println("Enter the money of lunch");
		
		
		// print out age of students
		System.out.println(theName + " is " + age + " years old");
	
		// print out lunch money
		System.out.println("Lunch Moeny is $" + lunchMoney);
		
		System.out.printf("Lunch money is $%.2f\n", lunchMoney);
		
		// close input Stream 
		input.close();
		 
		
	}// end main 
	

}// end ThursdayClass
