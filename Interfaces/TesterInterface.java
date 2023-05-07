package Interfaces;

public class TesterInterface {
	public static void display(Printable pr) {
		
		pr.print();
	}

	public static void main(String[] args) {
		
		Date d = new Date();
		Shape sh=new Shape();
		Emp e= new Emp("Rahul", "Sharma", "rahul123", 500000);
		
		d.print();
		sh.print();
		e.print();
		System.out.println("----------------");
		display(d);
		display(sh);
		display(e);
	}

}
