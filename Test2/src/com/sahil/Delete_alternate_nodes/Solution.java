package com.sahil.Delete_alternate_nodes;


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
} */
public class Solution {
	public static void deleteAlternateNodes(LinkedListNode<Integer> head) {
        if(head==null)
            return;
        LinkedListNode<Integer> prev=head;
        LinkedListNode<Integer> current=head.next;
        
        while(prev!=null && current!=null)
        {
            prev.next=current.next;
            
            prev=prev.next;
            if(prev!=null)
                current=prev.next;
        }
	}
}