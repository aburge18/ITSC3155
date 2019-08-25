import java.util.Scanner; 
public class Activity7 {
	public static void main(String[] args){
		int numPets1;
		double numPets2; 
		Scanner scan = new Scanner(System.in);
		
		System.out.println("How many pets do you own?");
		numPets1 = scan.nextInt();
		
		System.out.print("How many pets does your partner own?");
		numPets2 = scan.nextInt();
		
		double total = numPets1 + numPets2;
		//Changed NumPets 1 to NumPets1, syntax error, changed data type of the total variable from int to double
		
		System.out.println("Together, you both have" + total + " pets");
		
	}
}
