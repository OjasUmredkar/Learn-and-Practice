package Interfaces;

public class Shape implements Printable{
	protected int x=0,y=0;
	
	

	@Override
	public String toString() {
		return "Shape [x=" + x + ", y=" + y + "]";
	}

	@Override
	public void print() {
		System.out.println("Inside Shape class which implements interface Printable");
		
	}
	
	
	
}
