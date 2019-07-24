package com.sahil.Merge_two_sorted_LL;

/*************** 
 * Following is the Node class already written 
class LinkedListNode<T> {
	T data;
	LinkedListNode<T> next;

	public Node(T data) {
		this.data = data;
	}
}
 ***************/

public class Solution {

	public static LinkedListNode<Integer> mergeTwoList(LinkedListNode<Integer> head1, LinkedListNode<Integer> head2) {
          
        LinkedListNode<Integer> t1=head1;
        LinkedListNode<Integer> t2=head2;
        LinkedListNode<Integer> head=null;
        LinkedListNode<Integer> tail=null;
        
        if(head1.data <= head2.data) 
            { 
                head=head1;
                tail=head1;
                head1=head1.next;
            }  
            else
            { 
                head=head2;
                tail=head2;
                head2=head2.next;
            } 
   
       
         while(head1!=null&&head2!=null)
         {
            if(head1.data <= head2.data) 
            { 
                tail.next =head1;
                tail=head1;
                head1= head1.next; 
            }  
            else
            { 
                tail.next = head2; 
                tail=head2;
                head2 =  head2.next; 
            } 
          
        }
            if( head1==null)
            {
                tail.next= head2;
            }
            if( head2==null)
            {
                tail.next= head1;
            }
        
 
        return head;
}
}

