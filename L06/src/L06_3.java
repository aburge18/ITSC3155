import java.util.Arrays;
import java.util.Scanner;
public class L06_3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please provide the number of names you would like to enter:");
		int count = input.nextInt();
		String names[] = new String[count+1];
		for (int i = 0; i < (count+1); i++) {
			System.out.print("Please submit your entries one by one:");
	            names[i] = input.nextLine();
		 }
		System.out.println(Arrays.toString(names));
		}
}