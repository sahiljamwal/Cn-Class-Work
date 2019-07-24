package com.sahil.practise.Sum_of_all_nodes;


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
	
	public static int sum(BinaryTreeNode<Integer> root){
		
		// Write your code here
        int sum=0;
        if(root==null)
            return 0;
        else
            sum=root.data;
        int tempSum=0;
        tempSum+=sum(root.left);
        tempSum+=sum(root.right);
        
        return sum+tempSum;
        

	}
	
}
