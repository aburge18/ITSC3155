/*
 * @author Alexander Burgess
 * @version 4/4/2018
 * Description: This program acts as a calculator of area for a polygon of any side number
 * and side length that the user might choose. It uses a method to caclulate the answer and return
 * the area within the final print statement. 
 */

//Import Scanner
import java.util.Scanner;
//Name class
public class POST07 {
    public static void main(String[] args) {
    
    System.out.println("ID001");
//Name and establish scanner class     	 
    Scanner input = new Scanner(System.in);
//Print Statement prompts user for number of sides desired with a print statement    
    System.out.println("Enter the numeber of sides for your regular polygon:");
//Declare and initialize user input as int variable
    int number = input.nextInt();
//Prompt the user for the length of the sides with a print statement    
    System.out.println("Enter the length of each side:");
//Declare and initialize user input as double variable 
    double side = input.nextDouble();
//System print informs user of the area by using a method call involving the user inputted data and varibales    
    System.out.println("The area of your " + number + "-sided polygon is: " + area(number,side));
    }
//Method declaration establishes the return of a double sum and the user of int and double parameters
    public static double area (int n, double side) {
//Calculates polygon area using method parameters and declares and initializes it as a variable
    double area = (n*(side*side))*(4*(Math.tan((Math.PI*n))));
//Ensures that method returns the area variable as the sum    
    return area;
    }

}