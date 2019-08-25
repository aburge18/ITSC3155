import java.util.Scanner;

import javax.print.DocFlavor.INPUT_STREAM;
public class DetectorDemo_ {
	public static void main(String arg[]) {
		Scanner input = new Scanner(System.in);
	System.out.println("Please enter the desired name of your window:");
	String name = input.next();
	System.out.println("Please enter the desired width of your window:");
	int width = input.nextInt();
	System.out.println("Please enter the desired heigh of your window:");
	int height = input.nextInt();
Detector detector = new Detector(name, width, height);
System.out.println("What shape would you like to add?(0 for triangle, 1 for square, 2 for rectangle ,3 for circle):");
int shape = input.nextInt();
System.out.println("What is the horizontal coordinate of where you would like your shape to be located?");
int locationx = input.nextInt();
System.out.println("What is the vertical coordinate of where you would like your shape to be located?");
int locationy = input.nextInt();
System.out.println("What is the horizontal value of your shape's size? (width):");
int sizex = input.nextInt();
System.out.println("What is the vertical value of your shape's size? (height):");
int sizey = input.nextInt();
detector.addShape(shape, locationx, locationy, sizex, sizey);
System.out.println("Would you like to add a point? (Y/N)");
String answer = input.next();
	if (answer.equals("Y")) {
		System.out.println("What is the desired horizontal coordinate for your point?");
	int xcoordinate = input.nextInt();
		System.out.println("What is the desired vertical coordinate for your point?");
	int ycoordinate = input.nextInt();
	detector.addPoint(xcoordinate,ycoordinate);
	System.out.println("The point is indeed within the boundaries of your shape.");
	detector.removeAllShapes();
	}
	else
		System.out.println("Thank you! Done :)");
}
}