
/*
 * @author Alexander Burgess
 * @version 1/28/2018
 * Description: This program takes the number of kilometers given by the user and converts
 * the value into miles.
 * Pseudocode: [Steps of the program]
 * Import Scanner
 * Name class
 * Name class for scanner input
 * Declare variables for kilometer
 * Prompt user for input for kilometer
 * Initialize input as values for kilometer
 * Declare, intitialize and calculate value for miles
 * Display number of miles
 */
import java.util.Scanner;
public class PostLab_1 {
    public static void main(String[] args) {
    	System.out.println("ID001");
    Scanner input = new Scanner(System.in);
 double kilometers;
 		System.out.println("Enter the number of miles:");
 	kilometers = input.nextDouble();
 double miles = kilometers*0.621;
 		System.out.println(kilometers + " kilometers equals " + miles + " miles");
    }
}