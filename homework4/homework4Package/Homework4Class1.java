// Homework4Class1 
//
//The purpose of this class is to practice loops 
// 
// Author: Sien Sun 
//
// Date: 11/18/18


package homework4Package;

import java.util.Scanner;

public class Homework4Class1
{

	public static void main(String[] args)
	{
		// declare all variables here 
		Scanner input = new Scanner(System.in); // open an input stream
		
		String cleanUpStr;						// clean up the key board buffer 
		int transactionNumber;     			    // transaction type 1 for deposit and 2 for withdraw
		double depositMoney;                    // the money customer save in the account 
		double withdrawMoney; 					// the money customer withdraw from the account
		double currentBalance;					// current balance after each transaction
		int cntr;							    // the counter of for loop
		
		final double INITIALBALANCE = 500.0;    // the initial balance in the account 
		
		// initialize all variables here
		cleanUpStr = "none yet";
		transactionNumber = 0;
        depositMoney = 0.0;
        withdrawMoney = 0.0;
        currentBalance = 0.0; 
        cntr = 0;							    
        
        // start specific code here 
        
        // print out my name to console output 
        System.out.println("Banking Transactions for Sien Sun");
        
    	// current balance 
    	currentBalance = INITIALBALANCE;
        
        // loop for 5 valid transactions 
        for(cntr = 0; cntr<5; ++cntr)
        {
            // prompt user enter the number of transaction   
        	System.out.println("Enter 1 for deposit transaction, or enter 2 for withdraw transaction: ");
        	
        	// read in the transaction type 
        	transactionNumber = input.nextInt();
        	
        	// clean up the key board buffer 
    		cleanUpStr = input.nextLine();
    		
    		while((transactionNumber < 1) ||(transactionNumber > 2))
    		{
    			
               	// print out the error message for transaction number 
            	System.out.println("Invalid transaction number " + transactionNumber + ". Please enter your transaction number again.");
    			
    			// prompt user enter the transaction number again 
    			System.out.println("Enter 1 for deposit transaction, or enter 2 for withdraw transaction. Please reenter the transaction number: ");
    			
            	// read in the transaction type 
            	transactionNumber = input.nextInt();
            	
            	// clean up the key board buffer 
        		cleanUpStr = input.nextLine();
            	
        	} // end the while loop for transaction number validation 
    		
    		// the transaction number is valid then program continues 
        	
        	// make a decision of the transaction
        	if(transactionNumber == 1)
        	{
        		// prompt user enter money they want to deposit 
        		System.out.println("Enter the money you want to deposit: ");
        		
        		// read in the deposit money
        		depositMoney = input.nextDouble();
        		
        		// clean up the key board buffer 
        		cleanUpStr = input.nextLine();
        		
        		// validate the deposit money 
        	    while(depositMoney < 0.0)
        	    {
        	    	// print out the error message 
        	    	System.out.printf("Invalid deposit money: $%.2f\n", depositMoney);
        	    	
        	    	// prompt user enter money they want to deposit 
            		System.out.println("Reenter the money you want to deposit: ");
            		
            		// read in the deposit money
            		depositMoney = input.nextDouble();
            		
            		// clean up the key board buffer 
            		cleanUpStr = input.nextLine();
            		
        	    } // end validation loop for deposit money
            		
                // the deposit money is valid program continue
        	    
        		// calculate the current balance
        		currentBalance = currentBalance + depositMoney; 
        		
        		// print out the current balance 
        		System.out.printf("The current balance is: $%.2f\n", currentBalance);
        		
        	} // end if the deposit transaction type 
        		
        	else
        	{
        		// prompt user enter the money they want to withdraw
        		System.out.println("Enter the money you want to withdraw: ");
        		
        		// read in the withdraw money
        		withdrawMoney = input.nextDouble();
        		
        		// clean up the key board buffer 
        		cleanUpStr = input.nextLine();
        		
        		while(withdrawMoney < 0.0)
        		{
        			// print out the error message 
        	    	System.out.printf("Invalid withdraw money: $%.2f\n", withdrawMoney);
        	    	
        	    	// prompt user enter money they want to withdraw
            		System.out.println("Reenter the money you want to withdraw: ");
            		
            		// read in the withdraw money
            		withdrawMoney = input.nextDouble();
            		
            		// clean up the key board buffer 
            		cleanUpStr = input.nextLine();
            		
        		} // end the while validation loop for withdraw money
        		
        		while(withdrawMoney > currentBalance)
        		{
        			// print out error message 
        			System.out.printf("You are not allowed to overdraw the money in your account. Invalid withdraw transaction: $%.2f\n",withdrawMoney);
        			
        			// prompt user enter money they want to withdraw
            		System.out.println("Reenter the money you want to withdraw: ");
            		
            		// read in the withdraw money
            		withdrawMoney = input.nextDouble();
            		
            		// clean up the key board buffer 
            		cleanUpStr = input.nextLine();
            		
        		} // end the while validation loop for withdraw money
        			
        		
        		// the withdraw money is valid program continues 
        		
        		// calculate the current balance
        		currentBalance = currentBalance - withdrawMoney;
        		
        		// print out the current balance 
        		System.out.printf("The current balance is: $%.2f\n", currentBalance);
        		
        	} // end the else of withdraw transaction type
        	
        		
       } // end the for loop	

         // close the input stream 
    	 input.close();
        
        
	} // end main

} // end Homework4Class1 
