
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

public class L02 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int length, height;

		System.out.println("What is the length of the rectangle?");
		length = input.nextInt();

		System.out.println("What is the height of the rectangle?");
		height = input.nextInt();

		int area = length * height;
		int perimeter = 2 * length + 2 * height;

		System.out.println("The area of your rectangle is equal to" + area);
		System.out.println("The permieter of your rectangle is equal to" + perimeter);
	}
}