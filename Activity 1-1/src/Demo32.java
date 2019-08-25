/**
  * @author ITSC 1212 Class!
  * @version 09/13/2017
  * Description: Small cafe - allow the user to buy something from the menu
  *
  * Pseudocode:
  * 1. Display a Cafe menu
  * 2. Update price according to what the user wishes to purchase
  * 3. Display a specific message according to what the customer would like to buy
  * 4. Display the price to the user with tax
  * 5. Say goodbye!
  */

// Import Scanner
import java.util.*;

public class Cafe{
  public static void main(String[] args){
    // Declare variables and Scanner
    Scanner scanner = new Scanner(System.in);
    final double TAX_RATE = .07;
    int choice = 0;
    double price = 0;
   int quantity = 0; 

    // Display menu
    System.out.println("Welcome! What would you like to purchase? ");
    System.out.println("1. Coffee");
    System.out.println("2. Tea");
    System.out.println("3. Cookie");

    // Get the user's choice
    System.out.print("\nWhat pet would you like to purchase: ");
    choice = scanner.nextInt();
    System.out.println("How many would you like to purchase?");
    quantity = scanner.nextInt();
    // Determine price and message according to user's choice
    if(choice == 1){
      price = 2.5;
      System.out.println("Coffee is great!");
    }
    else if(choice == 2){
      price = 1.75;
      System.out.println("Sure! We'll get you some tea.");
    }
    else if(choice == 3){
      price = 1.25;
      System.out.println("Yum. Cookies!");
    }
    else{
      System.out.println("You didn't choose anything from our menu!");
    } // End If Statement
    
    double totalCost = ((quantity*price)*TAX_RATE);

    /* Print final price with taxes.
     * Notice that this is a different type of print statement,
     * allowing you to format the value. The %.2f means you round to
     * two decimal places, and the (price * 1.07) is the value to be
     * printed. */
  
    if (totalCost > 0.0) {
    System.out.printf("That will cost $%.2f with tax.", +totalCost ); 
    }
    System.out.println("\nGoodbye!");

  } // End Main Method
} // End Class