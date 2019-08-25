
/*
 * @author Alexander Burgess
 * @version 2/7/2018
 * Description: This program takes your lottery numbers, compares them against
 * the randomnly chosen winning numbers and returns display messages based on
 * the number of matches
 * Pseudocode: [Steps of the program]
 * Import Scanner
 * Name class
 * Name class for scanner input
 * Declare variables for lottery (random) and guess
 * Prompt user for their chosen numbers
 * Initialize input as values for guess
 * Use randonly generated number to calculate a set of lottery numbers and initialize them
 * Compare numbers against the lottery numbers using, if, else and if else statements
 * Depending on number of matches, return display message informing the player of their results and winnings
 */
import java.util.Scanner;
public class PRE03 {
    public static void main(String[] args) {
    	System.out.println("ID001");
    Scanner input = new Scanner(System.in);
int lottery = (int)(Math.random()*100);
int guess;
    	System.out.println("Enter your lottery pick (two digits):");
    guess = input.nextInt();
int lotteryDigit1 = lottery/10;
int lotteryDigit2 = lottery%10;
int guessDigit1 = guess/10;
int guessDigit2 = guess%10;
		if (guess == lottery)
			System.out.println("Exact match: you win $10,000");
		else if (guessDigit2 == lotteryDigit1 && guessDigit1 == lotteryDigit2)
			System.out.println("Match all digits: you win $3,000");
		else if (guessDigit1 == lotteryDigit1 || guessDigit1 == lotteryDigit2 || guessDigit2 == lotteryDigit1 || guessDigit2 == lotteryDigit2)
			System.out.println("Match one digit: you win $1,000");
		else
			System.out.println("Sorry no match");
    }
}