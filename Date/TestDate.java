package Date;
import java.util.Scanner;
public class TestDate {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		Date d=new Date();
		
		
		System.out.println("Enter the dates");
		Date d1=new Date(s.nextInt(),s.nextInt(),s.nextInt()); 
		
		System.out.println("The date is: ");
		d1.displayDate();

	}

}
