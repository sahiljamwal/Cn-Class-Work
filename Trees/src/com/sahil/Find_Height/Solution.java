package com.sahil.Find_Height;


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

	public static int height(TreeNode<Integer> root){
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
		 * Taking input and printing output is handled automatically.
		 */
        int height=1;
        int tempHeight=0;
        for(int i=0;i<root.children.size();i++)
        {
            int tempHeight1=0;
            tempHeight1+=height(root.children.get(i));
            if(tempHeight1>=tempHeight)
                tempHeight=tempHeight1;
        }
        
        
        return height+tempHeight;
	}

}
