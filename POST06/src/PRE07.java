
/*
 * @author Alexander Burgess
 * @version 3/28/2018
 * Description: This program demonstrates defining and invoking methods, in the instance its the
 * swap method that is intended the swap the values for two separate variables, initialize those
 * values and displaying them back to the user. It is intended to demonstrate the basics rules 
 * governing the definition of methods. 
 */

//Import scanner
import java.util.Scanner;
public class PRE07 {
    public static void main(String[] args) {
    
    System.out.println("ID002");
    
//Declare and initialize variables for num1 and num2    
int num1= 1;
int num2= 2;
//Print statement states the values of num1 and num2 prior to the use of the swap method 
System.out.println("Before invoking the swap method, num1 is " + num1 + " and num2 is " + num2);
//Invoke the use of the swap method for the two integer variables num1 and num2 
swap(num1,num2);

//Define swap method with the method name and parameters
public static void swap (int n1, int n2) {
	//Method body
	
	//Print statements essentially set a template for how the program displays its output back to the user
	System.out.println("\tInside the swap method");
	System.out.println("\t\tBefore swapping, n1 is " + n1 + " and n2 is " + n2);
	//Declare and initialize parameter variables for your method body 
	int temp = n1;
	n1 = n2;
    n2 = temp;
    //Print statement sets template for how the user is informed of the values after invoking the swap method. 
    System.out.println("\t\tAfter swapping, n1 is " + n1 + " and n2 is " + n2);
}
    }
}