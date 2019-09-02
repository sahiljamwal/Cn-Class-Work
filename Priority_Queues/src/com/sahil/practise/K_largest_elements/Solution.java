package com.sahil.practise.K_largest_elements;

import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;

public class Solution {

	public static ArrayList<Integer> kLargest(int input[], int k) {
		/* Your class should be named Solution
		* Don't write main().
		* Don't read input, it is passed as function argument.
		* Return output and don't print it.
		* Taking input and printing output is handled automatically.
		*/
		PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
		
		for(int i=0;i<input.length;i++)
		{
			pq.add(input[i]);
		}
		
		int count=0;
		ArrayList<Integer> ans=new ArrayList<Integer>();
		while(!pq.isEmpty() && count!=k)
		{
			count++;
			ans.add(pq.poll());
		}
		
		return ans;
	}
}