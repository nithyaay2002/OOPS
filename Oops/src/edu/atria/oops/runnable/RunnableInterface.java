package edu.atria.oops.runnable;


public class RunnableInterface {

	public static void main(String[] args) {
		Hii obj=new Hii();
		Hello obj1=new Hello();
		obj.start();]
				Thread t1=new Thread(obj);
				t1.setPriority(Thread.MAX_PRIORITY);
				System.out.println(t1.getPriority());
		try
		{
			Thread.sleep(200);
		}
		catch(Exception e) {
			
		}
		obj1.start();

	}
}