package edu.atria.oops.exceptionhandling;
//program to demonstrate custom exception
public class invalidageexception extends Exception{
public invalidageexception()
{
	super("Invalid age");
}
public invalidageexception(String message)
{
	super(message);
}
}
