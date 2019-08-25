import java.util.Scanner;
public class Activity3_9 {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Welcome! Please enter the numerator and denominator of a fraction and find out if it is improper.");
    System.out.println("Please enter the numerator of your fraction:");
    int num = input.nextInt();
    System.out.println("Please enter the denominator of your fraction:");
    int den = input.nextInt();
    int whole = num/den;
    int remainder = num%den;
    if (num > den)
    	System.out.println(num + "/" + den + " is an improper fraction and its mixed fraction is " + whole + " plus " + remainder + "/" + den);
    else if (num%den == 0)
    System.out.println(num + "/" + den + " reduces to.");
    else
    	System.out.println(num + "/" + den + " is a proper fraction.");
    }
}