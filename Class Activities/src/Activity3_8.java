import java.util.Scanner;
public class Activity3_8 {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
   System.out.println("Please enter a set of x and y coordinates and see if your coordinate is in the rectangle");
   System.out.println("Enter the x coordinate of your coordinate set:");
   int x = input.nextInt();
   System.out.println("Enter the y coordinate of your coordinate set:");
   int y = input.nextInt();
 
 if (x<-5 || x>5)
	 System.out.println("The point " + x + "," + y + " is not in the rectangle");

 else if (y<-3 || y>3)
	 System.out.println("The point " + x + "," + y + " is not in the rectangle");
 else
	 System.out.println("The point " + x + "," + y + " is  in the rectangle");

    }
}