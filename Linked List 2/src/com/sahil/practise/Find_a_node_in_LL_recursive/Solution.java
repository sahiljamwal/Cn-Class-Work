package com.sahil.practise.Find_a_node_in_LL_recursive;

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
    
    public static int count=0;
    
  
    
	public static int indexOfNRec(LinkedListNode<Integer> head, int n) {
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
		*/
        
        count++;
        if(head==null)
        {
            
            int ans=-1;
            return ans;
        }
        
        if(n==head.data)
        {
            
            int ans=count-1;
            return ans;
        }
        
        
        int ans=indexOfNRec(head.next,n);
       
        return ans;
        
        
	}
}	