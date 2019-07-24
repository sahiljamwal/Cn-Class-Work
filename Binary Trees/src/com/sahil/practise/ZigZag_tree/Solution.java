package com.sahil.practise.ZigZag_tree;


import java.util.Stack;

public class Solution {

	/*	Binary Tree Node class
	 * 
	 * class BinaryTreeNode<T> {
		T data;
		BinaryTreeNode<T> left;
		BinaryTreeNode<T> right;

		public BinaryTreeNode(T data) {
			this.data = data;
		}
	}
	 */

	public static void printZigZag(BinaryTreeNode<Integer> root) {
		

		Stack<BinaryTreeNode<Integer>> s1=new Stack<>();
		Stack<BinaryTreeNode<Integer>> s2=new Stack<>();
		s1.push(root);
		int level=0;
		
		while(!(s1.size()==0 && s2.size()==0 ))
		{
            while(!(s1.size()==0))
            {
                if(level%2==0)
			    {
				BinaryTreeNode<Integer> current=s1.pop();
				
				if(current.left!=null)
				{
					s2.push(current.left);
				}
				if(current.right!=null)
				{
					s2.push(current.right);
				}
				System.out.print(current.data+" ");
			    }
                if(s1.size()==0)
                {
                    level++;
				    System.out.println();        
                }
            }
			
            while(!(s2.size()==0))
            {
                if(level%2!=0)
			    {
				BinaryTreeNode<Integer> current=s2.pop();
				
				if(current.right!=null)
				{
					s1.push(current.right);
				}
				if(current.left!=null)
				{
					s1.push(current.left);
				}
				System.out.print(current.data+" ");
			    }   
                if(s2.size()==0)
                {
                    level++;
                    System.out.println();
                }
            }
			
			
		}
		

	}


}
