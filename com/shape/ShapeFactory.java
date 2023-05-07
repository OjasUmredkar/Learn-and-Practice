package com.shape;

import java.util.Random;

public class ShapeFactory {
	public int gernerateShape() {

		Random r = new Random();
		int a = r.nextInt(3);
		
			return a;
		

	}

}
