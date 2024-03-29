package com.sahil.practise.Mirror_a_Binary_Tree;


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
	
	public static void mirror(BinaryTreeNode<Integer> root){
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * No need to print or return the output.
		 * Taking input and printing output is handled automatically.
		 */
        
        if(root==null)
            return;
        
        mirror(root.left);
        mirror(root.right);
        
        BinaryTreeNode<Integer> temp=root.left;
        root.left=root.right;
        root.right=temp;
        
        return;
        
        

	}
	
}