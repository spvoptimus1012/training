package com.ey.emp;


public abstract class Employee {

 

    private int empNo;

    private String empName;

    private double salary;

    

    private static int counter;

    

    static { // Static initializer block - executes at the time of class loading

        System.out.println("Account class loaded...");

        counter=901;

    }

    {

        System.out.println("Employee object created");// It is ghost block calls before constructor.

    }

    

    public Employee() {

    

    }

 

    public Employee(String empName, double salary) {

        System.out.println("Emlpoyee constructor...");

        this.empNo = counter++;

        this.empName = empName;

        this.salary = salary;

    }

    

    public void payslip() {

        System.out.println("Emp No. "+ empNo);

        System.out.println("Emp Name: "+empName);

        System.out.println("Salary : "+salary);

    }

 

    public double getSalary() {

        return salary;

    }

 

    

}

 




 