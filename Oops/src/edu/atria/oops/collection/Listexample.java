package edu.atria.oops.collection;
import java.util.ArrayList;
import java.util.List;


public class Listexample {

	public static void main(String[] args) {
		// can't instantiate the list
		//List list=new list();
		//List<String> list=new ArrayList();
		List list=new ArrayList();
		
         list.add(0,1);
         list.add(1,"rahul");
         list.add(2,'H');
         list.add(3,30.0f);
         list.add(4,944875388);
         System.out.println(list);
         System.out.println("element of first index: " +list.get(1));
         //System.out.println("element of seventh index: " +list.get(7)); Exception
         System.out.println(list.contains('H'));
         System.out.println(list.size());
         list.add(5,"rahul");
         list.add(6,null);
         System.out.println(list);
         list.clear();
         System.out.println(list);
	}

}
