package com.sahil.Implementation_MinPriorityQueue;

import java.util.ArrayList;

public class Priority_Queue {

	private ArrayList<Integer> heap;
	
	public Priority_Queue()
	{
		heap=new ArrayList<>();
		
	}
	
	public boolean  isEmpty()
	{
		if(heap.size()==0)
			return true;
		else 
			return false;
		
	}
	
	public int getSize()
	{
		return heap.size();
	}

	public int getMin() throws EmptyPriorityQueue_Exception
	{
		if(heap.size()==0)
			throw new EmptyPriorityQueue_Exception();
		else
			return heap.get(0);
	}

	public void insert(int element)
	{
		heap.add(element);
		int childIndex=heap.size()-1;
		int parentIndex=(childIndex-1)/2;
		
		while(childIndex>0)
		{
			if(heap.get(childIndex)<heap.get(parentIndex))
			{
				int temp=heap.get(childIndex);
				heap.set(childIndex, heap.get(parentIndex));
				heap.set(parentIndex,temp);
				childIndex=parentIndex;
				parentIndex=(childIndex-1)/2;
			}
			else
			{
				return;
			}
		}
	}

	public int remove() throws EmptyPriorityQueue_Exception
	{
		
		if(heap.size()==0)
            throw new EmptyPriorityQueue_Exception();
        
        
		int elementRemoved=heap.get(0);
		heap.set(0,heap.get(heap.size()-1));
		heap.remove(heap.size()-1);
		
		int index=0;
		int minIndex=index;
		int leftChildIndex=2*minIndex+1;
		int rightChildIndex=2*minIndex+2;
		
		while(leftChildIndex<heap.size())
		{
			if(heap.get(minIndex)>heap.get(leftChildIndex))
				minIndex=leftChildIndex;
			if((rightChildIndex<heap.size())&&(heap.get(minIndex)>heap.get(rightChildIndex)))
				minIndex=rightChildIndex;
			
			if(minIndex==index)
				break;
			else
			{
				int temp=heap.get(index);
				heap.set(index, heap.get(minIndex));
				heap.set(minIndex, temp);
				
                index=minIndex;
				leftChildIndex=2*index+1;
			    rightChildIndex=2*index+2;
			}
		}
		return elementRemoved;
	}
}
