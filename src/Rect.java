/* A simple program that checks if the given points are inside the provided rectangle object.
 Assignment 2, Question 2*/
import java.awt.Point;
import java.awt.Rectangle;

public class Rect {
	public static void main(String[] args) {
		Rectangle box = new Rectangle(5,5,67,7);
		Point p1 = new Point(1,1); //Given points
		Point p2 = new Point(7,7);
		
		if(box.contains(p1)) {
			System.out.println("The point p1 is inside the box");
		}
		else {
			System.out.println("The point p1 is outside the box");
		}
		
		if(box.contains(p2)) {
			System.out.print("The point p2 is inside the box");
		}
		else {
			System.out.print("The point p2 is outside the box");
		}
	}

}