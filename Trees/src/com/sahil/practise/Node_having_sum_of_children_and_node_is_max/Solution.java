package com.sahil.practise.Node_having_sum_of_children_and_node_is_max;


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
	
    static int maxSum;
    static TreeNode<Integer> maxCurrent;
	
	public static void maxSumNodeHelper(TreeNode<Integer> root){
	
       
        int sum=root.data;
        for(int i=0;i<root.children.size();i++)
        {
            sum+=root.children.get(i).data;
            maxSumNodeHelper(root.children.get(i));
        }
        
         if(sum>=maxSum)
            {
                maxCurrent=root;
                maxSum=sum;
            }
       
        
        
        
        //return ;
        
	}
    
    public static TreeNode<Integer> maxSumNode(TreeNode<Integer> root)
    {
        
        maxSumNodeHelper(root);

        return maxCurrent;
	
    }	
}
