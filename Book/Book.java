package Book;

public class Book {
	
	private String name,author;
	private int id;
	private double price;
	
	
	
	public Book() {
		
		name = null;
		author = null;
		id = 0;
		price =0;
		
	}
	
	
		public Book(String name, String author, int id, double price) {
		
		this.name = name;
		this.author = author;
		this.id = id;
		this.price = price;
	}


	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	public void bookDisplay() {
			System.out.println("Book details are \nBookb name: "+name+"\nAuthors: "+author+"\nBook Id : "+id+"\nPrice:  Rs. "+price);
	}
	

}
