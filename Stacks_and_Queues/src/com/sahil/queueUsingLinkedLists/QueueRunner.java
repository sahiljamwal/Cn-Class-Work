package com.sahil.queueUsingLinkedLists;

import com.sahil.stacksUsingLinkedLists.QueueEmptyException;

public class QueueRunner {

	public static void main(String[] args) {
		
		QueueUsingLL<Integer> queue=new QueueUsingLL<Integer>();
		
	
		queue.isEmpty();
		System.out.println(queue.size());
		queue.enqueue(10);
		queue.enqueue(20);
		System.out.println(queue.size());
		try {
			System.out.println(queue.dequeue());
			System.out.println(queue.dequeue());
		} catch (QueueEmptyException e) {
			e.printStackTrace();
		}
		
		System.out.println(queue.size());
		try {
			System.out.println(queue.front());
		} catch (QueueEmptyException e) {
			e.printStackTrace();
		}
		
	}
	
}
