package com.sahil.practise.Create_and_Insert_Duplicate_Node;

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
	
	public static void insertDuplicateNode(BinaryTreeNode<Integer> root) {
		// Write your code here
		if(root==null)
            return;
        
        
        
     
        insertDuplicateNode(root.left);
        insertDuplicateNode(root.right);
        
        BinaryTreeNode<Integer> tempNode=new BinaryTreeNode<Integer>(root.data);
        BinaryTreeNode<Integer> tempSave=root.left;
        root.left=tempNode;
        tempNode.left=tempSave;
        
        
      
	}
}
