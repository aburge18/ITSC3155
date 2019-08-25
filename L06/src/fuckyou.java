import java.util.Scanner;
public class fuckyou{
  public static void main(String[] args){
     Scanner scan = new Scanner(System.in);

     displayMenu();
     System.out.print("Enter your choice: ");
     int choice = scan.nextInt();

     if(choice == 1){
       System.out.print("Enter two numbers to add: ");
       int num1 = scan.nextInt();
       int num2 = scan.nextInt();
       System.out.println("Sum = " + add(num1, num2));
       
       System.out.println("Please enter the two numbers you would like to operate on:");
       int a = scan.nextInt();
       int b = scan.nextInt();
       double a1 = a;
       double b1 = b;
    	
       else if (choice ==2) {
    	   add;}
    	   
       
    		   
     }
     
     // Complete the code...
  }
  
  public static void displayMenu(){
    System.out.println("1. Add");
    System.out.println("2. Subtract");
    System.out.println("3. Subtract with doubles");
    System.out.println("4. Multiple");
    System.out.println("5. Divide");
 }

 public static int add(int a, int b){
    int sum = a + b;
    return sum;
 }

 public static int subtract(int a, int b){
    return a - b;
 }

 public static double subtract(double a1, double b1){
double sub = a1 - b1 ;
return sub;
}

 // Create a multiplication method that returns a double

 // Create a division method that returns a double

}