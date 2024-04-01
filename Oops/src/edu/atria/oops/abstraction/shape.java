package edu.atria.oops.abstraction;

public abstract class shape {
 //static float area;
	 float area;
 public  abstract float CalculateArea();
 //Non abstract class
 /*public  static void display()
 {
	 System.out.println("Area of the shape"+area);
 }*/
/*1.Abstract class can be  both abstract and non abstract method
 2.If there is atleast one abstract method with in class then the class should be an abstract class
 3.an abstract class can have static method 
 4.subclass which extends abstract base class should implement the abstract method*/
 public void display()
 {
	 System.out.println("Area of the shape"+area);	 
 }
}
