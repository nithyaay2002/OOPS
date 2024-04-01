package edu.atria.oops.classandobject;

public class Employee {
private int id;
private String name;
private float salary;
private String department;
 
public Employee()
{
	System.out.println("Default Constructor is called....");
	}

public Employee(int id,String name,float salary,String department)
{
	System.out.println("Parametrized constructor is called");
	this.id=id;
	this.name=name;
	this.salary=salary;
	this.department=department;
	
}
//getter and setter

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public float getSalary() {
	return salary;
}

public void setSalary(float salary) {
	this.salary = salary;
}

public String getDepartment() {
	return department;
}

public void setDepartment(String department) {
	this.department = department;
}

@Override
public String toString() {
	return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", department=" + department + "]";
}

}
