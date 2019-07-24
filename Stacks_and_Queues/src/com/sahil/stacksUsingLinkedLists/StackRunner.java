package com.sahil.stacksUsingLinkedLists;

import com.sahil.stacksUsingArrays.StackEmptyException;

public class StackRunner  {
	
	public static void main(String[] args)throws StackEmptyException {
		
		StackUsingLL<Integer> stack=new StackUsingLL<>();
		
		System.out.println(stack.size());
		System.out.println(stack.isEmpty());
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		
		System.out.println(stack.top());
		
		stack.pop();
		
		System.out.println(stack.isEmpty());
		
	}

}
