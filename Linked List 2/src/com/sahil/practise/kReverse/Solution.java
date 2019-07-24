package com.sahil.practise.kReverse;

import java.util.Stack;

public class Solution {
    
      
    
    
   
    private static int getLength(LinkedListNode<Integer> head) {
    		int length=1;
    		LinkedListNode<Integer> temp=head;
    	while(temp!=null)
    	{
    		temp=temp.next;
    		length++;
    	}
    	return length-1;
    }
    
	public static LinkedListNode<Integer> kReverse(LinkedListNode<Integer> head, int k) {
        
		LinkedListNode<Integer> temp=head;
		LinkedListNode<Integer> newhead=null;
		LinkedListNode<Integer> newtail=null;
		int counter=1;
		while(counter!=getLength(head))
		{
			Stack<LinkedListNode<Integer>> stack=new Stack<>();
			int count=0;
			while(count<k)
			{
				stack.push(temp);
				if(temp!=null)
					temp=temp.next;
				
				count++;
			}
			if(counter<k)
				newhead=stack.peek();
			LinkedListNode<Integer> temp1=stack.pop();
			while(!stack.isEmpty())
			{
				newtail=temp1;
				temp1.next=stack.pop();
				temp1=temp1.next;
			}
			counter=count;
			counter++;
			
			
		}
		
		return newhead;
        
    }

	
}
