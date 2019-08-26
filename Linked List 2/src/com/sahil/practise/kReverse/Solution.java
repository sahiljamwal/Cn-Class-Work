package com.sahil.practise.kReverse;


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
	public static LinkedListNode<Integer> kReverse(LinkedListNode<Integer> head, int k) 
    {
        LinkedListNode<Integer> p=null;
        LinkedListNode<Integer> c=head;
        LinkedListNode<Integer> n=null;
        
        int count=0;
        while(count<k && c!=null)
        {
            n=c.next;
            c.next=p;
            p=c;
            c=n;
                
            count++;
        }
        if(n!=null)   
            head.next=kReverse(n,k);
        
        return p;
        
    }
}
