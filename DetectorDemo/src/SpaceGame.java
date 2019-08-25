import java.util.Scanner;
public class SpaceGame {
	public static void main(String arg[]) {
		Detector detector = new Detector("Space Game", 500, 500);
		 while (1 > 0) {
		UserShape spaceShip = new UserShape(Detector.TRIANGLE, 250, 250, 50, 50); 
		 detector.addShape(spaceShip);
		
		 
		 int randomX = ( (int)(Math.random( )*501) -1);
		 int randomY = ( (int)(Math.random( )*501) -1);
		 UserShape point = new UserShape(Detector.CIRCLE, randomX, randomY, 20, 20);
		 detector.addShape(point);
		 int moveX = 250-randomX;
		 int moveY = 250-randomY;
		
		while (detector.getLocationX(spaceShip) != randomX) {
		 if (moveX < 0)
			 detector.moveRight(1, 3, spaceShip);
			 else
				 detector.moveLeft(1, 3, spaceShip);
		}
		 
		while (detector.getLocationX(spaceShip) != randomX) {
		if (moveY < 0)
			 detector.moveDown(1, 3, spaceShip);
			 else
				 detector.moveUp(1, 3, spaceShip);
		 
		 }
		 
		 }
	}
}
