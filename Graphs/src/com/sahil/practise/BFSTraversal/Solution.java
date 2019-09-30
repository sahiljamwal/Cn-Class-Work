package com.sahil.practise.BFSTraversal;



import java.util.Scanner;





public class Solution {
	
	public static void print(int[][] edges)
	{
		boolean[] visited = new boolean[edges.length];
		for(int i=0;i<visited.length;i++)
		{
			if(!visited[i])
				printBFS(edges,0,visited);
		}
	}

	private static void printBFS(int[][] edges, int sv, boolean[] visited) {
		
		
		
		QueueUsingLL<Integer> queue=new QueueUsingLL<>();
		queue.enqueue(sv);
		visited[sv]=true;
		int n=edges.length;
		
		
		while(!queue.isEmpty())
		{
			int current;
			try {
				current = queue.dequeue();
			} catch (QueueEmptyException e) {
				return;
			}
			System.out.print(current+" ");
			for(int i=0;i<n;i++)
			{
				if(edges[current][i]==1 && !visited[i])
				{
					queue.enqueue(i);
                    visited[i]=true;
				}
			}
			
		}
		
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int e = s.nextInt();

		/* Write Your Code Here
		 * Complete the Rest of the Program
		 * You have to take input and print the output yourself
		 */
		int[][] edges=new int[n][n];
		for(int i=0;i<e;i++)
		{
			int fv=s.nextInt();
			int sv=s.nextInt();
			edges[fv][sv]=1;
			edges[sv][fv]=1;
		}
		print(edges);
		s.close();
		
	}
	
}	
	class QueueUsingLL <T>{
		
		Node<T> front;
		Node<T> rear;
		int size;
		
		public QueueUsingLL()
		{
			front=null;
			rear=null;
			size=0;
			
		}
		
		public void enqueue(T data) {

			Node<T> item=new Node<T>(data);
			item.next=null;
			
			if(size==0)
			{
				front=item;
				rear=item;
				
			}
			else
			{
				rear.next=item;
				rear=item;
				
			}
			size++;
		}

		public int size() {
			
			return size;
			

		}

		public boolean isEmpty() {
			
			if(size==0)
				return true;
			else
				return false;
			

		}

		public T dequeue() throws QueueEmptyException {
			
			Node<T> temp=front;
			
			if(size==0)
			{
				throw new QueueEmptyException();
			}
			else
			{
				front=front.next;
				size--;
			}
			return temp.data;
		}

		public T front() throws QueueEmptyException {

			if(size==0)
			{
				throw new QueueEmptyException();
			}
			
			return front.data;
		}

	}

	class QueueEmptyException extends Exception {
		private static final long serialVersionUID = 1L;
	}

	class Node <T>{

		T data;
		Node<T> next;
		
		public Node(T data)
		{
			this.data=data;
		}
		
	}
