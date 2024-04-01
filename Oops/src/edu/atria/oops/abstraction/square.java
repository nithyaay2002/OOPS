package edu.atria.oops.abstraction;

public class square extends shape {
float side;

	public square(float side) {
	super();
	this.side = side;
}

	@Override
	public float CalculateArea() {
		// TODO Auto-generated method stub
		
		return area=side*side;
	}

}
