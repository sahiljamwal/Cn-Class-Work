package com.sahil.Implementation_MinPriorityQueue;

public class PQ_Runner {

	public static void main(String[] args) throws EmptyPriorityQueue_Exception {
		
		Priority_Queue pq=new Priority_Queue();
		int arr[]={5,2,9,7,1};
		
		for(int i=0;i<arr.length;i++)
		{
			pq.insert(arr[i]);
		}
		
		while(!pq.isEmpty())
		{
			System.out.print(pq.remove()+" ");
		}
		System.out.println();
	}
	
}
