package com.sahil.practise.Second_Largest_Element_In_Tree;



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
	public static TreeNode<Integer> findSecondLargestHelper(TreeNode<Integer> root)
    {
		TreeNode<Integer> ans;
        ans=root;
        
        TreeNode<Integer> tempAns;
        for(int i=0;i<root.children.size();i++)
        {
        	tempAns=findSecondLargestHelper(root.children.get(i));
        	if(tempAns.data>ans.data)
        	{
        		ans=tempAns;
        	}
        	
        }
        
        return ans;
    }
	
	public static TreeNode<Integer> findSecondLargest(TreeNode<Integer> root){


		// Write your code here
        TreeNode<Integer> temp;
        temp=findSecondLargestHelper(root);
        temp.data=-1;
        	
        return findSecondLargestHelper(root);
        
	}
	
	
}
