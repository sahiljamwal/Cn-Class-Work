package com.sahil.Merge_Sort;


public class Solution {
    public static LinkedListNode<Integer> Middel(LinkedListNode<Integer> head) {
        
        LinkedListNode<Integer> slow=head;
        LinkedListNode<Integer> fast=head;
        
        while(fast.next!=null )
        {
            
            fast=fast.next;
            if(fast.next!=null)
            {
                slow=slow.next;
                fast=fast.next;
                
            }
           
        }
        
        return slow;
        
    }
    
    public static LinkedListNode<Integer> mergeTwoList(LinkedListNode<Integer> head1, LinkedListNode<Integer> head2) {
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
		*/
        LinkedListNode<Integer> t1=head1;
        LinkedListNode<Integer> t2=head2;
        LinkedListNode<Integer> head;
        LinkedListNode<Integer> tail;
        
        if(head1.data<head2.data)
        {
            head=head1;
            tail=head1;
            t1=head1.next;
        }
        else
        {
            head=head2;
            tail=head2;
            t2=head2.next;
        }
        
        while(t1!=null && t2!=null)
        {
            if(t1.data<t2.data)
            {
                tail.next=t1;
                tail=t1;
                t1=t1.next;
                if(t1!=null && t2!=null)
                {
                            if(t1.data<t2.data && t1!=null && t2!=null )
                    {
                        tail.next=t1;
                        tail=t1;
                        t1=t1.next;
                    }
                    else
                    {
                        tail.next=t2;
                        tail=t2;
                        t2=t2.next;
                    }
                }
                
                    
            }
            else
            {
                tail.next=t2;
                tail=t2;
                t2=t2.next;
                if(t1!=null && t2!=null)
                {
                        if(t1.data>t2.data )
                    {
                        tail.next=t2;
                        tail=t2;
                        t2=t2.next;
                    }
                    else
                    {
                        tail.next=t1;
                        tail=t1;
                        t1=t1.next;
                    }
                }
                
                    
            }
        }
        if(t1==null)
            tail.next=t2;
        else if(t2==null)
            tail.next=t1;
        
        return head;
            
        
		
	}


    
        
    
    
	public static LinkedListNode<Integer> mergeSort(LinkedListNode<Integer> head) {
		// write your code here
       
        
        if(head==null || head.next==null)
            return head;
       
       
        LinkedListNode<Integer> middle=Middel(head);
        LinkedListNode<Integer> t2=middle.next;
        middle.next=null;
        
        LinkedListNode<Integer> left=mergeSort(head);
        LinkedListNode<Integer> right=mergeSort(t2);
        
       LinkedListNode<Integer> newhead= mergeTwoList(left,right);
        
        return newhead;
     
	}

}
