package Point;
import java.util.Scanner;
public class TestPoint {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		Point p= new Point();
		p.displayPoint();
		
		System.out.println("Enter the X And Y coordinates: ");
		Point p1=new Point(s.nextInt(),s.nextInt());
		
		p1.displayPoint();
		
		System.out.println();
		System.out.println("Change x coordinate: ");
		p1.setX(s.nextInt());
		System.out.println("New x coordinate is x="+p1.getX());
		
		System.out.println("Change y coordinate: ");
		p1.setY(s.nextInt());
		System.out.println("New y coordinate is y="+p1.getY());
		System.out.println();
		System.out.print("New ");
		p1.displayPoint();
		
	}

}
