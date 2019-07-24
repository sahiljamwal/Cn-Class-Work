package com.sahil.stacksUsingArrays;

import java.util.Stack;

public class StackRunner {
	
	public static void main(String[] args) throws StackFullException, StackEmptyException {
		
		StacksUsingArray stack=new StacksUsingArray(5);
		
		
		System.out.println(stack.isEmpty());
		//System.out.println(stack.top());
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		System.out.println(stack.top());
		stack.pop();
		stack.pop();
		System.out.println(stack.top());
		System.out.println(stack.isEmpty());
		System.out.println(stack.size());
		
	}

}
