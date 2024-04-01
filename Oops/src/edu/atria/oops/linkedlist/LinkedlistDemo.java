package edu.atria.oops.linkedlist;

class Linkedlistdemo
{
	Node head,tail;
	
	public void insert(int data)
	{
		Node n=new Node(data);
		n.next=null;
	
	if(head==null)
	{
		head=n;
		tail=n;
}
	else
	{
		tail.next=n;
		tail=n;
	}
	}
	public void display()
	{
		Node temp=head;
		while(temp!=null)
		{
			System.out.println(temp.data);
			temp=temp.next;
		}
		
	}
}