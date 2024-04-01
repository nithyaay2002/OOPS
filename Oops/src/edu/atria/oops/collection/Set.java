package edu.atria.oops.collection;

import java.util.HashSet;

public class Set {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set set=new HashSet();
		//HashSet which gives the output in non order
		
		//if we use Linked Hashset it give ordered output
		set.add(5);
		set.add("atria");
		set.add(true);
		set.add(56.7);
		set.add(5);
		System.out.println("The elements in the set are"+set);
		
		

	}

}
