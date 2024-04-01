package edu.atria.oops.linkedlist;
import java.util.Vector;


public class Vectordemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Vector<Integer> number=new Vector<>();
        number.add(10);
        number.add(20);
        number.add(30);
        number.add(40);
        number.add(50);
        //calculate the size
        System.out.println("The size of the vector:"+number.size());
        
        //print the size
        System.out.println("the numbers are:"+number);
        
        //for each loop
        for(Integer value:number)
        {
        	System.out.println(value);
        }
        
        
        number.add(2,80);
        
        }

}
