import java.util.Scanner;

public class L025 {
public static void main(String[] args) { 
	Scanner input = new Scanner(System.in);
	double bill;
	System.out.println("What is the total of the customer's bill before tip?");
	bill = input.nextDouble();
	double TotalBill = ((bill*.15)+bill);
	System.out.println("The total cost of your bill, including tip, is" +TotalBill);
	
	int days;
	System.out.println("How many days of vacation did you take?");
	days = input.nextInt();
	int weeks = days/7;
	int daysleft = days%7; 
	System.out.println("You were on vacation for a total of" + weeks + "and" +daysleft + "days");
	
	
	
}
}