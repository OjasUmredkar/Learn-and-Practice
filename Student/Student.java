package Student;

public class Student {
	private static int no;
	private String name,address;
	private int rollno;
	static
	{
		 no=0;
	}

	public Student(String name, String address) {
		
		this.name = name;
		this.address = address;
		
		no++;
		rollno=no;
	}
	public int getRollno() {
		return this.rollno;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public static int getNo() {
		return no;
	}
	
	public void displayStudent() {
		System.out.println("Details of Roll no : "+rollno +" are");
		System.out.println("Name: "+this.name+"\nAddress: "+this.address);
	}
	
	
	
	
}
