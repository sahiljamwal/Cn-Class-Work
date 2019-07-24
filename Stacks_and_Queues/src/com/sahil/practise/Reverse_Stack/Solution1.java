package com.sahil.practise.Reverse_Stack;

import java.util.Stack;

public class Solution1 {
    
    public static void reversStackRecursive(Stack<Integer> s1, Stack<Integer> s2)
    {
        if(s1.size()==0 || s1.size()==1)
        {
             int temp=s1.pop();
             s2.push(temp);
             return;
        }
           
        int x=s1.pop();
        
        
        
        reversStackRecursive(s1,s2);
        s2.push(x);
    }

	public static void reverseStack(Stack<Integer> s1, Stack<Integer> s2) {
		
        reversStackRecursive(s1,s2);
        
        while(!s2.isEmpty())
        {
            s1.push(s2.pop());
        }
        
	}
    
    
}