package com.ey.emp;

public class Clerk extends Employee {
	private double commission;

	public Clerk() {
		super();
			}

	public Clerk(String empName, double salary, double commission) {
		super(empName, salary);
		this.commission = commission;
		
	}

	@Override
	public void payslip() {
		
		super.payslip();
		System.out.println("Commission is: "+commission);
	}

	@Override
	public double getSalary() {
		// TODO Auto-generated method stub
		return super.getSalary()+commission;
	}
	
	

}
