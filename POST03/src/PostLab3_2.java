
/*
 * @author Alexander Burgess
 * @version 2/14/2018
 * Description: This program takes an three digit number supplied by the user and determines whether it is palindrome by
 * using calculations and variable declarations to separate the first and last digit into separate variables. The variables
 * are compared and used to determine if the number is palindrome.
 * Pseudocode: [Steps of the program]
 * Import Scanner
 * Name class
 * Name class for scanner input
 * Prompt user for three digit number as input
 * Declare, scan and initialize input as usable variable
 * Declare, calculate, and initializes the first and last digit of the users input as separate variables
 * Use if statement to determine if first and last digit are the same, if they're the same, display to the user that the number is palindrome
 * Else statement is processed if it is not palindrome and informs users their input is not a palindrome number
 */
import java.util.Scanner;
public class PostLab3_2 {
    public static void main(String[] args) {
    	System.out.println("ID002");
    Scanner input = new Scanner(System.in);

//Ask user for three digit input
    System.out.println("Enter a three digit number in order to determine whether or not it is a palindrome number:");
 
 //Declares, scans, and initializes the user's input as a usable variable
 int num = input.nextInt();
 
 //Declares, calculates, and initializes the first and last digit of the users input as separate variables
 int firstDigit = num/100;
 int lastDigit = num%10;

 //If statement determining whether or not the first digit and the last digit of the user's input are the same 
 if (firstDigit == lastDigit) 
	 System.out.println(num + " is indeed a palindrome number");
 
 //Else statement informing the user that the number is not a palindrome number 
 else
	 System.out.println(num + "is not a palindrome number");
 
    }
}