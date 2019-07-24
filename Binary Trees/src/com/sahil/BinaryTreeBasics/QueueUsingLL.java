package com.sahil.BinaryTreeBasics;


public class QueueUsingLL <T>{
	
	Node<T> front;
	Node<T> rear;
	int size;
	
	public QueueUsingLL()
	{
		front=null;
		rear=null;
		size=0;
		
	}
	
	public void enqueue(T data) {

		Node<T> item=new Node<T>(data);
		item.next=null;
		
		if(size==0)
		{
			front=item;
			rear=item;
			
		}
		else
		{
			rear.next=item;
			rear=item;
			
		}
		size++;
	}

	public int size() {
		
		return size;
		

	}

	public boolean isEmpty() {
		
		if(size==0)
			return true;
		else
			return false;
		

	}

	public T dequeue() throws QueueEmptyException {
		
		Node<T> temp=front;
		
		if(size==0)
		{
			throw new QueueEmptyException();
		}
		else
		{
			front=front.next;
			size--;
		}
		return temp.data;
	}

	public T front() throws QueueEmptyException {

		if(size==0)
		{
			throw new QueueEmptyException();
		}
		
		return front.data;
	}

}
