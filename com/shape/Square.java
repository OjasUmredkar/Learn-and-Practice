package com.shape;

public class Square extends Shape{
	private int side;
	
	public Square(int side) {
		super();
		this.side = side;
	}

	@Override
	public double area() {
		double area=side*side;
		return area;
	}

	@Override
	public String toString() {
		return super.toString()+" Square [side=" + side + ", area of square is:" + area() + "]";
	}
	
	
	
	
	
}
