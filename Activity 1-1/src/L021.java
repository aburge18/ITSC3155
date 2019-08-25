/*
 * @author Alexander Burgess
 * @version 5/20/2017
 * Description: This program is intended to help you understand division 
 * and mod operations between integers
 * Pseudocode: [Steps of the program]
 * 
 * 
 */
import java.util.Scanner; 
public class L021 {
	Scanner input = new Scanner(System.in);
	int int1, int2;
	System.out.println("What two integers woud you like to use?");
	int1=input.nextInt()
			int2=input.nextInt();
	if (int2=0)

		int division=int1/int2; 
		int mod=int1%int2 ;
	System.out.println("The result of division between your integers is"+division);
	System.out.println ("The result of mod operations between your integers is" +mod);
}