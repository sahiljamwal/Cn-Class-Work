package com.sahil.InbuiltPriorityQueues;

import java.util.Comparator;
import java.util.PriorityQueue;


class MaxPQComparator implements Comparator<Integer>
{

	@Override
	public int compare(Integer o1, Integer o2) {
		if(o1<o2)
			return 1;
		else if(o1>o2)
			return -1;
		else
			return 0;
			
	}
	
}


public class IntegerPQ {

	
	
	public static void main(String[] args) {
		
		//MinPQ
		PriorityQueue<Integer> pq1=new PriorityQueue<>();
		int arr1[]={5,3,6,9,12,0};
		
		for(int i=0;i<arr1.length;i++)
		{
			pq1.add(arr1[i]);
			
		}
		
		while(!pq1.isEmpty())
		{
			System.out.print(pq1.poll()+" ");
		}
		System.out.println();
		
		//MaxPQ
		PriorityQueue<Integer> pq2=new PriorityQueue<>(new MaxPQComparator());
		for(int i=0;i<arr1.length;i++)
		{
			pq2.add(arr1[i]);
			
		}
		
		while(!pq2.isEmpty())
		{
			System.out.print(pq2.poll()+" ");
		}
		System.out.println();
		
	}
	
}
