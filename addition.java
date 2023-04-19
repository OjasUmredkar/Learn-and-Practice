package gitprac;

import java.util.Scanner;
class Addition{
	public static void main(String[] args){
		int a,b,c;
		Scanner s= new Scanner(System.in);
		
		System.out.println("Enter the 1st number");
		a=s.nextInt();
		System.out.println("Enter the 2nd number");
		b=s.nextInt();
		
		c=a+b;
		System.out.println("Addition of two numbers is "+c);
	}
}


