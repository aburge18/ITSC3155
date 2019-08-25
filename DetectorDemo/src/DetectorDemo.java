import java.util.Scanner;
public class DetectorDemo {
	public static void main(String arg[]) {
		Scanner input = new Scanner(System.in);	
Detector detector = new Detector("Hello", 500, 500);
detector.addShape(1, 100, 100, 50, 50);
detector.addShape(0, 300, 100, 50, 50);
detector.addShape(2, 100, 250, 50, 50);
detector.addShape(3, 300, 250, 50, 50);
System.out.println("Remove shapes?");
input.next();
detector.removeAllShapes();
detector.addShape(1, 300, 250, 100, 100);
detector.addPoint(300,450);
detector.addPoint(300,450);
}
}