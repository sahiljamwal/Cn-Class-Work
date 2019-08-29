package com.sahil.practise.Pair_sum_in_a_BST;

import java.util.Arrays;
import java.util.ArrayList;
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

    private static ArrayList<Integer> arr=new ArrayList<Integer>();
    private static int index=0;
    
    
    public static void fillArray(BinaryTreeNode<Integer> root)
    {
        if(root == null)
            return;
       else
       {
            arr.add(index,root.data);
            index++;
            fillArray(root.left);
            fillArray(root.right);
            return;
         
       }
    }

	public static void printNodesSumToS(BinaryTreeNode<Integer> root, int s) {
		// Write your code here
        
        fillArray(root);
        
        int array[]=new int[arr.size()];
        for(int i=0;i<arr.size();i++)
        {
            array[i]=arr.get(i);
        }
        
        Arrays.sort(array);
        
        
        
        int start=0,end=array.length-1;
        while(start<end)
        //for(int i=0;i<array.length;i++)
        {
            
             if(array[start]+array[end]==s)
            {
                System.out.println(array[start]+" "+array[end]);
                start++;
                end--;
            }
            
            else if(array[start]+array[end]>s)
            {
                end--;
                
            }
            else
            {
                start++;
            }
        }

	}
}