package com.sahil.Trees;

import java.util.Scanner;

public class TreeRunner1 {

	private static TreeNode<Integer> takeInput() throws QueueEmptyException {

		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		System.out.println("Enter root node :");
		int rootData = s.nextInt();
		TreeNode<Integer> root = new TreeNode<Integer>(rootData);
		QueueUsingLL<TreeNode<Integer>> pendingNodes = new QueueUsingLL<TreeNode<Integer>>();
		pendingNodes.enqueue(root);

		while (!pendingNodes.isEmpty()) {
			TreeNode<Integer> frontNode = pendingNodes.dequeue();
			System.out.println("Enter Num of children of " + frontNode.data);
			int numChild = s.nextInt();
			for (int i = 0; i < numChild; i++) {
				System.out.println("Enter " + (i + 1) + " th child of " + frontNode.data);
				int childNode = s.nextInt();
				TreeNode<Integer> child = new TreeNode<Integer>(childNode);
				frontNode.children.add(child);
				pendingNodes.enqueue(child);

			}

		}

		return root;

	}

	private static void print(TreeNode<Integer> root) {

		QueueUsingLL<TreeNode<Integer>> print = new QueueUsingLL<>();
		print.enqueue(root);
        print.enqueue(null);//this is the trick here
        

		while (!print.isEmpty()) {

			try {
				TreeNode<Integer> temp = print.dequeue();

				if (temp==null) {
					if(!print.isEmpty())
                    {
                        print.enqueue(null);
					    System.out.println();
                    }
					
				} else {
					for (int i = 0; i < temp.children.size(); i++) {
						TreeNode<Integer> nextNode = temp.children.get(i);
						print.enqueue(nextNode);

					}
                    if(temp==root)
					    System.out.print(temp.data);
                    else
                        System.out.print(temp.data + " ");
				}

			} catch (QueueEmptyException e) {
				e.printStackTrace();
			}

		}

	}

	public static void main(String[] args) throws QueueEmptyException {

		TreeNode<Integer> root = takeInput();
		print(root);
	}

}
