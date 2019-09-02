package com.sahil.InbuiltPriorityQueues;

import java.util.Comparator;
import java.util.PriorityQueue;

class MinLengthPQComparator implements Comparator<String>
{

	@Override
	public int compare(String o1, String o2) {
		if(o1.length()<o2.length())
			return -1;
		else if(o1.length()>o2.length())
			return 1;
		else
			return 0;
			
	}
	
}

class MaxLengthPQComparator implements Comparator<String>
{

	@Override
	public int compare(String o1, String o2) {
		if(o1.length()<o2.length())
			return 1;
		else if(o1.length()>o2.length())
			return -1;
		else
			return 0;
			
	}
	
}


public class StringPQ {

	
	
	public static void main(String[] args) {
		
		//MinPQ
		PriorityQueue<String> pq1=new PriorityQueue<>(new MinLengthPQComparator());
		String arr1[]={"thats","very","is","awsome","ands"};
		
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
		PriorityQueue<String> pq2=new PriorityQueue<>(new MaxLengthPQComparator());
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