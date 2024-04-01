package edu.atria.oops.Queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Queue<Integer> que=new LinkedList();
         que.add(3);
         que.offer(4);
         que.add(2);
         que.offer(1);
         System.out.println("que content:"+que);
         
         //que.clear(); (throws an exception because when queue empty it show a exception
         System.out.println("que content:"+que.remove());
         System.out.println("que content:"+que.remove(2));
         System.out.println("que content:"+que);
         
         que.clear();
         
         //Remove head of the queue  and return updated queue
         System.out.println("que content(using peek) is:"+que.peek());
         System.out.println("que  updated content is:"+que);
         
         //remove head of the queue and return empty
         System.out.println("que content(using poll) is:"+que.poll());
         System.out.println("que  updated content is:"+que);
         
         que.clear();
         System.out.println("que content:"+que);
         
	}

}
