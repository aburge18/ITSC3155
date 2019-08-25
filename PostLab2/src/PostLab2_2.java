
/*
 * @author Alexander Burgess
 * @version 2/7/2018
 * Description: This program takes the user supplied values for balance
 * and annual interest rate in order to calculate the interest accumulated
 * over the course of a year
 * Pseudocode: [Steps of the program]
 * Import Scanner
 * Name class
 * Name class for scanner input
 * Declare variable for balance and annual interest rate
 * Prompt user for input for balance and annual interest rate
 * Initialize input as values for balance and annual interest rate
 * Declare and initialize variable for interest
 * Display value for interest 
 */
import java.util.Scanner;
public class PostLab2_2 {
    public static void main(String[] args) {
    	System.out.println("ID002");
    Scanner input = new Scanner(System.in);
double balance;
double annualInterestRate;
    	System.out.println("Enter balance and annual interest rate:");
    balance = input.nextDouble();
    annualInterestRate = input.nextDouble();
double interest = balance*(annualInterestRate/1200);
		System.out.println("The interest is " + interest);
    }
}