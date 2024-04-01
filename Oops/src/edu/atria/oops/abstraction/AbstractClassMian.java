package edu.atria.oops.abstraction;

public class AbstractClassMian {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*shape s=new shape();
 we cannot instantiated the abstract class
 */
		//Dynamic binding
		shape sone=new square(2.5f);
		sone.CalculateArea();
		sone.display();
		
		shape stwo=new rectangle(3,2);
		stwo.CalculateArea();
		stwo.display();
	}

}
