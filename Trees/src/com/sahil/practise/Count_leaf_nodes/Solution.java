package com.sahil.practise.Count_leaf_nodes;


public class Solution {

/*	TreeNode structure 
 * 
 * class TreeNode<T> {
		T data;
		ArrayList<TreeNode<T>> children;

		TreeNode(T data){
			this.data = data;
			children = new ArrayList<TreeNode<T>>();
		}
	}*/
	
	public static int countLeafNodes(TreeNode<Integer> root){

		// Write your code here
         int count=0;
        if(root.children.size()==0)
            return count+1;
        int tempans=0;
        for(int i=0;i<root.children.size();i++)
        {
            
            tempans+=countLeafNodes(root.children.get(i));
        }
        
        
        return count+tempans;

	}
	
}

