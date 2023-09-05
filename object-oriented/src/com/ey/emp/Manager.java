package com.ey.emp;

public class Manager extends Employee {
	

		 

	    private double incentives;

	 

	    public Manager() {

	        //Optional: By default a child class calls the default constructor of parent.

	        super();

	    }

	 

	    public Manager(String empName, double salary,double incentives) {

	        // Constructor chaining: Calling constructor of parent class with matching signature

	        super(empName, salary);

	        this.incentives = incentives;//point out the object

	    }



		@Override
		public void payslip() {
			// TODO Auto-generated method stub
			super.payslip(); //calling payslip of  superclass

	        System.out.println("Incentives: "+ incentives);
			//super.payslip();
		}



		@Override
		public double getSalary() {
			// TODO Auto-generated method stub{

	        return super.getSalary()+incentives;

	    }
			//return super.getSalary();
		}

	 

	   
	    

	    

	    

	    

	    



