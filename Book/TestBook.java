package Book;
import java.util.Scanner;
public class TestBook {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		Book b=new Book();
		System.out.println("Enter the Book Datails: Name,Author Name,Id,Price");
		Book b1 = new Book(s.next(),s.next(),s.nextInt(),s.nextDouble());
		
		b1.bookDisplay();
		
		System.out.println();
		System.out.println("Change the book name: ");
		b1.setName(s.next());
		System.out.println("Changed book name is: "+b1.getName());
		
		
		System.out.println("Change the Author name: ");
		b1.setAuthor(s.next());
		System.out.println("Changed author name is: "+b1.getAuthor());
		
		
		System.out.println("Change the book ID: ");
		b1.setId(s.nextInt());
		System.out.println("Changed book name is: "+b1.getId());
		
		
		System.out.println("Change the Price: ");
		b1.setPrice(s.nextDouble());
		System.out.println("Changed name is: Rs. "+	b1.getPrice());
		System.out.println();
		
		b1.bookDisplay();
		
		
		
		
		
		
	}

}
