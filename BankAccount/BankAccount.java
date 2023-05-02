package BankAccount;

public class BankAccount {
	private int accId;
	private String name,city,email;
	private double balance;
	public BankAccount(int accId, String name, String city, String email, double balance) {
		
		this.accId = accId;
		this.name = name;
		this.city = city;
		this.email = email;
		this.balance = balance;
	}
	
	public int getAccId() {
		return accId;
	}
	public void setAccId(int accId) {
		this.accId = accId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public double getBalance() {
		return balance;
	}
	
	public void displayDetails() {
		
		System.out.println("Account Holder's Details are : \nName: "+name+"\nCity: "+city+"\nEmail: "+email+"\n Balance: "+balance);
	}
	
	public void deposite(double amount) {
		this.balance+=amount;
		System.out.println("Rs."+amount+" are credited to your account. Your balaance is Rs. "+balance);
	}
	
	public void withdraw(double amount) {
		if(amount<this.balance) {
			this.balance-=amount;
			System.out.println("Rs."+amount+" are debited from your account. Your balaance is Rs. "+balance);
		}
	}
	
	public void moneyTranfer(BankAccount reciever,double amount) {
		
		this.balance-=amount;
		reciever.balance+=amount;
		System.out.println("Rs. "+amount+" id tranfered to "+reciever.name+" from your account");
	}
	
	
	

}

