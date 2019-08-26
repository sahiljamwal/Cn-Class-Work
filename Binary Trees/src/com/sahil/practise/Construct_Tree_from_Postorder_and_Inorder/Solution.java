package com.sahil.practise.Construct_Tree_from_Postorder_and_Inorder;

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
    
    public static BinaryTreeNode<Integer> getTreeFromPostorderAndInorderHelper(int[] post,
			int[] in,int inS,int inE,int postS,int postE){
		
			// Write your code here
        if(inS>inE)
            return null;
        
        int rootdata=post[postE];
        BinaryTreeNode<Integer> root=new BinaryTreeNode<Integer>(rootdata);
        int rootIndex=-1;
        for(int i=inS;i<=inE;i++)
        {
            if(in[i]==root.data)
            {
                rootIndex=i;
                break;
            }
        }
        
        if(rootIndex==-1)
            return null;
        
        
        int inLeftS=inS;
        int inLeftE=rootIndex-1;
        int postLeftS=postS;
        int postLeftE=inLeftE-inLeftS+postLeftS;
        int inRightS=rootIndex+1;
        int inRightE=inE;
        int postRightS=postLeftE+1;
        int postRightE=postE-1;
        
        
        
        root.left=getTreeFromPostorderAndInorderHelper(post,in,inLeftS,inLeftE,postLeftS,postLeftE);
        root.right=getTreeFromPostorderAndInorderHelper(post,in,inRightS,inRightE,postRightS,postRightE);
        
        return root;
        
        
        
   
	
	}
    
    
    
    
	public static BinaryTreeNode<Integer> getTreeFromPostorderAndInorder(int[] post,
			int[] in){
		
			// Write your code here
        return getTreeFromPostorderAndInorderHelper(post,in,0,in.length-1,0,post.length-1);
		
	}

	


}
