package com.sahil.practise.Buy_the_ticket;

import java.util.Collections;
import java.util.PriorityQueue;

public class Solution {
	
	public static int buyTicket(int input[], int k) {
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
		
		int time=1;
		while(pq.remove()!=input[k])
		{
			time++;  
		}
		
		return time;
	}
}