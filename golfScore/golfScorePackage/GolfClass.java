
//
//	GolfClass
//
//	The purpose of this class is to calculate the golf scores for players 
//
//	Author:		Sien Sun
//	Date:		30/10/18
//

package golfScorePackage;
import java.util.Scanner;

public class GolfClass
{

	public static void main(String[] args)
	{
		// create an input stream object here
	    Scanner input = new Scanner(System.in);	           // create an input stream		
	    
	    // declare variables here
	    String cleanUpStr;		                   // clean up keyboard buffer
	    
	    int parForHole1;                           //par score for hole 1 
	    int parForHole2;                           //par score for hole 2
	    int parForHole3;                           //par score for hole 3 
	    
	    int score1Player1;   			// score for player 1 for hole 1 
	    int score1Player2;   			// score for player 2 for hole 1 
	    
	    int score2Player1;   			// score for player 1 for hole 2 
	    int score2Player2;   			// score for player 2 for hole 2
	    
	    int score3Player1;   			// score for player 1 for hole 3
	    int score3Player2;   			// score for player 2 for hole 3
	    
        String nameOfPlayer1;           // the name of player 1
        String nameOfPlayer2;           // the name of player 2 
        
        int totalParScore;              // total par score for the game
        int totalScoreForPlayer1;       // total scores for player 1 
        int totalScoreForPlayer2;       // total scores for player 2
         
	    // initialize variables here
	    cleanUpStr = "none yet"; 
	    
	    parForHole1 = 0;                        
	    parForHole2 = 0;                          
	    parForHole3 = 0;                         
	    
	    score1Player1 = 0;   			
	    score1Player2 = 0;   			
	    
	    score2Player1 = 0;   			
	    score2Player2 = 0;   			
	    
	    score3Player1 = 0;   			
	    score3Player2 = 0;   			
	    
        nameOfPlayer1 = "none yet";           
        nameOfPlayer2 = "none yet";          
        
        totalParScore = 0;              
        totalScoreForPlayer1 = 0;       
        totalScoreForPlayer2 = 0;         			
	   
	    
	    // start rest of code here
	    
	    // print out my name to console
	    System.out.println("My name is Sien Sun");
	    
	    // prompt user enter name of player 1
	    System.out.println("Enter the name of player 1: ");
	    
	    // read in the name of player 1 
	    nameOfPlayer1 = input.nextLine();
	    
	    // prompt user enter name of player 2
	    System.out.println("Enter the name of player 2: ");
	    
	    //read in the name of player 2 
	    nameOfPlayer2 = input.nextLine();
	    
	    // prompt user to enter the par score for hole 1 
	    System.out.println("Input the par score for hole 1: ");
	    
	    //read in the the par score for hole 1
	    parForHole1 = input.nextInt();
	    
	    // clean up the key board buffer
	    cleanUpStr = input.nextLine();
	    
	    // validate the par score for hole 1 
	    if(parForHole1 <= 0)
	    {
	    	System.out.println("Invalid Par Score for Hole 1.");
	    }
	    
	    else
	    {
	     // print out name of player 1 to console
	     System.out.println(nameOfPlayer1);
	   
	    // prompt user enter score 1 for player 1 
	    System.out.println("Enter the score 1 for " + nameOfPlayer1);
	    
	    // read in the score 1 for player 1 
	    score1Player1 = input.nextInt();
	    
	    // clean up the key board buffer
	    cleanUpStr = input.nextLine();
	    }
	 
	    
	    // validate the score 1 for player 1 
	    if(score1Player1 <= 0)
	    {
	    	System.out.println("Invalid Score 1 for " + nameOfPlayer1);
	    }
	    
	    else
	    {
	    // print out name of player 2 to console
	    System.out.println(nameOfPlayer2);
	    
	    // prompt user enter score 1 for player 2 
	    System.out.println("Enter the score 1 for " + nameOfPlayer2);
	    
	    // read in the score 1 for player 2 
	    score1Player2 = input.nextInt();
	    
	    // clean up the key board buffer
	    cleanUpStr = input.nextLine();
	    }
	    
	    // validate the score 1 for player 2
	    if(score1Player2 <= 0)
	    {
	    	System.out.println("Invalid Score 1 for " + nameOfPlayer2);
	    }
	   
	    else
	    {
	    // prompt user to enter the par score for hole 2
	    System.out.println("Enter the par score for hole 2: ");
	    
	    //read in the the par score for hole 2
	    parForHole2 = input.nextInt();
	    
	    // clean up the key board buffer
	    cleanUpStr = input.nextLine();
	    }
	    
	    // validate the par score for hole 2
	    if(parForHole2 <= 0)
	    {
	    	System.out.println("Invalid Par Score for Hole 2");
	    }
	    
	    else
	    {
	    // print out name of player 1 to console
	    System.out.println(nameOfPlayer1);
	    
	    // prompt user enter score 2 for player 1 
	    System.out.println("Enter the score 2 for " + nameOfPlayer1);
	    
	    // read in the score 2 for player 1 
	    score2Player1 = input.nextInt();
	    
	    // clean up the key board buffer
	    cleanUpStr = input.nextLine();
	    }
	    
	    // validate the score 2 for player 1 
	    if(score2Player1 <= 0)
	    {
	    	System.out.println("Invalid score 2 for " + nameOfPlayer1);
	    }
	    
	    else
	    {
	    // print out name of player 2 to console
	    System.out.println(nameOfPlayer2);
	    
	    // prompt user enter score 2 for player 2 
	    System.out.println("Enter the score 2 for " + nameOfPlayer2);
	    
	    // read in the score 2 for player 2 
	    score2Player2 = input.nextInt();
	    
	    // clean up the key board buffer
	    cleanUpStr = input.nextLine();
	    }
	    
	    // validate the score 2 for player 2
	    if(score2Player2 <= 0)
	    {
	    	System.out.println("Invalid score 2 for " + nameOfPlayer2);
	    }
	    else
	    {
	    // prompt user to enter the par score for hole 3
	    System.out.println("Enter the par score for hole 3: ");
	    
	    //read in the the par score for hole 3
	    parForHole3 = input.nextInt();
	    
	    // clean up the key board buffer
	    cleanUpStr = input.nextLine();
	    }
	    
	    // validate the par score for hole 3
	    if(parForHole3 <= 0)
	    {
	    	System.out.println("Invalid Par Score for Hole 3");
	    }
	    else
	    {
	    // print out name of player 1 to console
	    System.out.println(nameOfPlayer1);
	    
	    // prompt user enter score 3 for player 1 
	    System.out.println("Enter the score 3 for " + nameOfPlayer1);
	    
	    // read in the score 3 for player 1 
	    score3Player1 = input.nextInt();
	    
	    // clean up the key board buffer
	    cleanUpStr = input.nextLine();
	    }
	    
	    // validate the score 3 for player 1 
	    if(score3Player1 <= 0)
	    {
	    	System.out.println("Invalid score 3 for " + nameOfPlayer1);
	    }
	    
	    else
	    {
	    // print out name of player 2 to console
	    System.out.println(nameOfPlayer2);
	    
	    // prompt user enter score 3 for player 2 
	    System.out.println("Enter the score 3 for " + nameOfPlayer2);
	    
	    // read in the score 3 for player 2 
	    score3Player2 = input.nextInt();
	    
	    // clean up the key board buffer
	    cleanUpStr = input.nextLine();
	    }
	    
	    // validate the score 3 for player 2
	    if(score3Player2 <= 0)
	    {
	    	System.out.println("Invalid Score 3 for " + nameOfPlayer2);
	    }
	    else
	    {
	    // print out the score for player 1 for each hole
	    System.out.println("The score 1 for " + nameOfPlayer1 + "is " +  score1Player1);
	    System.out.println("The score 2 for " + nameOfPlayer1 + "is " +  score2Player1);
	    System.out.println("The score 3 for " + nameOfPlayer1 + "is " +  score3Player1);
	    
	    // print out the score for player 2 for each hole
	    System.out.println("The score 1 for " + nameOfPlayer2 + "is " +  score1Player2);
	    System.out.println("The score 2 for " + nameOfPlayer2 + "is " +  score2Player2);
	    System.out.println("The score 3 for " + nameOfPlayer2 + "is " +  score3Player2);
	    
	    // calculate the total par score and the total score of each player
	    totalParScore = parForHole1 + parForHole2 + parForHole3;
	    
	    totalScoreForPlayer1 = score1Player1 + score2Player1 + score3Player1;
	    totalScoreForPlayer2 = score1Player2 + score2Player2 + score3Player2;

	    // compare the status of total par score and total score for player 1
	    if(totalParScore > totalScoreForPlayer1)
	    {
	    	System.out.println("Status for " +  nameOfPlayer1 +  "for the game is: Below Par");
	    }
	    else if(totalParScore == totalScoreForPlayer1)
	    {
	    	System.out.println("Status for " +  nameOfPlayer1 +  "for the game is: Par");
	    }
	    else if(totalParScore < totalScoreForPlayer1)
	    {
	    	System.out.println("Status for " +  nameOfPlayer1 +  "for the game is: Over Par");
	    }
	    
	    
	    // compare the status of total par score and total score for player 2 
	    
	    if(totalParScore > totalScoreForPlayer2)
	    {
	    	System.out.println("Status for " +  nameOfPlayer2 +  "for the game is: Below Par");
	    }
	    else if(totalParScore == totalScoreForPlayer2)
	    {
	    	System.out.println("Status for " +  nameOfPlayer2 +  "for the game is: Par");
	    }
	    else if(totalParScore < totalScoreForPlayer2)
	    {
	    	System.out.println("Status for " +  nameOfPlayer2 +  "for the game is: Over Par");
	    }
	    
	    // compare who is winner 
	    if(totalScoreForPlayer1 < totalScoreForPlayer2)
	    {
	    	System.out.println(nameOfPlayer1 + "is winner.");
	    }
	    else if(totalScoreForPlayer1 > totalScoreForPlayer2)
	    {
	    	System.out.println(nameOfPlayer2 + "is winner");
	    }
	    else if(totalScoreForPlayer1 == totalScoreForPlayer2)
	    {
	    	System.out.println("There is no winner for the game.");
	    }
	    
	    }
	    // close input stream 
	    input.close();
	    
	    
	} // end main
	
} // end GolfClass
