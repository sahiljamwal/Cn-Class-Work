package com.sahil.Reverse_LL_Recursive;


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
	
	public static LinkedListNode<Integer> reverse_R(LinkedListNode<Integer> head) {
        
        if(head==null || head.next==null)
            return head;
        
  
        LinkedListNode<Integer> newhead=reverse_R(head.next);
        LinkedListNode<Integer> temp=newhead;
        
        while(temp.next!=null)
        {
            temp=temp.next;
        }
        temp.next=head;
        head.next=null;
        
        return newhead;
     
	}
}
