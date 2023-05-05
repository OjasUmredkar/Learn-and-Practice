package com.app.org;

public class Worker extends Emp{
	private double hourlyRate;
	private int hoursWorked;
	public Worker(String firstName, String lastName, String deptid, double basic, double hourlyRate, int hoursWorked) {
		super(firstName, lastName, deptid, basic);
		this.hourlyRate = hourlyRate;
		this.hoursWorked = hoursWorked;
	}
	
	@Override
	public String toString() {
		return "Employee ID : "+super.empid+" Name: "+super.firstName+" "+super.lastName+" DeptId: "+super.deptid+" Basic Salary: Rs. "+super.basic+" Hourly Rate: Rs. " +this.hourlyRate;
	}
	
	@Override
	public double computeNetSalary() {
		double netSalary=super.basic+((double)hoursWorked*hourlyRate);
		return netSalary;
	}

	public double getHourlyRate() {
		return hourlyRate;
	}

	
	
	
	
	
	
}
