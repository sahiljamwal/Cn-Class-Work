package com.sahil.practise.Length_of_LL;

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

	public static int length(LinkedListNode<Integer> head){
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
		*/
        
        LinkedListNode<Integer> temp=head;
        int count=0;
        while(temp.next!=null)
        {
            count++;
            temp=temp.next;
        }
        
        return count+1;
		
	}
}