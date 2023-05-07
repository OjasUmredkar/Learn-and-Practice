package com.shape;

public abstract class Shape {
	protected int x=0,y=0;
	
	public abstract double area();

	@Override
	public String toString() {
		return "Shape [x=" + x + ", y=" + y + "]";
	}
	
	
	
}
