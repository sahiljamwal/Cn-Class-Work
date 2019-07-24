package com.sahil.practise.Reverse_Stack;

import java.util.Stack;

public class Solution {

	public static void reverseStack(Stack<Integer> s1, Stack<Integer> s2) {
		while(!s1.isEmpty())
		{
			int temp=s1.peek();
			s2.push(temp);
			s1.pop();
		}
		Object[] arr=new Object[s2.size()];
		s2.copyInto(arr);
		
		for (int i = 0; i < arr.length; i++) {
			s1.push((Integer) arr[i]);
		}
		
	}
}