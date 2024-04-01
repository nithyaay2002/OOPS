package edu.atria.oops.firstpackage;

public class Executer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Base bone=new Base();
System.out.println(bone.varDefault);
//private members are not visible outside class
//System.out.println(bone.varPrivate);
System.out.println(bone.varProtected);
System.out.println(bone.varPublic);

	}

}
