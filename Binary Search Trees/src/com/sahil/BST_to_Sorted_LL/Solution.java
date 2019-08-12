package com.sahil.BST_to_Sorted_LL;

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

/* LinkedList Node Class
*
*	
class LinkedListNode<T> {
	T data;
	LinkedListNode<T> next;
	
	public LinkedListNode(T data) {
		this.data = data;
	}
}
*/

	public static LinkedListNode<Integer> BSTToSortedLL(BinaryTreeNode<Integer> root){
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
		*/
		if(root==null)
        {
            LinkedListNode<Integer> head=null;
            
            return head;
            
        }
        
        LinkedListNode<Integer> leftHead=BSTToSortedLL(root.left);
        LinkedListNode<Integer> rootNode=new LinkedListNode<Integer>(root.data);
        LinkedListNode<Integer> rightHead=BSTToSortedLL(root.right);
        
        if(leftHead!=null)
        {
            LinkedListNode<Integer> temp=leftHead;
            while(temp.next!=null)
            {
                temp=temp.next;
            }
            temp.next=rootNode;
        }
        
        rootNode.next=rightHead;
        
        if(leftHead!=null)
            return leftHead;
        else
            return rootNode;
	}
}	