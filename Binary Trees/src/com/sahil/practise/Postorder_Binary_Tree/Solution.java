package com.sahil.practise.Postorder_Binary_Tree;

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
	public static void postOrder(BinaryTreeNode<Integer> root) {
		/* Your class should be named Solution
		* Don't write main().
		* Don't read input, it is passed as function argument.
		* Print output and don't return it.
		* Taking input is handled automatically.
		*/
		if(root==null)
        {
            return;
        }
        
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data+" ");
	
	}
	
}
