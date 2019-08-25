
/*
 * @author Alexander Burgess
 * @version 2/14/2018
 * Description: This program is intended to gather the month and day of the user's birth and return the user's zodiac
 * sign using a series of if else statements, known date ranges and relational operators
 * Pseudocode: [Steps of the program]
 * Import Scanner
 * Name class
 * Name class for scanner input
 * Ask user for month of birth in form of integer from 1-12
 * Declare, Scan, and initialize user input as the month variable
 * Ask user for day of birth in form of integer from 1-31
 * Declare, scan and intialize user input as the day variable
 * Use if else statements, the known date ranges for zodiac signs and a combination of relational operators to determine user's zodiac sign
 * if else statements print the user's sign and a fun fact about it. 
 */
import java.util.Scanner;
public class PostLab3_3 {
    public static void main(String[] args) {
    	System.out.println("ID003");
    Scanner input = new Scanner(System.in);
//Prompt user for month of birth as integer from 1 to 12    	
    System.out.println("Enter the month you were born as a number from 1 to 12:");

//Declare, scan and initialize the user's input as the month variable    
int month = input.nextInt();  

//Prompt user for day of birth as integer from 1 to 31    	
    	System.out.println("Enter the day you were born as a number from 1 to 31:");

//Declare, scan and initialize the user's input as the day variable     	
int day = input.nextInt();

//Use if else statements and comparisons of the day and month of birth against the known date for each of the zodiac signs
//Display message informing user of sign and give them a fact about their sign

if ((month ==  3 && day >= 21 && day <= 31) || (month ==  4 && day >= 1 && day <= 20))
    System.out.println("You're an Aries! Aries have fiery personalities, very warm, and act on their impulses.");

else if ((month ==  4 && day >= 21 && day <= 30) || (month ==  5 && day >= 1 && day <= 21))
    System.out.println("You're a Taurus! Tauruses are notoriously loyal and steady yet very stubborn!");

else if ((month ==  5 && day >= 22 && day <= 31) || (month ==  6 && day >= 1 && day <= 21))
    System.out.println("You're a Gemini! Geminis are natural socialites and thrive on communication.");

else if ((month ==  6 && day >= 22 && day <= 30) || (month ==  7 && day >= 1 && day <= 22))
    System.out.println("You're a Cancer! Cancers are the most emotional signs in the zodiac and in turn extremely empathetic and compassionate.");

else if ((month ==  7 && day >= 23 && day <= 31) || (month ==  8 && day >= 1 && day <= 22))
    System.out.println("You're a Leo! Leos have a strong sense of self and have great confidence.");

else if ((month ==  8 && day >= 23 && day <= 31) || (month ==  9 && day >= 1 && day <= 23))
    System.out.println("You're a Virgo! Virgos are perfectionists that tend to be neat and organized");

else if ((month ==  9 && day >= 24 && day <= 30) || (month == 10 && day >= 1 && day <= 22))
    System.out.println("You're a Libra! Libras are very balanced and diplomatic in their approach to life.");

else if ((month == 10 && day >= 24 && day <= 31) || (month == 11 && day >= 1 && day <= 22))
    System.out.println("You're a Scorpio! Scorpio is the most powerful sign in the zodiac and are often shrouded in mystery.");

else if ((month == 11 && day >= 23 && day <= 30) || (month == 12 && day >= 1 && day <= 21))
    System.out.println("You're a Sagittarius! Sagittarius are fun loving, pleasure seeking free spirits.");

else if ((month == 12 && day >= 22 && day <= 31) || (month ==  1 && day >= 1 && day <= 20))
    System.out.println("You're a Capricorn! Capricorns have are famous for obsessive compulsive tendencies as well as working hard.");

else if ((month ==  1 && day >= 21 && day <= 31) || (month ==  2 && day >= 1 && day <= 19))
	System.out.println("You're an Aquarius! Aquarius are possibly the most eccentric and enigmatic sign of the zodiac.");

else if ((month ==  2 && day >= 20 && day <= 29) || (month ==  3 && day >= 1 && day <= 20))
    System.out.println("You're a Pisces! Pisces are known to be extremely kind and compassionate and display some pre cognitive abilities.");

    }
}