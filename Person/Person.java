package Person;
public class Person {
	
	
	private int age;
	private String name, city;
	
	public Person() {
		name =null;
		city = null;
		age = 0;
		
	}
	
	public Person(String name, String city ,int age) {
		this.name = name;
		this.city = city;
		this.age = age;
	}
	
	public void setName(String name) {
		this.name =name;
	
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setCity(String city) {
		this.city = city;
		
	}
	
	public String getCity() {
		return this.city;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public void displayPerson() {
		System.out.println("Name:"+name+" \nCity: "+city+" \nAge: "+age);
	}
	}


