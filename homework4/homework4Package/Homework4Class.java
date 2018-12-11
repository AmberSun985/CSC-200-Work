// Homework4Class 
//
// The purpose of this class is to practice loops 
//
// Author: Sien Sun 
//
// Date: 11/16/18


package homework4Package;

import java.util.Scanner;

public class Homework4Class
{

	public static void main(String[] args)
	{
		// declare all variables here
		
		Scanner input = new Scanner(System.in);  // open the input stream 
		
		String cleanUpStr;                       // clean up key board buffer 
		int numStudents; 						 // the number of students in the class
		String name; 							 // the name of the student
		int cntr;							     // the counter of for loop
		double numericGrade;        			 // the numeric grade for student
		double totalGrades;                      // the total numeric grade for all the students
		double aveNumericGrades;    			 // the average numeric grades for all students
		String letterGrade;			  			 // the letter grade for student
		String aveLetterGrades; 			     // the average letter grades for all students
		
		final double MAXNUMERICGRADE = 100.0; 			 // the maximum numeric grade 
		final double MININUMERICGRADE = 0.0;			 // the minimum numeric grade
		final int MINAGRADE = 90;	// minimum grade for A
		final int MAXAGRADE = 100;	// maximum grade for A
		final int MINBGRADE = 80;	// minimum grade for B
		final int MAXBGRADE = 89;	// maximum grade for B
		final int MINCGRADE = 70;	// minimum grade for C
		final int MAXCGRADE = 79;	// maximum grade for C
		final int MINDGRADE = 60;	// minimum grade for D
		final int MAXDGRADE = 69;	// maximum grade for D
		final int MINFGRADE = 0;	// minimum grade for F
		final int MAXFGRADE = 59;	// maximum grade for F
		
		final String GRADEA = "A";	// grade of A
		final String GRADEB = "B";	// grade of B
		final String GRADEC = "C";	// grade of C
		final String GRADED = "D";	// grade of D
		final String GRADEF = "F";	// grade of F
		
		
		// initialize all variables here 
		
		cleanUpStr = "none yet";
		name = "none yet";
		cntr = 0;
		numStudents = 0;
		numericGrade = 0.0;
		totalGrades = 0.0;
		aveNumericGrades = 0.0;
		letterGrade = "none yet";
		aveLetterGrades = "none yet";
		
		// specific code here 
		
		// prompt user enter the number of students in the class
		System.out.println("Enter the number of students in the class: ");
				
		// read in the number of students in the class
		numStudents = input.nextInt();
				
		// clean up key board buffer 
		cleanUpStr =  input.nextLine();
		
		while(numStudents < 0)
		{
			// invalid message for number of students 
			System.out.println("Invalid number of students " + numStudents + ". Please enter the number of students again.");
			
			// prompt user enter the number of students in the class 
			System.out.println("Reenter the number of students in the class: ");
		
			// read in the number of students in the class
			numStudents = input.nextInt();
		
			// clean up key board buffer 
			cleanUpStr =  input.nextLine();
			
		} // end the number of students validation loop 
		
		  // the number of students is valid program continue
	
		  // for loop for all class grades
		  for(cntr = 0; cntr < numStudents; ++cntr)
		  {
			  // prompt user enter the name of student
			  System.out.println("Enter the name of student: ");
		
			  // read in the name of student 
			  name = input.nextLine();
	
			  // prompt user enter numeric grade for student
			  System.out.println("Enter the numeric grade for " + name +": ");
			
			  // read in the numeric grade 
			  numericGrade = input.nextDouble();
		
			  // clean up key board buffer 
			  cleanUpStr = input.nextLine();
			
		 	  while((numericGrade < MININUMERICGRADE) || (numericGrade > MAXNUMERICGRADE))
		 	  {
			    // invalid message for numeric grades for student
				System.out.println("Invalid numeric grades " + numericGrade+ ". Please enter the numeric grade again.");

				// prompt user enter the numeric grades of the student
				System.out.println("Reenter the numeric grade for " + name + ": ");
			
				// read in the number of students in the class
				numericGrade = input.nextDouble();
			
				// clean up key board buffer 
				cleanUpStr =  input.nextLine();
		 	  } // end numeric grades validation loop
		
		 	  // the numeric grade is valid then program continues
		  
		 	  // convert the numeric grade to letter grade
		 	  if ((numericGrade >= MINAGRADE) && (numericGrade <= MAXAGRADE))
		 	  {
				letterGrade = GRADEA;
		 	  }
		 	  else if ((numericGrade >= MINBGRADE) && (numericGrade <= MAXBGRADE))
		 	  {
				letterGrade = GRADEB;
		 	  }
		 	  else if ((numericGrade >= MINCGRADE) && (numericGrade <= MAXCGRADE))
		 	  {
				letterGrade = GRADEC;
		 	  }
		 	  else if ((numericGrade >= MINDGRADE) && (numericGrade <= MAXDGRADE))
		 	  {
				letterGrade = GRADED;
		 	  }
		 	  else if((numericGrade >= MINFGRADE) && (numericGrade <= MAXFGRADE))
		 	  {
				letterGrade = GRADEF;
		 	  }
				
		 	  // total numeric grades
		 	  totalGrades = totalGrades + numericGrade;
		 	  
		 	  // print out all the outputs
		 	  System.out.println("The name of the student is: " + name);
		 	  System.out.println("The numeric grade for " + name + " is: " + numericGrade);
		 	  System.out.println("The letter grade for " + name + " is: " + letterGrade);

		 } // end the for loop 
		      
	 	  // calculate average numeric grades 
	 	  aveNumericGrades = totalGrades/numStudents;
		
	 	  // convert average numeric grades to the average letter grade 
	 	  if ((aveNumericGrades >= MINAGRADE) && (aveNumericGrades <= MAXAGRADE))
	 	  {
	 		 aveLetterGrades = GRADEA;
	 	  }
	 	  else if ((aveNumericGrades >= MINBGRADE) && (aveNumericGrades <= MAXBGRADE))
	 	  {
	 		 aveLetterGrades = GRADEB;
	 	  }
	 	  else if ((aveNumericGrades >= MINCGRADE) && (aveNumericGrades <= MAXCGRADE))
	 	  {
	 		 aveLetterGrades = GRADEC;
	 	  }
	 	  else if ((aveNumericGrades >= MINDGRADE) && (aveNumericGrades <= MAXDGRADE))
	 	  {
	 		 aveLetterGrades = GRADED;
	 	  }
	 	  else
	 	  {
	 		 aveLetterGrades = GRADEF;
	 	  }
			
		 	  System.out.println("The average numeric grade of this class is: " + aveNumericGrades);
			  System.out.println("The average letter grade of this class is: " + aveLetterGrades);
				
				
		// close input stream	
		input.close();	
			
			  
			    
  
  } // end main

} // end Homework4Class
