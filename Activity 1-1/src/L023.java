import java.util.Scanner;
public class L023 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

int gas, miles; 
System.out.println("How many miles did you drive?");
miles=input.nextInt();
System.out.println("How much gas was consumed? (in gallons)");
gas=input.nextInt(); 

double mpg = miles/gas;
System.out.println("Your vehicle produces" +mpg+"miles to the gallon"); 

}
}