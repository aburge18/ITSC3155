
/*
 * @author Alexander Burgess
 * @version 2/28/2018
 * Description: We are developing a program that analyzes a user supplied string, character and slot
 * number and subsequently uses string methods and print statements to inform the user of the string
 * length, the character occupying the slot number and the slot number which is being occupied by the
 * user supplied character
 */

//Import scanner 
import java.util.Scanner;
import java.util.Random; 
public class PostLab4_2 {
public static void main(String arg[]) {
	
//Name and establish scanner class
	Scanner input = new Scanner(System.in);
	System.out.println("ID002");	

//Prompt user to input a string	
	System.out.println("Please enter a String:");

//Declare and initialize user input as string variable	
	String str = input.next();
//Prompt user to input a letter in the form of a string	
	System.out.println("Please enter a letter:");
	
//Declare and initialize user input as string value	
	String letter = input.next();

//Convert user-supplied string value into a char value using a string method	
	char letter1 = str.charAt(0);

//Prompt user to input a slot number	
	System.out.println("Please enter a slot number:");

//Declare and intialize user input for slot number as integer value	
	int number = input.nextInt();

//Use index string method to generate integer value for the slot that the user supplied character occupies	
	int number1 = str.indexOf(letter1);

//Use length string method to generate integer value for the length of the user supplied string	
	int length = str.length();

//Use charAt string method to generate char value of the character that occupies the user supplied slot number	
	char letter2 =str.charAt(number);
//Use print statement to display the string length of the user supplied string
	System.out.println("The string length is: " + length);
	
//Use print statement to display the slot number of the user supplied character 	
	System.out.println("The slot number of letter " + letter1 + " is: " + number1 );
	
//Use print statement to display the character of the user supplied slot number	
	System.out.println("The letter at slot " + number + " is:" + letter2);
}
}