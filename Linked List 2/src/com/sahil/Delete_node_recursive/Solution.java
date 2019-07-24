package com.sahil.Delete_node_recursive;

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
    public static LinkedListNode<Integer> deleteIthNodeRec(LinkedListNode<Integer> head,LinkedListNode<Integer> temp,LinkedListNode<Integer> temp1, int i,int c)
    {if(i==0)
    {
        if(temp.next==null&&i==0)
        {return null;}  
        else if(i==0)
        {
          head=head.next;
return head;
            
        }
    }
	
    if(c==i)
    {
        
            
        
        temp.next=temp1.next;
    
     return head;
        
        
    }
    
    
    
    return deleteIthNodeRec(head,temp1,temp1.next,i,c+1);
       
    }

	public static LinkedListNode<Integer> deleteIthNodeRec(LinkedListNode<Integer> head, int i)
    {
	
   return  deleteIthNodeRec(head,head,head.next,i,1);
	}
    
}