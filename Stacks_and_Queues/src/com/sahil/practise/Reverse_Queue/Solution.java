package com.sahil.practise.Reverse_Queue;


/**********
 * Given Queue Class ************** //You can directly use these functions
 * 
 * class Queue<T> {
 * 
 * public int size();
 * 
 * public boolean isEmpty();
 * 
 * public T front();
 * 
 * public void enqueue(T element);
 * 
 * public T dequeue(); }
 * 
 **********************************/

public class Solution {

	public static void reverseQueue(Queue<Integer> q) {
		// Write your code here

	     
	       if (q.size() == 0 ) 
				return;
				
			int x=q.dequeue();
			reverseQueue(q);
			q.enqueue(x);
			
			
			
			
			
		

	}
}