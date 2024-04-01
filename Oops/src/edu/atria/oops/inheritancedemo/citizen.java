package edu.atria.oops.inheritancedemo;

public class citizen {
	private long aadharNo;
	private String nationality;
	private String address;
	private String dob;
	private char age;
	public citizen(long aadharNo, String nationality, String address, String dob, char age) {
		super();
		this.aadharNo = aadharNo;
		this.nationality = nationality;
		this.address = address;
		this.dob = dob;
		this.age = age;
	}
	public long getAadharNo() {
		return aadharNo;
	}
	public void setAadharNo(long aadharNo) {
		this.aadharNo = aadharNo;
	}
	public String getNationality() {
		return nationality;
	}
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public char getAge() {
		return age;
	}
	public void setAge(char age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "citizen [aadharNo=" + aadharNo + ", nationality=" + nationality + ", address=" + address + ", dob="
				+ dob + ", age=" + age + "]";
	}
	
	
	

}
