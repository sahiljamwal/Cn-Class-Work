package com.sahil.GraphsImplementation;

import java.util.Scanner;

public class Graphs {
	
	public static void printHelper(int[][] edges,int sv,boolean[] visited)
	{
		System.out.println(sv);
		visited[sv]=true;
		int n=edges.length;
		
		for(int i=0;i<n;i++)
		{
			if(edges[sv][i]==1 && !visited[sv])
				printHelper(edges, i,visited);
		}
		
	}
	
	public static void print(int[][] edges)
	{
		boolean[] visited=new boolean[edges.length];
		for(int i=0;i<visited.length;i++)
		{
			if(!visited[i])
				printHelper(edges,i,visited);
		}
		
		
	}

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();	//no of vertices
		int e=s.nextInt();	//no of edges
		int[][] edges=new int[n][n];	//adjacency matrix
		for(int i=0;i<e;i++)
		{
			int fv=s.nextInt();
			int sv=s.nextInt();

			edges[sv][fv]=1;
		}
		print(edges);
		
		s.close();
		
	}
}
