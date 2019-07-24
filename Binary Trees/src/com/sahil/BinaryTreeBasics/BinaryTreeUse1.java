package com.sahil.BinaryTreeBasics;

import java.util.Scanner;


public class BinaryTreeUse1 {
	
	public static BinaryTreeNode<Integer> takeInputLevelwise() throws QueueEmptyException
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Root data:");
		int rootData=s.nextInt();
		if(rootData==-1)
		{
			s.close();
			return  null;
		}
			
		BinaryTreeNode<Integer> root=new BinaryTreeNode<>(rootData);
		QueueUsingLL<BinaryTreeNode<Integer>> pendingNodes=new QueueUsingLL<>();
		pendingNodes.enqueue(root);
		
		while(!pendingNodes.isEmpty())
		{
			
				BinaryTreeNode<Integer> front=pendingNodes.dequeue();
			
			System.out.println("Enter Left child of "+front.data);
			int leftChild=s.nextInt();
			if(leftChild!=-1)
			{
				BinaryTreeNode<Integer> child=new BinaryTreeNode<Integer>(leftChild);
				front.left=child;
				pendingNodes.enqueue(child);
				
			}
			System.out.println("Enter Right child of "+front.data);
			int rightChild=s.nextInt();
			if(rightChild!=-1)
			{
				BinaryTreeNode<Integer> child=new BinaryTreeNode<Integer>(rightChild);
				front.right=child;
				pendingNodes.enqueue(child);
				
			}
			
		}
		s.close();
		return root;
		
	}
	

	public static void printLevelWise(BinaryTreeNode<Integer> root) {
		
		if(root==null)
			return ;
		QueueUsingLL<BinaryTreeNode<Integer>> pendingNodes=new QueueUsingLL<>();
		pendingNodes.enqueue(root);
		
		while(!pendingNodes.isEmpty())
		{
				BinaryTreeNode<Integer> front;
				try {
					front = pendingNodes.dequeue();
					String tobePrinted="";
					tobePrinted+=front.data+":";
					
					if(front.left==null)
					{
						tobePrinted+="L:"+"-1"+",";
					}
					else
					{
						tobePrinted+="L:"+front.left.data+",";
						pendingNodes.enqueue(front.left);
					}
					if(front.right==null)
					{
						tobePrinted+="R:"+"-1";
						
					}
					else
					{
						tobePrinted+="R:"+front.right.data;
						pendingNodes.enqueue(front.right);
					}
						System.out.println(tobePrinted);
		
				} catch (QueueEmptyException e) {
					e.printStackTrace();
				}
				
							
				
		}
		
	}
	public static int countNodes(BinaryTreeNode<Integer> root) {

		if(root==null)
			return 0;
		int count=1;
		count+=countNodes(root.left);
		count+=countNodes(root.right);
		
		return count;
	
	}
	
	public static int height(BinaryTreeNode<Integer> root) {
		/* Your class should be named Solution
		* Don't write main().
		* Don't read input, it is passed as function argument.
		* Return output and don't print it.
		* Taking input and printing output is handled automatically.
		*/
		int height=1;
        if(root==null)
        {
            height=0;
            return height;    
        }
        
        int tempLeftHeight=0,tempRightHeight=0;;
        tempLeftHeight+=height(root.left);
        tempRightHeight+=height(root.right);
        if(tempLeftHeight>=tempRightHeight)
        {
            height+=tempLeftHeight;
            return height;
        }   
        else
        {
            height+=tempRightHeight;
            return height;
            
        }
        
            
        
	}
	
	public static void main(String[] args) throws QueueEmptyException {
		
		BinaryTreeNode<Integer> root=takeInputLevelwise();
		printLevelWise(root);
		System.out.println("No of nodes id :"+countNodes(root));
		System.out.println("Height of Tree is :"+height(root));
		
	}










}
