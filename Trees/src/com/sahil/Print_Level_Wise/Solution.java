package com.sahil.Print_Level_Wise;

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
	
	
	
	public static void printLevelWise(TreeNode<Integer> root){
		/* Your class should be named Solution 
 		 * Don't write main(). 
		 * Don't read input, it is passed as function argument. 
		 * Print output and don't return it. 
		 * Taking input is handled automatically. 
         
		 */
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
}
