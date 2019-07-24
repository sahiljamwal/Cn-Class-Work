package com.sahil.practise.Level_order_traversal;


public class Solution {

	/*
	 * Binary Tree Node class
	 * 
	 * class BinaryTreeNode<T> { T data; BinaryTreeNode<T> left;
	 * BinaryTreeNode<T> right;
	 * 
	 * public BinaryTreeNode(T data) { this.data = data; } }
	 */

	public static void printLevelWise(BinaryTreeNode<Integer> root) {

		// Write your code here

		QueueUsingLL<BinaryTreeNode<Integer>> pendingNodes = new QueueUsingLL<BinaryTreeNode<Integer>>();
		pendingNodes.enqueue(root);
		pendingNodes.enqueue(null);

		while (!pendingNodes.isEmpty()) {
			try {
				BinaryTreeNode<Integer> temp = pendingNodes.dequeue();

				//String result = "";

				if (temp == null) {
					if (!pendingNodes.isEmpty()) {
						pendingNodes.enqueue(null);
						System.out.println();
					}
				} else {
					if (temp.left != null) {
						//result += temp.left.data + " ";
						pendingNodes.enqueue(temp.left);
					}
					if (temp.right != null) {
						//result += temp.right.data + " ";
						pendingNodes.enqueue(temp.right);
					}
					if(temp==root)
						System.out.print(temp.data);
					else
						System.out.print(temp.data+" ");
				}

			} catch (QueueEmptyException e) {
				e.printStackTrace();
			}

		}

	}

}
