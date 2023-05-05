package com.app.org;

public class Emp {
	private static int counterid;
	protected String firstName,lastName,deptid;
	protected double basic;
	protected int empid;
	
	static {
		counterid=100;
	}

	public Emp(String firstName, String lastName, String deptid, double basic) {
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.deptid = deptid;
		this.basic=basic;
		counterid++;
		this.empid=counterid;
	}
	
	

	@Override
	public String toString(){
		return "Employee ID : "+this.empid+" Name: "+this.firstName+" "+this.lastName+" DeptId: "+this.deptid+" Basic Salary: Rs."+this.basic;
	}
	
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	


	public double getBasic() {
		return basic;
	}



	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getDeptid() {
		return deptid;
	}

	public void setDeptid(String deptid) {
		this.deptid = deptid;
	}

	

	public  double computeNetSalary() {
		double netsalary=this.basic;
		return netsalary;
	}

	
	
	public int getEmpid() {
		return empid;
	}



	public void increamentBasic(double amt) {
		
		this.basic = this.basic+amt;
		
	}



	

	
	
	
	
	
	
	
}
