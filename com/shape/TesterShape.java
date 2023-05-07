package com.shape;

import java.util.Scanner;

public class TesterShape {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		ShapeFactory sf = new ShapeFactory();
		
		
		
		for (int i=0;i<5;i++ ) {
			int shape = sf.gernerateShape();
			switch (shape) {
			case 0:
				
				System.out.println("Enter the Radius of circle: ");
				Circle c  = new Circle(s.nextInt());
				
				
				System.out.println(c);
				break;

			case 1:
				System.out.println("Enter the length and breadth of Rectangle: ");
				Rectangle r = new Rectangle(s.nextInt(), s.nextInt());
				System.out.println(r);
				break;

			case 2:
				System.out.println("Enter the side of Square: ");
				Square sq = new Square(s.nextInt());
				System.out.println(sq);
				break;

			}
			
			
		}
		System.out.println("\n\n-------End------");

	}

}
