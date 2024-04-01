package edu.atria.oops.exceptionhandling;

public class Final {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try
{
	int a=5/0;
	System.out.println(a);
}
catch(Exception e)
{
	System.out.println("Exception......>"+e);
}
finally
{
	System.out.println("hello");
}
	}

}
