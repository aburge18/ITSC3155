import java.util.Arrays;
import java.util.Scanner;
public class L06_2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please input a string value of your choosing:");
		String s = input.next();
		char[] list = new char[(s.length())];
		for (int i = 0; i < (s.length()); i++) {
			 list[i] = s.charAt(i);  
		System.out.println(list);
		}
		System.out.println("Please input a second string value of your choosing:");
		String s2 = input.next();
		char[] list2 = new char[(s2.length())];
		list2=s2.toCharArray();  
		
		if (Arrays.equals(list, list2)) {
			System.out.println("The two arrays are equivalent!");
		}
		else 
			System.out.println("The two arrays are not equivalent!");
	}
}
