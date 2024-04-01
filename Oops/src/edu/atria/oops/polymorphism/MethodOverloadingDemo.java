package edu.atria.oops.polymorphism;

public class MethodOverloadingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("-----MethodOverloading-----");
System.out.println("Addition of two integers:"+MethodOverloading.addition(20,30));
System.out.println("Addition of two float:"+MethodOverloading.addition(20.5f,30.0f));
System.out.println("Addition of two numbers:"+MethodOverloading.addition(20,30.0f));
System.out.println("Addition of two numbers:"+MethodOverloading.addition(20.0f,30));
System.out.println("Addition of two String:"+MethodOverloading.addition("nithya","CSE"));

	}

}
