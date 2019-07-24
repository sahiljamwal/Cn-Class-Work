package com.sahil.practise.Find_Node;


public class Solution {

/*	Binary Tree Node class 
 * 
 * 	class BinaryTreeNode<T> {
		T data;
		BinaryTreeNode<T> left;
		BinaryTreeNode<T> right;
		
		public BinaryTreeNode(T data) {
			this.data = data;
		}
	}
	*/
	
	public static boolean isNodePresent(com.sahil.practise.Find_Node.BinaryTreeNode<Integer> root,int x){
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
		*/
        boolean found=false;
        if(root==null)
            return found;
        
        if(root.data==x)
        {
            found=true;
            return found;
        }
        
        found=isNodePresent(root.left,x);
        if(found==true)
            return found;
        found=isNodePresent(root.right,x);
        if(found==true)
            return found;
        
        return found;
	}
	
}
