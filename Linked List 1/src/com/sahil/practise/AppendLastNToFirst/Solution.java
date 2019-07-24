package com.sahil.practise.AppendLastNToFirst;


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
	public static LinkedListNode<Integer> append(LinkedListNode<Integer> root, int n) {
        
        LinkedListNode<Integer> temp=root;
        LinkedListNode<Integer> temp1=root;
        LinkedListNode<Integer> tail=root;
        int count=0;
         while(temp!=null)
        {
            
            count++;
            temp=temp.next;
            
        }
        temp=root;
        while(temp.next!=null)
        {
            
            tail=temp.next;
            temp=temp.next;
            
        }
        tail.next=root;
        
          
        int i=0;
        while(i!=count-n-1)
        {
            temp1=temp1.next;
            i++;
        }
        LinkedListNode<Integer> newhead=temp1.next;
        temp1.next=null;
        
        
        
        
        return newhead;
    }
}

