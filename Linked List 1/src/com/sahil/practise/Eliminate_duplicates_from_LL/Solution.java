package com.sahil.practise.Eliminate_duplicates_from_LL;



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
	public static LinkedListNode<Integer> removeDuplicates(LinkedListNode<Integer> head) 
     {
        if(head.next==null)
        {
            return head;
        }
        LinkedListNode<Integer> temp=head;
        LinkedListNode<Integer> temp1=temp.next;

        while(temp1!=null)
        {
            if(temp.data!=temp1.data)
            {
                temp.next=temp1;
                temp=temp1;
                temp1=temp1.next;
            }
            else
            {
               temp1=temp1.next;
            }
        }
        

        return head;
    }
}
