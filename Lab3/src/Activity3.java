import java.util.Scanner;
public class Activity3 {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
int membership;
double bill;
    	System.out.println("Welcome! Based on your membership status, you may be entitled to a discount. Enter your bill total and membership code now to find out.");
    	bill = input.nextDouble();
    	membership = input.nextInt();
double discount = 0;
double afterDiscount = (bill-(bill*discount));
double finalPrice = ((afterDiscount*.046)+afterDiscount);
    switch (membership) 
    {
        case 2014:
discount = .15;
        	System.out.println("You're entitled to a 15% discount! You're total will be " + finalPrice);
                 break;
        case 2015: 
discount = .1;
        	System.out.println("You're entitled to a 10% discount! You're total will be " + finalPrice);
                 break;
        case 2016:
discount = .05;
        	System.out.println("You're entitled to a 5% discount! You're total will be " + finalPrice);
                 break;
        default :
            System.out.println("You did not supply a code or are not entitled to a discount. You're total will be " + finalPrice);
    }
}
}