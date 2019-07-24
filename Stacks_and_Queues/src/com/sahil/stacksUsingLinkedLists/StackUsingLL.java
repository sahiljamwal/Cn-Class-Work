package com.sahil.stacksUsingLinkedLists;

import com.sahil.stacksUsingArrays.StackEmptyException;

public class StackUsingLL <T>{
	
	private int size=0;
	private Node<T> head;
	private Node<T> tail;
	
	public StackUsingLL() {
					
		size=0;
		head=null;
		tail=null;
	}
	
	public int size() {

		return size;
	}
	
	public void push(T data) {
		
		Node<T> item=new Node<T>(data);
		if(head==null)
		{
			item.next=null;
			head=item;
			tail=item;
		}
		else
		{
			item.next=head;
			tail=item;
			head=item;
		}	
		size++;
	}
	
	public boolean isEmpty() {
		if(head==null)
			return true;
		else 
			return false; 

	}
	
	public T pop() throws StackEmptyException {
		
		Node<T> temp=tail;
		
		if (head==null)
		{
			StackEmptyException e=new StackEmptyException();
			throw e;
		}
		else
		{
			head=tail.next;
			tail=head;
			
			size--;
		}
		
		return temp.data;
		
	}
	
	public T top() throws StackEmptyException {

		if(tail==null)
		{
			StackEmptyException e=new StackEmptyException();
			throw e;
		}
		else
		{
			return tail.data;
		}
	}
}
