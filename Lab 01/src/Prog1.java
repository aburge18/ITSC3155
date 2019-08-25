import java.util.Scanner;
public class Prog1 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
	int hours = 0;
	System.out.println("How many hours do you sleep a night?");
	hours = input.nextInt();
	
	if (hours >= 8 ) {
		System.out.println("Good! You got enough sleep.");
	}
	if (hours >= 5 && hours < 8) {
		System.out.println("That's okay. You should probably still need more though!");
	}
	else {
		System.out.println("You definitely need more sleep!");
	}
	}
}