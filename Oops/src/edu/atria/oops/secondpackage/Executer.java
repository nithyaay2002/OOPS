package edu.atria.oops.secondpackage;

import edu.atria.oops.firstpackage.Base;

public class Executer extends Base {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Base bone=new Base();
        //System.out.println(bone.varPrivate);private members not visible outside class or package only visible within the class
		//System.out.println(bone.varDefault); Default members not visible outside package
		//System.out.println(bone.varPublic);
		Executer ex = new Executer();
		//protected members are accessible outside the package by extending the base class
		System.out.println(ex.varProtected);
		
		//public is accessible everywhere
		System.out.println(ex.varPublic);
	}

}
