
/*
 * @author Alexander Burgess
 * @version 3/21/2018
 * Description: This program works as a word replacement program within a user supplied string. First
 * the user supplies a string to work in, then the user supplies the word they wish to be replace as 
 * well as the word they wish to replace it with, all in the form of string input. Then we use the replace
 * string method and reference our original string, the first word and the second in order to replace the word
 * within the string, the method declares and initializes the updated string as a separate variable and the 
 * updated string is fed back to the user in the form of a print statement. 
 */

//Import scanner
import java.util.Scanner;
//Name class
public class Post06_3 {
    public static void main(String[] args) {
    
    System.out.println("ID003");
//Name and establish scanner class     	 
    Scanner input = new Scanner(System.in);
  //Prompt user for string input with print statement 
    System.out.println("Please enter a string of your choosing:");
//Declare string and initialize user supplied value  	
    String s = input.next();
//Prompt user for word they would like replaced in the form of string input
    System.out.println("What word would you like to be replaced?");
//Declare variable for first word and initialize user input 
    String s1 = input.next();
//Print statement prompts user for a string they want to replace the first word with
	System.out.println("Please enter the string you would like to replace it with:");
//Declare variable for string they want to replace the first string with and initialize user input
	String s2 = input.next();
//Replaces user provided string with the second user provided string and declares a separate variable and initializes it   	
	String replaceString=s.replace(s1,s2);
//The updated string is fed back to the user in the form of a print statement
	System.out.println("The updated string is: " + replaceString);
    }
}