package com.psl.employee;

public class Developer extends Employee{
	
	int pf = 1000, ta = 0, hra = 0;
	
	public Developer(int salary, String name, int pf, int ta, int hra){
		super(salary, name);
		
		System.out.println("Dev Constr Called");
		
		this.pf = pf;
		this.ta = ta;
		this.hra = hra;
		
	}
	
	void calculateSalary(){
		int fsal = employeeSalary + pf + ta + hra;
		System.out.println("Salary : " + fsal);
	}

}
