package com.sahil.practise.Max_Priority_Queue;

import java.util.ArrayList;


public class PriorityQueue {

	ArrayList<Integer> heap;
	
	public PriorityQueue()
	{
		heap=new ArrayList<>();
	}
	
	public void insert(int element) {
		
		heap.add(element);
		
		int childIndex=heap.size()-1;
		int parentIndex=(childIndex-1)/2;
		
		while(childIndex>0)
		{
			if(heap.get(parentIndex)<heap.get(childIndex))
			{
				int temp=heap.get(parentIndex);
				heap.set(parentIndex, heap.get(childIndex));
				heap.set(childIndex, temp);
				childIndex=parentIndex;
				parentIndex=(childIndex-1)/2;
			}
			else
			{
				return;
			}
		}
		
		
		
	}
	

	public int getMax() {
		if(heap.size()==0)
			return Integer.MIN_VALUE;
		else
		{
			return heap.get(0);
		}
	}

	public int  removeMax() {
		
		if(heap.size()==0)
			return Integer.MIN_VALUE;
		else
		{
			int elementTemoved=heap.get(0);
			heap.set(0, heap.get(heap.size()-1));
			heap.remove(heap.size()-1);
			
			int index=0;
			int minIndex=index;
			int leftChidIndex=2*index+1;
			int rightChildIdex=2*index+2;
			
			while(leftChidIndex<heap.size())
			{
				if(heap.get(leftChidIndex)>heap.get(minIndex))
					minIndex=leftChidIndex;
				if( (rightChildIdex<heap.size()) && (heap.get(rightChildIdex)>heap.get(minIndex)) )
					minIndex=rightChildIdex;
				
				if(minIndex==index)
					break;
				else
				{
					int temp=heap.get(index);
					heap.set(index, heap.get(minIndex));
					heap.set(minIndex, temp);
					
					index=minIndex;
					leftChidIndex=2*index+1;
					rightChildIdex=2*index+2;
							
				}
					
			}
			
			return elementTemoved;
			
		}
		
	}

	public int getSize() {
		
		return heap.size();
	}

	public boolean isEmpty() {
	
		if(heap.size()==0)
			return true;
		else
			return false;
	
	}
	
}
