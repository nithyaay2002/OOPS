package edu.atria.oops.exceptionhandling;

public class Throw {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			int a=5/0;
			System.out.println(a);
			throw new Exception();
		}
		catch(Exception e)
		{
			System.out.println("Exception......>"+e);
		}

	}

}
