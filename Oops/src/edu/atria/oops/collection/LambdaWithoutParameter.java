package edu.atria.oops.collection;

public class LambdaWithoutParameter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Statement s =() ->{return "hello";};
	System.out.println(s.greet());
	Isodd odd =(a) -> a%2 ==0?true:false;
	System.out.println(odd.chechOdd(5));
	

	}

}
