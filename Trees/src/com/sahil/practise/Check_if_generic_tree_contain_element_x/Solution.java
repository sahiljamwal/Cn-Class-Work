package com.sahil.practise.Check_if_generic_tree_contain_element_x;

public class Solution {

/*	TreeNode class 
 * 
 * class TreeNode<T> {
		T data;
		ArrayList<TreeNode<T>> children;

		TreeNode(T data){
			this.data = data;
			children = new ArrayList<TreeNode<T>>();
		}
	}*/
	
	public static boolean checkIfContainsX(TreeNode<Integer> root, int x){

		// Write your code here
        boolean ans=false;
        if(root.data==x)
        {
            ans=true;
            return ans;
        }
        for(int i=0;i<root.children.size();i++)
        {
            ans=checkIfContainsX(root.children.get(i),x);
            if(ans==true)
                break;
        }
        
        return ans;

	}
	
}
