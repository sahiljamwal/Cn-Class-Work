package com.sahil.practise.Structurally_identical;

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
    
    
    public static String giveInorder(TreeNode<Integer> root)
    {
        String ans="";
        ans+=root.data;
        
        String temp="";
        for(int i=0;i<root.children.size();i++)
        {
            temp+=giveInorder(root.children.get(i));
        }
        
        return ans+temp;
    }
	
	public static boolean checkIdentical(TreeNode<Integer> root1, TreeNode<Integer> root2){

		// Write your code here
         boolean ans=false;
        String s1=giveInorder(root1);
        String s2=giveInorder(root2);
        
        if(s1.length()!=s2.length())
            ans=false;
        else
        {
            if(s1.equals(s2))
                ans=true;
        }
        
        return ans;
	}
	
}
