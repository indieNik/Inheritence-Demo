package com.psl.employee;

public class InheritanceDemo {

	public static void main(String[] args) {

		/*Employee e = new Employee();
		e.displayEmployee();*/
		
		Developer d = new Developer(80000, "Nik", 10, 10, 10);
		
		d.displayEmployee();
		d.calculateSalary();
		
	}
}
