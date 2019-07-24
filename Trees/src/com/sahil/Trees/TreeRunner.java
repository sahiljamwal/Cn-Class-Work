package com.sahil.Trees;

import java.util.Scanner;

public class TreeRunner {
	
	
	
	private static TreeNode<Integer> takeinput(Scanner s) {
		
		int n;
		System.out.println("Enter next node :");
		n=s.nextInt();
		TreeNode<Integer> root= new TreeNode<Integer>(n);
		
		System.out.println("Enter no. of children of "+n);
		int childCount=s.nextInt();
		
		for(int i=0;i<childCount;i++)
		{
			TreeNode<Integer> child=takeinput(s);
			root.children.add(child);
		}
		
		return root;
	}
	

	private static void print(TreeNode<Integer> root) {
		
		String s=root.data+":";
		for(int i=0;i<root.children.size();i++)
		{
			s+=root.children.get(i).data+",";
		}
		System.out.println(s);
		for(int i=0;i<root.children.size();i++)
		{
			print(root.children.get(i));
		}
		
	}


	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		TreeNode<Integer> root=takeinput(s);
		print(root);
		
		
		
		
//		TreeNode<Integer> root=new TreeNode<Integer>(4);
//		TreeNode<Integer> node1=new TreeNode<Integer>(2);
//		TreeNode<Integer> node2=new TreeNode<Integer>(3);
//		TreeNode<Integer> node3=new TreeNode<Integer>(5);
//		TreeNode<Integer> node4=new TreeNode<Integer>(6);
//		
//		root.children.add(node1);
//		root.children.add(node2);
//		root.children.add(node3);
//		node2.children.add(node4);
//		
 }



	
}
