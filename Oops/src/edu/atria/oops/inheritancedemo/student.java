package edu.atria.oops.inheritancedemo;

public class student extends citizen {
		// TODO Auto-generated constructor stub
	
private int id;
private String name;
private String department;
public student(long aadharNo, String nationality, String address, String dob, char age,int id,String name,String department) {
	super(aadharNo, nationality, address, dob, age);
this.id=id;
this.name=name;
this.department=department;
}
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
public String getDepartment() {
	return department;
}
public void setDepartment(String department) {
	this.department = department;
}
@Override
public String toString() {
	return "student [id=" + id + ", name=" + name + ", department=" + department + ", getAadharNo()=" + getAadharNo()
			+ ", getNationality()=" + getNationality() + ", getAddress()=" + getAddress() + ", getDob()=" + getDob()
			+ ", getAge()=" + getAge() + ", toString()=" + super.toString() + ", getClass()=" + getClass()
			+ ", hashCode()=" + hashCode() + "]";
}

}


