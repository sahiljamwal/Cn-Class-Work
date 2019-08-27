package com.sahil.practise.LCA_of_Binary_Tree;

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
    
    public static BinaryTreeNode <Integer> lcaBinaryTreeHelper(BinaryTreeNode <Integer> root , int a, int b)
    {
        if(root==null)
            return null;
        
        if(root.data==a || root.data==b )
            return root;
        
        BinaryTreeNode <Integer> left=lcaBinaryTreeHelper(root.left,a,b);
        BinaryTreeNode <Integer> right=lcaBinaryTreeHelper(root.right,a,b);
        
        if(left==null && right!=null)
            return right;
        else if(left!=null && right==null)
            return left;
        else if(left==null && right==null)
            return null;
        // else if(left!=null && right!=null)
        //     return root;
        else 
            return root;
    }

	public static int lcaBinaryTree(BinaryTreeNode <Integer> root , int a, int b){
		// Write your code here
        
        BinaryTreeNode <Integer> ans=lcaBinaryTreeHelper(root,a,b);
        
        if(ans!=null)
            return ans.data;
        else
            return -1;
	}
}