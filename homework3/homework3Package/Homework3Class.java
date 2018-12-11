// 
// Homework3Class
// The purpose of this class is to display weekly employees' data.
//
// Author: Sien Sun
// Date:   1/11/18

package homework3Package;

import java.util.Scanner;

public class Homework3Class
{

	public static void main(String[] args)
	{

		// create an input stream object here
		Scanner input = new Scanner(System.in); // create an input stream

		// declare all variables here
		String name; // name of the weekly employees
		int numID; // ID number for weekly employees
		double payRate; // hourly pay rate for weekly employees
		double reWorkHours; // number of regularly hours worked per week
		double overWorkHours; // number of overtime hours worked per week
		double grossPay; // gross pay for weekly employees
		double takeHomePay; // take home pay for weekly employees
		double incomeTax;  // income tax for employees
		double finalInsuranceCost; // final insurance cost for employee
		int insurancePlanCode; // code for insurance plan for employees

		final double incomeTax1 = 0.15; // if gross pay is $400 or less tax is 0.15 of the gross pay
		final double incomeTax2 = 0.20; // if gross pay is more than $400 tax is 0.20 of the gross pay
		final double costInsurance1 = 60.0; // insurance plan code 1 is $60
		final double costInsurance2 = 100.0; // insurance plan code 2 is $100
		final double overPayRate = 1.25; // Overtime pay rate is the regular pay rate plus 25% extra
		String cleanUpStr;               // clean up keyboard buffer

		// initialize all variables here
		name = "none yet";
		numID = 0000;
		payRate = 0.0;
		reWorkHours = 0.0;
		overWorkHours = 0.0;
		grossPay = 0.0;
		takeHomePay = 0.0;
		insurancePlanCode = 0;
		incomeTax = 0.0;
		finalInsuranceCost = 0.0;
		cleanUpStr = "none yet";

		// start rest code here

		// fist line of code
		System.out.println("Employee Data for Sien Sun");

		// prompt user enter the ID number for employee
		System.out.println("Enter the ID number of employee: ");

		// read in the ID number of employee
		numID = input.nextInt();

		// clean up the key board buffer
		cleanUpStr = input.nextLine();

		// validate the ID number
		if ((numID < 1000) || (numID > 9999))
		{
			System.out.println("Invalid ID number for employee.");
		}

		else
		{
			// prompt user enter the name of employee
			System.out.println("Enter the name of employee: ");

			// read in the name of employee
			name = input.nextLine();
			
			// prompt user enter the hourly pay rate
			System.out.println("Enter the hourly pay rate for employee: ");

			// read in the hourly pay rate
			payRate = input.nextDouble();
			
			// clean up the key board buffer
			cleanUpStr = input.nextLine();

			// validate the hourly pay rate
			if ((payRate < 8.00) || (payRate > 35.50))
			{
				System.out.println("Invalid hourly pay rate for employee.");
			}

			else
			{
				// prompt user enter the number of regular working hours per week
				System.out.println("Enter the regular working hours per week for employee: ");

				// read in the number of regular working hours per week for employee
				reWorkHours = input.nextDouble();

				// clean up the key board buffer
				cleanUpStr = input.nextLine();

				// validate the number of regular working hours per week

				if ((reWorkHours < 0) || (reWorkHours > 40))
				{
					System.out.println("Invalid number of regular working hours per week.");
				}

				else
				{
					// prompt user enter the number of weekly overtime working hours for employee
					System.out.println("Enter the weekly overtime working hours for employee: ");

					// read in the weekly overtime working hours for employee
					overWorkHours = input.nextDouble();

					// clean up the key board buffer
					cleanUpStr = input.nextLine();

					// validate the number of weekly overtime working hours

					if ((overWorkHours < 0) || (overWorkHours > 10))
					{
						System.out.println("Invalid weekly overtime working hours for employee.");
					}

					else
					{
						// prompt user enter the insurance plan code
						System.out.println("Enter your insurance plan code: ");

						// read in the insurance plan code
						insurancePlanCode = input.nextInt();
						
						// clean up the key board buffer
						cleanUpStr = input.nextLine();
						
						// validate the insurance plan code
						if ((insurancePlanCode < 1) || (insurancePlanCode > 2))
						{

							System.out.println("Invalid insurance plan code.");
						}

						else
						{
							// calculate gross pay here
							grossPay = reWorkHours * payRate + overWorkHours * payRate * overPayRate;

							// calculate income tax here
							if (grossPay <= 400)
							{
								incomeTax = grossPay * incomeTax1;
							}

							else
							{
								incomeTax = grossPay * incomeTax2;
							}

							if (insurancePlanCode == 1)
							{
								finalInsuranceCost = costInsurance1;
							}

							else if (insurancePlanCode == 2)
							{
								finalInsuranceCost = costInsurance2;
							}
						}
						
						if(grossPay >= finalInsuranceCost + incomeTax)
						{
							takeHomePay = grossPay - finalInsuranceCost - incomeTax;
						}
						else
						{
							takeHomePay = grossPay;
						}
						
						// print out the output
						System.out.println("Employee ID number: " + numID);
						System.out.println("Name of Employee: " + name);
						System.out.println("Hourly pay rate for employee: $" + payRate);
						System.out.println("Number of regular hours worked: " + reWorkHours);
						System.out.println("Number of overtime hours worked: " + overWorkHours);
						System.out.println("Insurance Plan Code: " + insurancePlanCode);
						System.out.println("Gross Pay: $" + grossPay);
						System.out.println("Income Tax: $" + incomeTax);
						System.out.println("Insurance Premium: $" + finalInsuranceCost);
						System.out.println("Take Home Pay: $" + takeHomePay);
 
					}
				}
			}
		}

					
		// close input stream
		input.close();

	} // end main
} // end Homework3Class
