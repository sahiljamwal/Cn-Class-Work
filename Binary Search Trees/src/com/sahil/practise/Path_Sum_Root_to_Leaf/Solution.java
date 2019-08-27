package com.sahil.practise.Path_Sum_Root_to_Leaf;

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
	public static void rootToLeafPathsSumToKHelper(BinaryTreeNode<Integer> root, int k,String path) {
		// Write your code here
		if(root==null)
            return;
        if(root.left==null && root.right==null)
        {
            if(k==0 || root.data==k)
            {
                path+=root.data;
                System.out.println(path);
                return;
            }
            else
            {
                return;
            }
                
        }
        if(root.left!=null || root.right!=null)
        {
            path+=root.data;
            path+=" ";
            rootToLeafPathsSumToKHelper(root.left,k-root.data,path);
            rootToLeafPathsSumToKHelper(root.right,k-root.data,path);
        }
        
    }
    
    
	public static void rootToLeafPathsSumToK(BinaryTreeNode<Integer> root, int k) {
		// Write your code here
        
        rootToLeafPathsSumToKHelper(root,k,"");
		
	}
}
