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
    
   
    
	public static boolean checkBalanced(BinaryTreeNode<Integer> root){
		
		// Write your code here
        boolean ans=false;
        if(root==null)
        {
            ans=true;
            return ans;
        }
        
        int leftDepth=0,rightDepth=0;
        leftDepth=height(root.left);
        rightDepth=height(root.right);
         
        
        if((Math.abs(leftDepth-rightDepth))<=1)
        {
            boolean a=checkBalanced(root.left);
            boolean b=checkBalanced(root.right);
            if(a && b)
            {
                ans=true;
                return ans;
            }
            
        }
        
    
            return ans;
    }
	
}


