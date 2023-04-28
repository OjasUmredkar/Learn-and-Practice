package Employee;
import java.util.Scanner;
import Date.Date;
public class TestEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		Date d=new Date();
		Employee e = new Employee();
		System.out.println("Enter Employee id,Name and date of birth: day/month/year ");
		Employee e1 = new Employee(s.nextInt(), s.next(), new Date(s.nextInt(), s.nextInt(),s.nextInt()));
		
		
		
		
		
		e1.displayEmployee();
		
	}

}
