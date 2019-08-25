import java.util.Arrays;
import java.util.Scanner;
public class Activity5_5 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please input a string value of your choosing:");
		String s = input.next();
		char[] list = new char[(s.length())];
		for (int i = 0; i < (s.length()); i++) {
			 list[i] = s.charAt(i);  
		System.out.println(list);
		}
		System.out.println(Arrays.toString(list));
	}
}
