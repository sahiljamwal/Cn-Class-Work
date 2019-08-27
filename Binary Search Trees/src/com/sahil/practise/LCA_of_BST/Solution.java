package com.sahil.practise.LCA_of_BST;

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
    public static BinaryTreeNode <Integer> lcaInBSTHelper(BinaryTreeNode <Integer> root , int a, int b)
    {
        if(root==null)
            return null;
        
    
        
        if(root.data>a && root.data>b)
            return lcaInBSTHelper(root.left,a,b);
        else if(root.data<a && root.data<b)
            return lcaInBSTHelper(root.right,a,b);
        
        return root;
    }

	public static int lcaInBST(BinaryTreeNode<Integer> root , int a , int b){
		// Write your code here
         BinaryTreeNode <Integer> ans=lcaInBSTHelper(root,a,b);
        
        if(ans!=null)
            return ans.data;
        else
            return -1;

	}
}