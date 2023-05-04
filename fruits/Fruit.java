package com.app.fruits;

public class Fruit {
	protected String name, colour;
	protected double weight;
	protected boolean fresh;
	public Fruit(String name, String colour, double weight, boolean fresh) {
	
		this.name = name;
		this.colour = colour;
		this.weight = weight;
		this.fresh = fresh;
	}
	
	
	public String Taste() {
		return " no specific taste";
		
		
	}


	@Override
	public String toString() {
		
		return "Fruit [name=" + name + ", colour=" + colour + ", weight=" + weight + " gms, fresh=" + fresh + " Taste= "+Taste()+"]";
	}


	

	public String getName() {
		// TODO Auto-generated method stub
		return this.name;
	}


	


	public void setFresh(boolean fresh) {
		// TODO Auto-generated method stub
		this.fresh=fresh;
	}
	
	
	

}
