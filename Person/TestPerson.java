package Person;
import java.util.Scanner;
public class TestPerson {

	public static void main(String[] args) {
		 Scanner s= new Scanner(System.in);
		 Person p = new Person();
		 
		 System.out.println("Enter name, city, age of a person");
		 Person p1 = new Person(s.next(),s.next(),s.nextInt());
		 
		 
		 p1.displayPerson();
		 System.out.println();
		 
		 System.out.println("Change the Name: ");
		 p1.setName(s.next());
		 System.out.println("Changed name is: "+p1.getName());
		 
		 System.out.println("Change the City: ");
		 p1.setCity(s.next());
		 System.out.println("Changed city is: "+ p1.getCity());
		 
		 System.out.println("Change the Age: ");
		 p1.setAge(s.nextInt());
		 System.out.println("Changed age of person is: "+p1.getAge());
		 
		 System.out.println();
		 System.out.println("Changed details are");
		 p1.displayPerson();
	}

}
