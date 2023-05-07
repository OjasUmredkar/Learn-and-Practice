package com.shape;

public class Circle extends Shape{
	private int radius;
	
	public Circle(int radius) {
		
		this.radius = radius;
	}

	@Override
	public double area() {
		double area=3.14*radius*radius;
		return area;
	}

	@Override
	public String toString() {
		return super.toString()+" Circle [radius=" + radius + ", area of circle is:" + area() + "]";
	}
	
	
	
	

}
