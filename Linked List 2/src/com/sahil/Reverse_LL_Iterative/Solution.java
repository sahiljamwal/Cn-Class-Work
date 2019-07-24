package com.sahil.Reverse_LL_Iterative;


/*
 class LinkedListNode<T> {
	public T data;
	public LinkedListNode<T> next;

	public LinkedListNode(T data) {
		this.setData(data);
		this.next = null;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

}
 * */
public class Solution {
	public static LinkedListNode<Integer> reverse_I(LinkedListNode<Integer> head) {
		
        LinkedListNode<Integer> p=null;
        LinkedListNode<Integer> temp=head;
        LinkedListNode<Integer> q=head.next;
        
        while(temp!=null)
        {
            temp.next=p;
            p=temp;
            temp=q;
            if(q!=null)
                q=q.next;
            head=p;
        }
        
        return head;
        
        
	}

}