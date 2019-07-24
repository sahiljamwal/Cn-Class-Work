package com.sahil.stacksUsingArrays;

public class StacksUsingArray {
	
	private int data[];
	private int top=-1;
	
	
	public StacksUsingArray()
	{
		data=new int[10];
		top=-1;
	}
	
	public StacksUsingArray(int size)
	{
		data=new int[size];
		top=-1;
	}
	
	public void push(int item) throws StackFullException
	{
		if(size()==data.length)
		{
//			//throw some exception
//			StackFullException e=new StackFullException();
//			throw e;
			
			restructure();
			
			
		}
		
		top++;
		data[top]=item;
	}

	private void restructure() {
		
		int temp[]=data;
		data=new int[2*temp.length];
		for(int i=0;i<temp.length;i++)
		{
			data[i]=temp[i];
		}
		
	}

	public void pop() throws StackEmptyException
	{
		if(top==-1)
		{
			//throw some exception
			StackEmptyException e=new StackEmptyException();
			throw e;
		}
		top--;
	}
	

	public boolean isEmpty()
	{
		if(top==-1)
			return true;
		else 
			return false;
	}
	
	public int top()throws StackEmptyException

	{
		if(top==-1)
		{
			StackEmptyException e=new StackEmptyException();
			throw e;
		}
		return data[top];
	}

	public int size()
	{
		return top+1;
	}



}
