import java.util.Scanner;
public class Activity4 {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
int year;
    	System.out.println("Want to know whether it's a leap year or not? Enter the current year and find out.");
    year = input.nextInt();
if (year%4 == 0 && year%100 != 0 || year%400 == 0) {
	System.out.println("The current year is indeed a leap year!");
}
else 
	System.out.println("The current year is not a leap year!");
    }
}