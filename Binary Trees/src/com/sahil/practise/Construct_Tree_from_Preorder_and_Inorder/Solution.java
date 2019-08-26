package com.sahil.practise.Construct_Tree_from_Preorder_and_Inorder;

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

    public static BinaryTreeNode<Integer> getTreeFromPreorderAndInorderHelper(int[] pre,
			int[] in,int inS,int inE,int preS,int preE){
		
			// Write your code here
        if(inS>inE)
            return null;
        
        int rootdata=pre[preS];
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
        int preLeftS=preS+1;
        int preLeftE=inLeftE-inLeftS+preLeftS;
        int inRightS=rootIndex+1;
        int inRightE=inE;
        int preRightS=preLeftE+1;
        int preRightE=preE;
        
        
        
        root.left=getTreeFromPreorderAndInorderHelper(pre,in,inLeftS,inLeftE,preLeftS,preLeftE);
        root.right=getTreeFromPreorderAndInorderHelper(pre,in,inRightS,inRightE,preRightS,preRightE);
        
        return root;
        
        
        
   
	
	}
    
    
    
    
	public static BinaryTreeNode<Integer> getTreeFromPreorderAndInorder(int[] pre,
			int[] in){
		
			// Write your code here
		return getTreeFromPreorderAndInorderHelper(pre,in,0,in.length-1,0,pre.length-1);
	}

}
