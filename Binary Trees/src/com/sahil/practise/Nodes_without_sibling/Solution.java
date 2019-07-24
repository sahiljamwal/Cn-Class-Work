package com.sahil.practise.Nodes_without_sibling;



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

	public static void printNodesWithoutSibling(BinaryTreeNode<Integer> root) {
		
		// Write your code here
        if(root==null)
            return;
        if((root.left==null && root.right!=null)||(root.right==null && root.left!=null))
        {
            if(root.left!=null)
                System.out.println(root.left.data);
            if(root.right!=null)
                System.out.println(root.right.data);
        }
        
        printNodesWithoutSibling(root.left);
        printNodesWithoutSibling(root.right);
        
        return;
        
	}



}
