package com.sahil.practise.Height_Of_Binary_Tree;

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
    
   public static int height(BinaryTreeNode<Integer> root) {
		
		int height=1;
        if(root==null)
        {
            height=0;
            return height;    
        }
        
        int tempLeftHeight=0,tempRightHeight=0;;
        tempLeftHeight+=height(root.left);
        tempRightHeight+=height(root.right);
        if(tempLeftHeight>=tempRightHeight)
        {
            height+=tempLeftHeight;
            return height;
        }   
        else
        {
            height+=tempRightHeight;
            return height;
            
        }
        
            
      
        
	}
    
   
    
	
	
}


