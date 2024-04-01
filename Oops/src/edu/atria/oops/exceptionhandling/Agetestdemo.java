package edu.atria.oops.exceptionhandling;

import java.util.Scanner;

public class Agetestdemo {
	static void validate(int age) throws invalidageexception
	{
		if(age<18)
		{
			throw new invalidageexception("Invalid age!,you are not eligible to vote");
		}
		else
		{
			System.out.println("you are eligible to vote");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int age;
Scanner sc=new Scanner(System.in);
System.out.println("Enter your age");
age=sc.nextInt();
try
{
	validate(age);
}
catch(invalidageexception i)
{
	System.out.println("exception caught ....."+i.getMessage());
}
sc.close();
	}

}
