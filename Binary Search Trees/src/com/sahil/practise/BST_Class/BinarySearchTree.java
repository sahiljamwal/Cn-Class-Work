package com.sahil.practise.BST_Class;

/***************
 * BinaryTreeNode class already given - 
 * 
class BinaryTreeNode<T> {
	T data;
	BinaryTreeNode<T> left;
	BinaryTreeNode<T> right;

	public BinaryTreeNode(T data) {
		this.data = data;
	}
}
***************/

/**************
 * Main function that we are using internally 
 * 
public static void main(String[] args) {
		BinarySearchTree bst = new BinarySearchTree();
		int choice, input;
		while(true) {
			choice = s.nextInt();
			switch(choice) {
				case 1 : 
					input = s.nextInt();
					bst.insertData(input);
					break;
				case 2 : 
					input = s.nextInt();
					bst.deleteData(input);
					break;
				case 3 : 
					input = s.nextInt();
					System.out.println(bst.search(input));
					break;
				default :
					bst.printTree();
					return;
			}

		}
*******************/

public class BinarySearchTree {
	// Complete this class
    
   private static BinaryTreeNode<Integer> root;
    
    public static void printTree()
    {
        
        prinTreeHelper(root);
        
    }
    
    private static void prinTreeHelper(BinaryTreeNode<Integer> root)
    {
        if(root==null)
			return;
		String toBePrinted=root.data+":";
		if(root.left!=null)
			toBePrinted+="L:"+root.left.data+",";
		if(root.right!=null)
			toBePrinted+="R:"+root.right.data;
		System.out.println(toBePrinted);
		prinTreeHelper(root.left);
		prinTreeHelper(root.right);
    }
    
 
    
    public static void deleteData(int data)
    {
       root= deleteDataHelper(data,root);
    }
    
    private static BinaryTreeNode<Integer> deleteDataHelper(int data, BinaryTreeNode<Integer> root)
    {
        if(root==null)
            return null;
       
        
        if(data>root.data)
        {
            root.right=deleteDataHelper(data,root.right);
            return root;
        }
        else if(data<root.data)
        {
            root.left=deleteDataHelper(data,root.left);
            return root;
        }
        else
        {
            if(root.left==null && root.right==null)
                return null;
            else if(root.left==null)
            {
                return root.right;
            }
            else if(root.right==null)
            {
                return root.left;
            }
            else
            {
                BinaryTreeNode<Integer> minNode=root.right;
                while(minNode.left!=null)
                {
                    minNode=minNode.left;
                }
                
                root.data=minNode.data;
                root.right=deleteDataHelper(minNode.data,root.right);
                return root;
                
            }
        }
      
    }
    
    public static void insertData(int data)
    {
        root=insertDataHelper(data,root);
    }
    
    private static BinaryTreeNode<Integer> insertDataHelper(int data, BinaryTreeNode<Integer> root)
    {
        if(root==null)
        {
            BinaryTreeNode<Integer> temp=new BinaryTreeNode<Integer> (data);
            return temp;
        }
        if(root!=null)
        {
            if(data>root.data)
            {
                root.right=insertDataHelper(data,root.right);
            }
            else
            {
                root.left=insertDataHelper(data,root.left);
            }
        }
        return root;
    }
    
    public static boolean search(int data)
    {
        return searchHelper(data,root);
        
    }
    
    private static boolean searchHelper(int data,BinaryTreeNode<Integer> root )
    {
        if(root==null)
            return false;
        if(root.data==data)
            return true;
        else if(data>root.data)
            return searchHelper(data,root.right);
        else
            return searchHelper(data,root.left);
    }
	
}
