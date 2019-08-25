
/*
 * @author Alexander Burgess
 * @version 2/28/2018
 * Description: We are creating a program acts as a distance calculator for the distance between two points on a two dimensional
 * plane. The coordinates are supplied by the user and subsequently calculated and displayed to the user. 
 */

//Import scanner 
import java.util.Scanner;
import java.util.Random; 
public class PostLab4_1 {
public static void main(String arg[]) {
	
//Name and establish scanner class
	Scanner input = new Scanner(System.in);
	System.out.println("ID001");	
	
//Declares the variables for both sets of x and y coordinates as well as the final distance
  int x1,x2,y1,y2;
 double distance;

 //Prompt user for first x coordinate
System.out.println("enter first x-coordinate:");

//User input is initialized as the y2 variable    
	x1=input.nextInt();
 
    //Prompt user for first x coordinate   
    System.out.println("Enter first y-coordinate:");

    //User input is initialized as the y2 variable      
    y1=input.nextInt();
 
   //Prompt user for first x coordinate 
   System.out.println("Enter second x-coordinate:");
  
   //User input is initialized as the y2 variable  
   x2=input.nextInt();
 
    //Prompt user for first x coordinate	
    System.out.println("Enter second y-coordinate:");
    
  //User input is initialized as the y2 variable  
    y2=input.nextInt();	  	    
	
     //Calculates the distance using the user supplied values and the distance formula 
     distance=Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1)); 
     //Distance is fed back to the user in the form of a print statement 
  	         System.out.println("The distance between the two points is: " + distance );
	}
 
}