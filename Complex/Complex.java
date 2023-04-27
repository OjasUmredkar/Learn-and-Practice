package Complex;

public class Complex {
	
	private int real,img;

   public Complex() {
		
		real=0;
		img = 0;
	}
	
	public Complex(int real, int img) {
		
		this.real = real;
		this.img = img;
	}

	public int getReal() {
		return real;
	}

	public void setReal(int real) {
		this.real = real;
	}

	public int getImg() {
		return img;
	}

	public void setImg(int img) {
		this.img = img;
	}
	
	public void displayComplex() {
		System.out.println("Complex number is: "+real+"+"+img+"i");
	}
	
}
