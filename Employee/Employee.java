package Employee;
import  Date.Date;
import java.util.Scanner;
public class Employee {
	
	
	Scanner sc=new Scanner(System.in);
	private int id;
	private String name;
	Date d1;
	
	public Employee() {
		 id=0;
		 name=null;
		 d1=new Date(0,0,0);
	}
	
	public Employee(int id,String name,Date d1){
		this.id=id;
		this.name=name;
		this.d1=d1;
		
	}
	/*public void acceptEmployee(int eid,String na,Date dob) {
		id=eid;
		name=na;
		
		//.acceptDate( d,m, y);
		d1=dob;
		
	}*/
	public void displayEmployee() {
		System.out.println("Employee info is: Employee id is "+id+"\nName : "+name+"\nDate of Birth: ");
		d1.displayDate();
	}
	
	

}

