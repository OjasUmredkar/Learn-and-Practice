package com.app.fruits;

public class Mango extends Fruit{

	public Mango(String name, String colour, double weight, boolean fresh) {
		super(name, colour, weight, fresh);
		
	}

	@Override
	public String Taste() {
		
		return "Sweet";
	}

	@Override
	public String toString() {
		
		return super.toString();
	}
	
	public void pulp() {
		System.out.println("Name: "+super.name+" \nColor: "+super.colour);
		System.out.println("Creating pulp");
	}
	

}


