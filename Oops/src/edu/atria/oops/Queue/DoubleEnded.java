package edu.atria.oops.Queue;

import java.util.Deque;
import java.util.LinkedList;

public class DoubleEnded {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Deque<Integer> que1=new LinkedList<>();
        que1.add(3);
        que1.offer(4);
        que1.add(2);
        que1.offer(1);
        
        que1.addFirst(10);
        que1.addLast(20);
        System.out.println("que content:"+que1);
        System.out.println("que content(get First) is:"+que1.getFirst());
        System.out.println("que content(get First) is:"+que1.getLast());
        
        System.out.println("que content(remove First) is:"+que1.removeFirst());
        
	}

}
