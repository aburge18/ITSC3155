/*
 * @author Alexander Burgess
 * @version 3/18/2018
 * Description: This program uses a series of string and array methods to manipulate a user provided string sentence and offers a menu
 * of options that the user may employ to ascertain the desired string output. The program displays menu options in the form of print statements
 * and prompts the user for a selection. The program uses switch case statements and checks the char value of the menu selection in order to determine
 * which statements to execute. The first menu option simply prompts the user to re-enter a new main string sentence, reinitializes it and also prompts 
 * the user for a new menu selection and initializes that as well. The second two menu options uses the index string method to display the index of a string 
 * provided by the user. The index is fed back to the user as an integer value in the form of a print statement. The find and replace option uses the index string 
 * method to determine the string's location and string replace method to replace the string provided by the user with the second string provided by the user.
 * The next option just uses the string replace method to replace the provided string with a second provided string for every instance in the original sentence. 
 * The altered sentence is displayed back to the user in the form of a print statement. The word count option uses for statements and increments to add an increment for
 * each string that is bookended by a pair of spaces. The ending value is resolved as a word count integer variable and is displayed back to the user in the form of a print
 * statement. This method uses for statements and increments to add an increment for each instance of the user provided character. The final value is resolved and initialized
 * as an integer variable and displayed back to the user in the form of a print statement. For the character count option, I used the trim string method to remove all spaces from
 * the string. The new string is declared and initialized separately and the length string method was used to generate an integer value that represents the true number of characters.
 * This number is fed back to the user in the form of a print statement. The find and delete method asks the user to input the string they want deleted and uses the replace string method
 * to replace the chosen string with a whitespace, essentially removing it from the string. The final option just results in a print statement that bids the user goodbye. 
 */
import java.util.Arrays;

//Import Scanner
import java.util.Scanner;

//Name class
public class ASSIGNMENT2 {
	public static void main(String[] args) {
		
//Establish scanner class 		
		Scanner input = new Scanner(System.in);
//Prompt user to enter the main sentence	
		System.out.println("Please enter a main sentence:");
//Declare variable and initialize input for the main string sentence
	String s = input.next();
//Print statements for menu selection
	System.out.println("(A) Enter a new main sentence");
	System.out.println("(B) Find a String");	
	System.out.println("(C) Find all incident of a String");	
	System.out.println("(D) Find and Replace a String");	
	System.out.println("(E) Replace all incidents of a String");
	System.out.println("(F) Count the number of words");
	System.out.println("(G) Count a letter's occurences");
	System.out.println("(H) Count the total number of letters");
	System.out.println("(I) Delete all the occurences of a word");
	System.out.println("(J) Exit");
//Prompt user for input for menu selection 	
	System.out.println("Please enter your selection:");
//Declare variable and initialize user input as saved value 	
	String select = input.next();

//Switch and case statements for menu options and user selection	
    switch (select) {
//Case for if user submits "A"
    case "A":
//Print statement prompts user for new main string sentence     	
    	System.out.println("Please enter a new main sentence:");
//Initializes user input as string sentence variable   	
       s = input.next();
//Print statement prompts user for new main menu selection
       System.out.println("Please enter a new menu selection:");
//Initializes user input for value of selection variable
       select = input.next();
        break;
//Case for if user submits "B"  
    case "B":
//Print statement prompts user for searchable keyword
    	System.out.println("Enter a keyword to search for:");
//Declares keyword variable and intializes user input as the value    	
    	String keyword = input.next();
//Declare index variable and use string method to initialize the value as the index of the given string    	
    	int index=s.indexOf(keyword);
 //If statement for string index, if index is greater than or equal to zero than it is present in the string	
    	if (index >= 0 ) {
//Print statement informs the user of the index of the keyword    		
    		System.out.println(keyword + " is located at " + index);
    	}
//Else statement for when the keyword is not located in the string 
    	else 
//Print statement informs the user that the word is not located in the provided string     		
    		System.out.println(keyword + " was not found in the sentence.");
    	
    	break;
//Case for if user submits "C"   
    case "C":
//Print statement prompts the user for the keyword that the user would like to locate in the string
    	System.out.println("Please enter the keyword you would like to search for:");
//Declare variable for keyword and initalize the user input for its established value    	
    	String keyword3 = input.next();
    	
        break;
//Case for if user submits "D"
    case "D":
//Print statement prompts user for the keyword they would like to search for	
    	System.out.println("Enter a keyword to search for:");
//Declare variable for keyword and intialize user input as the value    	
    	String keyword1 = input.next();
//Declare int variable for index of keyword and use string method to generate and initialize the value    	
    	int index1=s.indexOf(keyword1);
//If statement for string index, if index is greater than or equal to zero than it is present in the string	    	
    	if (index1 >= 0 ) {
//Print statement informs the user of the index of the keyword    		
    		System.out.println(keyword1 + " is located at " + index1);
    	}
//Else statement for when the keyword is not located in the string 
    	else 
//Print statement informs the user that the word is not located in the provided string         		
    		System.out.println(keyword1 + " was not found in the sentence.");
//Print statement prompts the user for the keyword they would like to replace the string value with    	
    	System.out.println("Enter a keyword to replace it with:");
//Declare variable for second keyword and initialize the user input as the value    	
    	String keyword2 = input.next();
//Statement replaces the first user provided keyword with the second provided keyword and declares and initializes it as a separate string	
    	String replaceString2=s.replace(keyword1,keyword2);
//Print statement feeds the altered string sentence back to the user
    	System.out.println("The new string is: " + replaceString2);
    	
        break;
//Case for if user submits "E"   
    case "E":
//Print statement prompts user for keyword they would like replaced in the string sentence    	
    	System.out.println("Please enter the string you would like to be replaced:");
//Declare variable for string they want replaced and initialize user input 
    	String s1 = input.next();
//Print statement prompts user for word they want to replace the first keyword with
    	System.out.println("Please enter the string you would like to replace it with:");
//Declare variable for string they want to replace the first string with and initialize user input
    	String s2 = input.next();
//Replaces user provided keyword with the second user provided keyword and declare initilalizes it as a separate string    	
    	String replaceString=s.replace(s1,s2);
    	System.out.println("The updated string is: " + replaceString);
        break;
//Case for if user submits "F"  
    case "F":
//Declare and initialize variable for total word count    	
    	int wordcount = 0;
    	
//For statement that establishes i and the length of the string    	
    	for(int i=0; i<s.length()-1; i++)
        {
//If statement increments i each time a string is bookended with a set of spaces    		
            if(s.charAt(i)==' ' && s.charAt(i+1)!=' ')
//Saves value to the wordcount variable               
            	wordcount++;
        }
//Print statement feeds the total word count back to the user in the form of an integer value    	
    	System.out.println("The word count of the string is: " + wordcount);
        break;
//Case for if user submits "G"  
    case "G":
//Print statement prompts user for char the whose instances they would like to be counted
      System.out.println("Enter the character whose occurences you would like to count:");
//Variable for char is declared and initialized as a string       
      String letter = input.next();
//Converts string variable into a char variable 
      char c = letter.charAt(0);
//Declares integer variable for character count and initializes it       
       int charcount = 0;
//For statement establishes i and length of string        
      for (int i = 0; i < s.length(); i++) {
//If statement established that would be incremented for each instance of the user provided character
          if (s.charAt(i) == c) {
//Resolves saved value you to the character count variable             
        	  charcount++;
          }
      }
//Print informs user of the number of times the character occurs in the string
      System.out.println("This character occurs in the string " + charcount + " times!");
        break;
//Case for if user submits "H"  
    case "H":
//String method replaces all the spaces in the string and removes them, leaving only characters	
    	String noSpaces=s.replace(" ","");
//Declare integer variable and initialize the value as the length of the string 
    	int charCount = noSpaces.length();
//Length of string now represents the character count so the print statements displays it back to the user 
    	System.out.println("There are " + charCount + " characters in the string");
 
        break;
//Case for if user submits "I"  
    case "I":
//Print statement prompts user for the char sequence they want removed from the user provided string
    	System.out.println("Please enter a char sequence you would like deleted from the sentence:");
//Declare string variable for the char sequence provided by the user and initialize it 
    	String sequence1 = input.next();
//String method replaces the provided char sequence with whitespace, essentially deleting it
    	String replaceString1=s.replace(sequence1,"");
//Print statement returns the updated string sentence to the user 
    	System.out.println("The updated sentence is: " + replaceString1);
        break;
//Case for if user submits "J"  
    case "J":
//Print statement displays goodbye message and terminates prograam
        System.out.println("Goodbye!");
       
}
	}
}