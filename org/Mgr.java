package com.app.org;

public class Mgr extends Emp{
	
	private double perfbonus;

	public Mgr(String firstName, String lastName, String deptid, double basic, double perfbonus) {
		super(firstName, lastName, deptid, basic);
		this.perfbonus = perfbonus;
	}
	@Override
	public double computeNetSalary(){
		double netsalary =super.basic + perfbonus;
		return netsalary;
	}
	
	@Override
	public String toString() {
		return "Employee ID : "+super.empid+" Name: "+super.firstName+" "+super.lastName+" DeptId: "+super.deptid+" Basic Salary: Rs. "+this.basic;
	}
	
	public double getPerfbonus() {
		return perfbonus;
	}
	
	
	
	
	
	
	

}
