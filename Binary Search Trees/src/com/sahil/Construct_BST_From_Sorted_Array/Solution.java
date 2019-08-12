package com.sahil.Construct_BST_From_Sorted_Array;

public class Solution {

/*	Binary Tree Node class 
 * 
 * 	class BinaryTreeNode<T> {
		T data;
		BinaryTreeNode<T> left;
		BinaryTreeNode<T> right;
		
		public BinaryTreeNode(T data) {
			this.data = data;
		}
	}
	*/
    
    public static BinaryTreeNode<Integer> SortedArrayToBST(int[] arr,int si,int ei)
    {
        
        if(si>ei)
        {
            return null;
        }
        int mid=(si+ei)/2;
        BinaryTreeNode<Integer> root=new  BinaryTreeNode<Integer>(arr[mid]);
        
        root.left=SortedArrayToBST(arr,si,mid-1);
        root.right=SortedArrayToBST(arr,mid+1,ei);
        
        return root;
        
        
    }

	public static BinaryTreeNode<Integer> SortedArrayToBST(int[] arr){
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
		*/
        
        return SortedArrayToBST(arr,0,arr.length-1);

	}
}	