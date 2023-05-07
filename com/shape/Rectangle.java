package com.shape;

public class Rectangle extends Shape{
	private int w,h;
	
	public Rectangle(int w, int h) {
		super();
		this.w = w;
		this.h = h;
	}

	

	@Override
	public double area() {
		double area=w*h;
		return area;
	}

	@Override
	public String toString() {
		return super.toString()+ " Rectangle [w=" + w + ", h=" + h + ", area of rectangle is: " + area() + "]";
	}
	
	
	
	
	
}
