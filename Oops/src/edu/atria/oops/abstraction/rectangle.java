package edu.atria.oops.abstraction;

public class rectangle extends shape{
float length,breadth;


	public rectangle(float length, float breadth) {
	super();
	this.length = length;
	this.breadth = breadth;
}


	@Override
	public float CalculateArea() {
		// TODO Auto-generated method stub
		return area=length*breadth;
	}

}
