package com.sahil.practise.Find_a_node_in_LL;

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
	public static int indexOfNIter(LinkedListNode<Integer> head, int n) {
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
		*/
        LinkedListNode<Integer> temp=head;
        int flag=0,index=0,count=0;
        while(temp!=null)
        {
            if(temp.data==n)
            {
                index=count;
                flag=-1;
                break;
            }
            count++;
            temp=temp.next;
        }
        if(flag==-1)
            return index;
        else 
            return -1;
        
	}
}