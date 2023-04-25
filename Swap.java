import java.util.Scanner;
public class Swap {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("Enter first number");
		int a= s.nextInt();
		System.out.println("Enter second number");
		int b= s.nextInt();
		
		System.out.println("Values before swaping a="+a+" b="+b);
		int c =a;
		a = b; 
		b = c;
		
		System.out.println("Values after swaping a="+a+" b="+b);
	}

}
