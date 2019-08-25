
/*
 * @author Alexander Burgess
 * @version 2/14/2018
 * Description: This program simulates drawing a card from a 52 card deck, it determines whether the user wants to draw a card
 * and if the user draws a card, it uses a series of random integer generation and switch statements to randomly generate the
 * rank and suit of a standard playing card. 
 * Pseudocode: [Steps of the program]
 * Import Scanner
 * Name class
 * Name class for scanner input
 * Display message asking user if they want to draw card or not (Y/N), prompt for input
 * input is declared, scanned, and initialized as a string variable representing their selection
 * (Start if statement) If they answer "Y":
 * Declare and initialize variables for rank and suit as randomly generated integers
 * These randomly generated integers are assigned to cases in the switch statements representing suit and rank
 * (Rank Switch Statement) based on randomly generated integers from 1-13, one of the 13 cases is displayed as
 * the rank for the drawn card
 * (Suit Switch Statement) based on randomly generated integers from 1-4, on of the 4 cases is displayed as the 
 * suit for the drawn card
 * Final display message is a combination of the print statements generated from our rank and suit switch statements
 * (End if statement)
 * (Start if else statement): If user enters "N":
 * Display message bids the user a goodbye
 */
import java.util.Scanner;
public class PostLab3_1 {
    public static void main(String[] args) {
    	System.out.println("ID001");
    Scanner input = new Scanner(System.in);
   
    //User is asked to draw a card or not, prompted for input
    System.out.println("Would you like to draw a card? (Y/N)");
    
    //Declares and initializes user input as the variable for selection
    	String a = input.next();
    
//If statement determining whether to draw card or not based on user input     
    if(a.equals("Y")){
    
 //Variable Declaration and Initialization for rank and suit   
        int rank = (int)((Math.random()*(13))+1);
        int suit = (int)((Math.random()*(4))+1);
    	
    	System.out.print("The card you have drawn is the ");
	
//Switch Statements determining rank of drawn card
    switch(rank){
    
		case 1: System.out.print("Ace"); break;
		
		case 2: System.out.print(rank); break;
		
		case 3: System.out.print(rank); break;
		
		case 4: System.out.print(rank); break;
		
		case 5: System.out.print(rank); break;
		
		case 6: System.out.print(rank); break;
		
		case 7: System.out.print(rank); break;
		
		case 8: System.out.print(rank); break;
		
		case 9: System.out.print(rank); break;
		
		case 10: System.out.print(rank); break;
		
		case 11: System.out.print("Jack"); break;
		
		case 12: System.out.print("Queen"); break;
		
		case 13: System.out.print("King"); 
		
    }
	System.out.print(" of ");
		
//Switch statements determining suit of drawn card	
	switch (suit){
	
	    case 1: System.out.println("Clubs"); break;
		
	    case 2: System.out.println("Diamonds"); break;
		
	    case 3: System.out.println("Hearts"); break;
		
	    case 4: System.out.println("Spades"); 
	
	}
    
   }
  //Else if Statement detecting whether the user has decided not to draw a card
    else if (a.equals("N")) {
      	 System.out.println("Goodbye!");}
  }
 }