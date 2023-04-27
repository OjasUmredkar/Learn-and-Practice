 package Complex;
import java.util.Scanner;
public class TestComplex {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		Complex c=new Complex();
		c.displayComplex();
		System.out.println("Enter the complex number: Real +(Imaginary)i");
		Complex c1=new Complex(s.nextInt(),s.nextInt());
		System.out.println();
		c1.displayComplex();
		System.out.println("Change the Real part of complex number");
		c1.setReal(s.nextInt());
		System.out.println("Changed real part is: "+c1.getReal());
		
		System.out.println("Change the Imaginary part of complex number");
		c1.setImg(s.nextInt());
		System.out.println("Changed imaginary part is: "+c1.getImg());
		System.out.println();
		System.out.print("New ");
		c1.displayComplex();
		
		
		
		}

}
