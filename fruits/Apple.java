package com.app.fruits;

public class Apple extends Fruit {

	public Apple(String name, String colour, double weight, boolean fresh) {
		super(name, colour, weight, fresh);
		
	}

	@Override
	public String Taste() {
	    	return "Sweet and Sour";
	}

	@Override
	public String toString() {
	
		return super.toString();
	}
	
	public void jam() {
		System.out.println("Name: "+super.name);
		System.out.println("Making Jam");
	}


	
	
}
