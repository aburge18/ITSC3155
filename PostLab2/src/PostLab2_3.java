
/*
 * @author Alexander Burgess
 * @version 2/7/2018
 * Description: This program asks for the model and initial cost of the car
 * in order to calculate the cost of sales tax, the value of the discount and the
 * final price of the car, all of which is displayed back to the user in a comprehensive 
 * manner
 * Pseudocode: [Steps of the program]
 * Import Scanner
 * Name class
 * Name class for scanner input
 * Declare variables for model (string) and initial cost (double)
 * Prompt user for input for model
 * Initialize input as values for model
 * Prompt user for input for initial cost
 * Initialize input as values for initial cost 
 * Declare, intitialize and calculate values for the variables tax, discount and final price
 * Displays car model, initial cost, tax, discount and final price back to the user
 */
import java.util.Scanner;
public class PostLab2_3 {
    public static void main(String[] args) {
    	System.out.println("ID003");
    Scanner input = new Scanner(System.in);
String model; 
double cost;
		System.out.println("Enter Car Model:");
	model = input.toString();
		System.out.println("Enter Car Initial Cost:");
	cost = input.nextDouble();
double tax = cost*.0363;
double discount = (cost+tax)*.15;
double finalPrice = (tax+cost)-discount;
		System.out.println("The car model is a " + model);
		System.out.println("The initial cost is: " + cost);
		System.out.println("The sales tax is: " + tax);
		System.out.println("The discount is: " + discount);
		System.out.println("The Final Price is: " + finalPrice);
    }
}