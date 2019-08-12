package com.sahil.pratise.Even_after_Odd_LinkedList;


/*
class LinkedListNode<T> {
	public T data;
	public LinkedListNode<T> next;

	public LinkedListNode(T data) {
		this.setData(data);
		this.next = null;
	}



}
* */
public class Solution {
	public static LinkedListNode<Integer> sortEvenOdd(LinkedListNode<Integer> head) {
        
        LinkedListNode<Integer> oddHead=null;
        LinkedListNode<Integer> oddTail=null;
        LinkedListNode<Integer> evenHead=null;
        LinkedListNode<Integer> evenTail=null;
        
        while(head!=null)
        {
            if(head.data%2!=0)
            {
                if(oddHead==null)
                {
                    oddHead=head;
                    oddTail=head;
                }
                else
                {
                    oddTail.next=head;
                    oddTail=head;
                }
                head=head.next;
            }

            else
            {
                if(evenHead==null)
                {
                    evenHead=head;
                    evenTail=head;
                }
                else
                {
                    evenTail.next=head;
                    evenTail=head;
                }
                head=head.next;
            }
        }

        LinkedListNode<Integer> ans=null;
        if(oddHead!=null && evenHead!=null)
        {
            oddTail.next=null;
            evenTail.next=null;
            oddTail.next=evenHead;
            ans=oddHead;
        }
        else if(oddHead==null)
        {
            evenTail.next=null;
            ans=evenHead;
        }
        else if(evenHead==null)
        {
            oddTail.next=null;
            ans=oddHead;
        }

        return ans;
        

	}
}
