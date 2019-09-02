package com.sahil.practise.Inplace_heap_sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;

public class Solution {

	public static void inplaceHeapSort(int input[]) {
		/* Your class should be named Solution
		* Don't write main().
		* Don't read input, it is passed as function argument.
		* Change in the given input itself.
		* Taking input and printing output is handled automatically.
		*/
		
		PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
		
		for(int i=0;i<input.length;i++)
		{
			pq.add(input[i]);
		}
		
		ArrayList<Integer> ans=new ArrayList<>();
		
		while(!pq.isEmpty())
		{
			ans.add(pq.poll());
		}
		
		for(int i=0;i<ans.size();i++)
		{
			input[i]=ans.get(i);
		}
		System.out.println();
	}
}