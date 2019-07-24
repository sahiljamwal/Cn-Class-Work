package com.sahil.practise.Level_wise_linkedlist;



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

	/* class Node<T> {
		T data;
		Node<T> next;
		Node(T data){
			this.data = data;
		}
	}
*/
	public static ArrayList<Node<BinaryTreeNode<Integer>>> LLForEachLevel(BinaryTreeNode<Integer> root) {
		
		QueueUsingLL<BinaryTreeNode<Integer>> pendingNodes=new QueueUsingLL<>();
		Node<BinaryTreeNode<Integer>> head=null;
		Node<BinaryTreeNode<Integer>> tail=null;
		pendingNodes.enqueue(root);
		pendingNodes.enqueue(null);
		ArrayList<Node<BinaryTreeNode<Integer>>> arr=new ArrayList<>();
		
		while(!pendingNodes.isEmpty())
		{
			try {
				BinaryTreeNode<Integer> current=pendingNodes.dequeue();
				
				if(current==null)
				{
					if(!pendingNodes.isEmpty())
					{
						arr.add(head);
						pendingNodes.enqueue(null);
						head=null;
						tail=null;
						
					}
				}
				else
				{
					if(current.left!=null)
					{
						pendingNodes.enqueue(current.left);
					}
					if(current.right!=null)
					{
						pendingNodes.enqueue(current.right);
					}
					Node<BinaryTreeNode<Integer>> item=new Node<>(current);
					if(head==null && tail==null)
					{
						head=item;
						tail=item;
						
					}
					else
					{
						tail.next=item;
						tail=item;
					}
					
					
				}
				
				
				
			} catch (QueueEmptyException e) {
				e.printStackTrace();
			}
			
		}
        
        arr.add(head);
		
		return arr;
        
        
        
	}


}

