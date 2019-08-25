
/*
 * @author Alexander Burgess
 * @version 3/21/2018
 * Description: This program is intended to calculate the word count of a user supplied string using a for loop whose condition is set to the length of the string, it establishes i
 *as the incremented variable and it also uses an if statement that requires a word to be book ended by spaces for the wordcount variable to be incremented.
 */

//Import scanner
import java.util.Scanner;
public class Post06_1 {
    public static void main(String[] args) {
    
    System.out.println("ID001");
//Name and establish scanner class     	 
    Scanner input = new Scanner(System.in);
//Prompt user for string input with print statement 
    System.out.println("Please enter a string of your choosing:");
//Declare string and initialize user supplied value  	
    String s = input.next();
//Declare and initialize wordcount variable    
    int wordcount =  0;
//For loop that establishes i and the condition of the string    	
	for(int i=0; i<s.length()-1; i++)
    {
//If statement increments i each time a string is bookended with a set of spaces    		
        if(s.charAt(i)==' ' && s.charAt(i+1)!=' ')
//Saves value to the wordcount variable               
        	wordcount++;

    }
//Display the word count back to the user in a print statement 	
	System.out.println("There are " + wordcount + " words in this string");
    
    }
}