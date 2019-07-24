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
		/* Your class should be named Solution
		* Don't write main().
		* Don't read input, it is passed as function argument.
		* Return output and don't print it.
		* Taking input and printing output is handled automatically.
		*/
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

