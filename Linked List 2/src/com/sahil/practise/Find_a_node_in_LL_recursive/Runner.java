package com.sahil.practise.Find_a_node_in_LL_recursive;


import java.util.Scanner;

class LinkedListNode<T> {
	T data;
	LinkedListNode<T> next;
	
	public LinkedListNode(T data) {
		this.data = data;
	}
}

public class Runner {
	
	static Scanner s = new Scanner(System.in);
	
	public static LinkedListNode<Integer> takeInput() {
		LinkedListNode<Integer> head = null, tail = null;
		int data = s.nextInt();
		while(data != -1) {
			LinkedListNode<Integer> newNode = new LinkedListNode<Integer>(data);
			if(head == null) {
				head = newNode;
				tail = newNode;
			}
			else {
				tail.next = newNode;
				tail = newNode;
			}
			data = s.nextInt();
		}
		return head;
	}
	

	
	public static void main(String[] args) {
		LinkedListNode<Integer> head = takeInput();
		int n = s.nextInt();
		System.out.println(Solution.indexOfNRec(head, n));
	}
}