package com.app.org;

import java.util.Scanner;

public class TestOrganization {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number of employees you want to add: ");
		int numEmp = s.nextInt();
		Emp[] e = new Emp[numEmp];
		int index = 0, choice = 0;

		System.out.println("1. To add Manager\n" + "2. To add Worker\n" + "3. To Display Employees\n"
				+ "4. To Update Basic salary\n" + "5. To Exit");
		do {
			System.out.println("Enter the choice: ");
			choice = s.nextInt();

			switch (choice) {
			case 1:
				if (index < numEmp) {
					System.out.println(
							"Adding Manager \nEnter Employee First name,Last Name, DeptID, Basic Salary, Performance Bonus");

					Mgr m = new Mgr(s.next(), s.next(), s.next(), s.nextDouble(), s.nextDouble());
					e[index] = m;
					System.out.println("Employee ID is:" + e[index].getEmpid());
					index++;
				} else {
					System.out.println("Array is full");
				}
				break;

			case 2:
				if (index < numEmp) {
					System.out.println(
							"Adding Worker \nEnter Employee First name,Last Name, DeptID, Basic Salary, Hourly Rate, Hours Worked");

					Worker w = new Worker(s.next(), s.next(), s.next(), s.nextDouble(), s.nextDouble(), s.nextInt());
					e[index] = w;

					System.out.println("Employee ID is:" + e[index].getEmpid());
					index++;
				} else {
					System.out.println("Array is full");
				}
				break;

			case 3:
				System.out.println("All Employees are: ");
				for (Emp emp : e) {
					if (e != null) {

						System.out.println(emp + " Net salary: Rs "+emp.computeNetSalary());
						System.out.println();
					}
				}
				break;

			case 4:
				System.out.println("Enter the Employee ID");
				int empidsearch = s.nextInt();

				for (Emp emp : e) {
					if (e != null) {
						if (empidsearch == emp.getEmpid()) {

							System.out.println("Enter the amount of increament:");
							double amt = s.nextDouble();
							emp.increamentBasic(amt);
							System.out.println( " Incremented basic salary is: Rs. "+ emp.getBasic());
						}
					}

				}
				break;

			case 5:
				System.out.println("Exiting.....");
				break;

			default:
				System.out.println("Enter the valid input");
			}
		} while (choice != 5);
	}

}
