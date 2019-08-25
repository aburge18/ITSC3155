
/*
 * @author Alexander Burgess
 * @version 2/12/2018
 * Description: We creating a program that emulates the software of a gaming console by generating a menu with interactive
 * games that you may choose from and subsequently play through a series of user input, randomnly generated input and if else statements. 
 * Pseudocode: [Steps of the program]
 * Import Scanner and Random
 * Name class
 * Name class for scanner and random input
 * Declare variables for main menu selection
 * Display main menu and user choices and prompt user for selection input 
 * Choice is initialized
 * Generate if statements that enable the user to make a unique choice of game to play
 *(1) Display message introduces user to rock paper scissors and prompts user for a choice and declare variables for user and computer play
 * Choice is initialized
 * Computer input is randomnly generated
 * Rock Paper Scissors if else statements are generated and compared against the user and computer choices
 * Display messages informs the user if they have won or lost
 *(2) Display message introduces you to the Guessing Game, declare variables for random number and user guess and prompts the user to choose a number between 1 and 10
 * user choice is initialized
 * Computer choice is randomly generated and initialized
 * If else statements are used to compare user and computer input
 * Display message informs the user if they have guessed correctly or not. 
 * (3) Display message introduces you to the simple shop game and inventory choices. Declare variables for menu selection, tax and final price. User is prompted for an item choice and quantity. 
 * User Choice and Quantity is initialized and computed through the if else statements
 * Display message informs the customer of the final price after tax and thanks them
 * (4) Display message introduces you to the Multiplication Game and supplies the user with the multiplication problem (randomnly generated)
 * declare variables for answer, solution and the two products.
 * Program prompts the user for their answer to the problem and it is initialized
 * User answer is compared to solution through if else statements
 * Display message informs the user whether they were correct or incorrect
 * (5) Display message tells the user that the console is powering off. 
 */

	//Import scanner and random classes
import java.util.Scanner;
import java.util.Random; 
public class Assignment1 {
    public static void main(String[] args) {
   
    	//Class objects
    Scanner input = new Scanner(System.in);
    Random rand = new Random(); 
  
    //Menu Variable declaration
    int selec;
    
    
    //Main menu
    	System.out.println("Welcome to the Java gaming console! Please select a game:");
    	System.out.println("(1) Rock Paper Scissors Game");
    	System.out.println("(2) Guessing Game");
    	System.out.println("(3) Simple Shop Game");
    	System.out.println("(4) The Multiplication Game");
    	System.out.println("(0) Power Off");
    selec=input.nextInt();
    
    //Rock Paper Scissors	
    if (selec == 1) {
			System.out.println("Welcome to Rock Paper Scissors! Please select rock, paper or scissors to begin the match:");
			System.out.println("(1) Rock");
			System.out.println("(2) Paper");
			System.out.println("(3) Scissors");
			
	//Rock Paper Scissors Variable Declaration
			int human;
		    String human1 = "S";
		    int computer;
		    String computer1 = "S";
		computer=rand.nextInt(3)+1; 
		
		if (computer == 1) 
		       computer1 = "R"; 
		    else if (computer == 2) 
		       computer1 = "P"; 
		    else if (computer == 3) 
		       computer1 = "S"; 
		
		human=input.nextInt();
		
		 if (human == 1) 
		       human1 = "R"; 
		    else if (human == 2) 
		       human1 = "P"; 
		    else if (computer == 3) 
		       human1 = "S"; 
	
	 //Rock Paper Scissors if else statements and output (string data since int data cannot be used in boolean operations)
		    else if (human1 == ("R")) 
		       if (computer1 == ("S")) 
		          System.out.println("Rock beats scissors. You win!");
		    else if (computer1 == ("P")) 
		            System.out.println("Paper beats rock. You lose!"); 
		    else if (human1 == ("P")) 
		       if (computer1 == ("S")) 
		       System.out.println("Scissor beats paper. You lose!"); 
		    else if (computer1 == ("R")) 
		            System.out.println("Paper beats rock. You win!"); 
		    else if (human1 == ("S")) 
		         if (computer1 == ("P")) 
		         System.out.println("Scissor beats paper. You win!"); 
		    else if (computer1 == ("R")) 
		            System.out.println("Rock beats scissors. You lose!"); 
}
    	//The Guessing Game
    	if (selec == 2) {
			System.out.println("Welcome to the Guessing  Game! Please select a number between one and ten and see if you've guessed correctly:");
			//Guessing Game Variable Declaration 
			int humanNum;
			    int computerNum;
			humanNum=input.nextInt();
			computerNum=rand.nextInt(10)+1; 
			
			//Guessing Game if else statements and output
			if (humanNum == computerNum)
				System.out.println("You've guessed correctly! You win!");
			else
				System.out.println("You've guessed incorrectly! You lose!");
			}
    
    	
    	//Simple Shop Game
    	if (selec == 3) {
			System.out.println("Welcome to the Simple Shop Game! Please make a selection from our inventory:");
			System.out.println("(1) Coffee: $1.20 per item");
			System.out.println("(2) Milk: $2.20 per item");
			System.out.println("(3) Chips: $0.99 per item");
			//Simple Shop Variable Declaration
			int shop;
			    int quantity = 0;
			    double price=0;
			    double tax = 0.1;
			    double totalPrice = (((price*quantity)*tax)+(price*quantity));
			shop=input.nextInt();
			System.out.println("How many of this item would you like to purchase?");
    	quantity=input.nextInt();
    	
    	//Simple Shop Game if else statements and output
    	if (shop == 1) {
    		price = 1.20;
    		totalPrice = (((price*quantity)*tax)+(price*quantity));
			System.out.println("Your final total is $" + totalPrice + " Thank you for shopping with us, goodbye!");
			
    	}
		if (shop == 2) {
		price=2.20;
		totalPrice = (((price*quantity)*tax)+(price*quantity));
			System.out.println("Your final total is $" + totalPrice + " Thank you for shopping with us, goodbye!");	
	
				}
		
		if (shop == 3) {
			price=0.99;
			totalPrice = (((price*quantity)*tax)+(price*quantity));
			System.out.println("Your final total is $" + totalPrice + " Thank you for shopping with us, goodbye!");
    	
		}
		}
    	
		
		
		//Custom Game
		if (selec == 4) {
			System.out.println("Welcome to the Multiplication Game! A problem will be displayed and you must answer it correctly:");
			//Custom Game Variable Declaration
			int mult1;
			    int mult2;
			    int answer;  
			mult1=rand.nextInt(12)+1; 
			mult2=rand.nextInt(12)+1; 
			 int solution = (mult1*mult2);
			System.out.println("What is the asnwer to " + mult1 +" times " + mult2 + "?");
			answer=input.nextInt();
			
			//Custom game if else statements and output
			if (answer == solution)
				System.out.println("You are correct! Excellent job!");
			else
				System.out.println("Sorry, you are incorrect. Please try again");
    	}
    	
		//Powering off
		if (selec == 0) {
			System.out.println("Powering off...Goodbye!");
			
    	}
    }
}