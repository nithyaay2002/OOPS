package edu.atria.oops.classandobject;

import java.util.Scanner;

public class EmployeeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enter the employee details.......");
	int id=sc.nextInt();
	String name=sc.next();
	float salary=sc.nextFloat();
	String department=sc.next();
	
	Employee eOne=new Employee();
	eOne.setId(id);
	eOne.setName(name);
	eOne.setSalary(salary);
	eOne.setDepartment(department);
	System.out.println(eOne);
	
	Employee eTwo=new Employee( id,name,salary, department);
	System.out.println(eTwo);
	}

}


