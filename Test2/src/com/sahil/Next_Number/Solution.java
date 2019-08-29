package com.sahil.Next_Number;

/*************** 
 * Following is the Node class already written 
class LinkedListNode<T> {
	T data;
	LinkedListNode<T> next;

	public LinkedListNode(T data) {
		this.data = data;
	}
}
 ***************/

public class Solution {

    public static LinkedListNode<Integer> reverse(LinkedListNode<Integer> head) {
		
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

    public static LinkedListNode<Integer> nextLargeNumberHelper(LinkedListNode<Integer> head) {
   
        LinkedListNode<Integer> result=head;
        LinkedListNode<Integer> temp=null;
        LinkedListNode<Integer> prev=null;
        
        int carry=1,sum;
        
        while(head!=null)
        {
            sum=carry+head.data;
            
            carry=(sum>=10)?1:0;
            
            sum=sum%10;
            
            head.data=sum;
            
            temp=head;
            head=head.next;
        }
        
        if(carry>0)
        {
            LinkedListNode<Integer> node=new LinkedListNode<>(carry);
            temp.next=node;
        }
        
        return result;
        
	}
	public static LinkedListNode<Integer> nextLargeNumber(LinkedListNode<Integer> head) {
       head=reverse(head);
        
        head=nextLargeNumberHelper(head);
        
        return reverse(head);
	}


}
