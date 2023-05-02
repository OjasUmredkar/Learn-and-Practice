package BankAccount;

import java.util.Scanner;

public class testBankAccount {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int choice=0;
		System.out.println("Enter details of account holder: Account id,Name,City,Email,Balance");
		BankAccount b= new BankAccount(s.nextInt(),s.next(),s.next(),s.next(),s.nextDouble());
		
		b.displayDetails();
		System.out.println("1.Check Balance \n2.To Deposite Amount \n3.To withdraw Amount \n4.To Transfer Money \n5.To exit");
		do {
			System.out.println("Enter your choice");
			choice=s.nextInt();
			 switch(choice) {
			 	case 1: 
			 		System.out.println(" Your Balance is : Rs"+b.getBalance()); 
			 		break;
			 	
			 	case 2: 
			 		System.out.println("Enter the amount you want to desposite:");
			 	    b.deposite(s.nextDouble());
			 	    break;
			 	
			 	case 3: 
			 		System.out.println("Enter the amount you want to withdraw: ");
			 		b.withdraw(s.nextDouble());
			 		break;
			 		
			 	case 4: 
			 		System.out.println("Enter the details of reciever:  Account id,Name,City,Email,Balance");
			 		BankAccount r =new BankAccount(s.nextInt(),s.next(),s.next(),s.next(),s.nextDouble());
			 		System.out.println("Enter the amount you want to transfer:");
			 		int amount =s.nextInt();
			 		b.moneyTranfer(r, amount);
			 		System.out.println("Your balance is: Rs. "+b.getBalance());
			 		break;
			 		
			 	case 5: 
			 		System.out.println("Exiting.....thankyou for using bank application ");
			 		break;
			 		
			 	default: 
			 		System.out.println("Enter the valid choice");
			 }
		}while(choice!=5);
	}

}


