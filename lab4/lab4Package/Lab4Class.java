// Class Name: Lab4Class
//
// The purpose of this class is to determine a person’s age in a future year.
//
// Date: 11/12/18
//
// Author: Sien Sun

package lab4Package;

import java.util.Scanner;

public class Lab4Class
{

	public static void main(String[] args)
	{
		// declare variables
	       Scanner input = new Scanner(System.in);  // Open the input stream 
           String cleanUpStr;						// clean up the key board buffer 
           int currentAge;							// current age of the person
           int futureAge;							// future age of the person
           int currentYear;							// the current year 
           int futureYear;							// the future year 
           int cntr = 0;                            // initialize try counter 
          

           
           // initialize variables
           cleanUpStr = "none yet";
           currentAge = 0;
           futureAge = 0;
           currentYear = -1;
           futureYear= 0;

           // print out my name to the console output
           System.out.println("My name is Sien Sun");
           
           // specific code starts here
           
           // continue to prompt for an age until the age is valid
           //prompt the user for a valid current age - limit the number of tries to 3
           for (cntr = 0; cntr < 3;++cntr)
           {
              	 // prompt user to enter the current age
              	 System.out.print("Enter your current age:\t");
               
               	 // read in the current age
               	currentAge = input.nextInt( );
               
              	 // clean up carriage return line feed
               	cleanUpStr = input.nextLine( );     
               	
                 // check to see if this is a valid age
                 if (currentAge >=0)
                 {
                		break;
                 }// end if valid current age
  	
            } // end for each try for a valid age
           
            // check to see if you have a valid current age before continuing
            if (currentAge >= 0)
            {
            	  // initialize try counter for current year
           	      cntr = 0;
           	      
                  // continue to prompt a current year until it is valid
               	  // or a maximum number of tries has been reached
                  while((currentYear < 0) && (cntr < 3))
                  {
                       // prompt user to enter current year
                       System.out.print("Enter the current year:\t");
                       
                       // read in the current year
                       currentYear = input.nextInt( );
                       
                       // clean up carriage return line feed
                       cleanUpStr = input.nextLine( ); 
                       
                       // increment the number of tries
                       ++cntr;
                  } // end while invalid currentYear and max tries
                  
                  if(currentYear > 0)
                  {
                	  // initialize try counter for current year
               	      cntr = 0;
               	      
                      // continue to prompt for an future year until it is valid
                      do 
                      {
                	    // prompt user to enter future year
                	    System.out.println("Enter the future year: ");
                    
                	    // read in the future year
                	    futureYear = input.nextInt();
                    
                	    // clean up key board buffer
                	    cleanUpStr = input.nextLine();
                	   
                        // check to see if this is a valid age
                        if((futureYear > 0) && (futureYear > currentYear))
                        {
                      		break;
                        } // end if valid future year	
                        
                        // increment the number of tries
                        ++cntr;
                   
                      } while(cntr < 3);
           
                     	if((futureYear > 0) && (futureYear > currentYear))
                     	{
                     		// calculate future age
                     		futureAge = futureYear - currentYear + currentAge;
                
                     		// print out age
                     		System.out.println("In the year " + currentYear + " you are " + currentAge + " years old.");
                     		System.out.println("In the year " + futureYear + " you will be " + futureAge + " years old.");
                     		
                     	} // end if future year statement
                     	else
                     	{
                     		System.out.println("Too many tries for a valid future year!");
                     	}
                   

                    } // end if current year statement
                    else
                    {
                 	  System.out.println("Too many tries for a valid current year!"); 
                    } // end else invalid current year 
          
            
             } // end if current age statement 
             else
             {
                System.out.println("Too many tries for a valid current age!"); 
             } // end else invalid current age
                

         // close input stream
         input.close();



	} // end main

} // end Lab4Class
