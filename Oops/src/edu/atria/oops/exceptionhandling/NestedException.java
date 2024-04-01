package edu.atria.oops.exceptionhandling;

public class NestedException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			int a=5/1;
			System.out.println(a);
			try {
				int arr[ ]= {2};
				arr[10]=23;
			}
		
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("ohh....."+e);
			
		}

	}
	catch(Exception e)
	{
		System.out.println("handling the exception");
	}
}
}
