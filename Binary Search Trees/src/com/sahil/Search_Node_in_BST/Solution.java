package com.sahil.Search_Node_in_BST;

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

	public static BinaryTreeNode<Integer> searchInBST(BinaryTreeNode<Integer> root , int k){
		/* Your class should be named Solution
		* Don't write main().
		* Don't read input, it is passed as function argument.
		* Return output and don't print it.
		* Taking input and printing output is handled automatically.
		*/
        BinaryTreeNode<Integer> ans=null;
        
        if(root==null)
            return null;
        if(root.data==k)
            return root;
        else if(root.data>k)
            ans=searchInBST(root.left,k);
        else if(root.data<k)
            ans=searchInBST(root.right,k);
            
        return ans;

	}
}