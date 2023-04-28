package Date;
public class Date {
		
	
	private int day ,month,year;
	
	public Date(){
		day=0;
		month=0;
		year=0;
		
	}
	
	public Date(int day,int month,int year) {
		this.day=day;
		this.month=month;
		this.year=year;
		
	}
	
	
	public void displayDate() {
		
		System.out.println(day+"/"+month+"/"+year);
	}
}


