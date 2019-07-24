package com.sahil.practise.Remove_Leaf_nodes;



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

	public static BinaryTreeNode<Integer> removeAllLeaves(BinaryTreeNode<Integer> root){
		
		// Write your code here
        if(root==null)
            return root;
        if(root.left==null && root.right==null)
        {
            root=null;
            return root;
        }
        
        root.left=removeAllLeaves(root.left);
        root.right=removeAllLeaves(root.right);
        
        return root;

	}



}
