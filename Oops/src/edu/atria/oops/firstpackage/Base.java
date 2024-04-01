package edu.atria.oops.firstpackage;

public class Base {
	/* Declaring default,private,public,protected variables*
	 * 
	 */
int varDefault=10;
public int varPublic=20;
private int varPrivate=30;
protected int varProtected=40;

/*Declaring methods with public,private,protected types
 * 
 */
public int getVarProtected() {
	return varProtected;
}

void methodDefault()
{
	System.out.println("Default access for base class");
	System.out.println("Default variable"+varDefault);
}
}