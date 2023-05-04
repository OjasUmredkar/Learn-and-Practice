package com.app.fruits;

public class Orange extends Fruit {

	public Orange(String name, String colour, double weight, boolean fresh) {
		super(name, colour, weight, fresh);
		
	}

	@Override
	public String Taste() {
		
		return "Sour" ;
	}

	@Override
	public String toString() {
		
		return super.toString();
	}

	
	public void juice() {
		System.out.println("Name: "+super.name+" \nWeight: "+super.weight+" gms");
		System.out.println("Extracting Juice");
	}
	

}
