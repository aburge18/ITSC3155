import java.util.Scanner;
public class Activity2 {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    	int membership;
    	System.out.println("Welcome! Based on your membership status, you may be entitled to a discount. Enter your membership code now to find out.");
    membership = input.nextInt();
    switch (membership) 
    {
        case 1:  membership = 2014;
        	System.out.println("You're entitled to a 15% discount!");
                 break;
        case 2:  membership = 2015;
        	System.out.println("You're entitled to a 10% discount!");
                 break;
        case 3:  membership = 2016;
        	System.out.println("You're entitled to a 5% discount!");
                 break;
        default :
            System.out.println("You did not supply a code or are not entitled to a discount");
    }
}
}