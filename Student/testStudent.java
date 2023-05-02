package Student;

import java.util.Scanner;

public class testStudent {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		/*System.out.println("Enter the name and address of student 1: ");
		Student s1=new Student(s.next(),s.next());
		s1.displayStudent();
		System.out.println();
		
		System.out.println("Enter the name and adress of student 2: ");
		Student s2=new Student(s.next(),s.next());
		s2.displayStudent();
		System.out.println();
		
		System.out.println("Enter the name and adress of student 3: ");
		Student s3=new Student(s.next(),s.next());
		s3.displayStudent();
		System.out.println();
		
		System.out.println("Enter the name and adress of student 4: ");
		Student s4=new Student(s.next(),s.next());
		s4.displayStudent();
		System.out.println();
		
		System.out.println("Enter the name and adress of student 5: ");
		Student s5=new Student(s.next(),s.next());
		s5.displayStudent();*/
		
		
		Student[] st=new Student[5];
		
		for(int i=0;i<5;i++) {
			System.out.println("Enter the detials of student "+(i+1));
			st[i]=new Student(s.next(),s.next());
		}
		
		for(int i=0;i<5;i++) {
			System.out.println("Roll no: "+st[i].getRollno()+" Name: "+st[i].getName());
		}

	}

}
