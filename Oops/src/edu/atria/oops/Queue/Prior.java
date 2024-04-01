package edu.atria.oops.Queue;
import java.util.PriorityQueue;
public class Prior {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue<Integer> que1=new PriorityQueue<>();
        que1.add(3);
        que1.offer(4);
        que1.add(2);
        que1.offer(1);
        System.out.println("que content:"+que1);
	}

}
