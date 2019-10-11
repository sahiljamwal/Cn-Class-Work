package com.sahil.StarPattern;


import java.util.Scanner;

public class Solution {


	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		
		int i=1;
		while(i<=n)
		{
			//print space for ith row
			int space=1;
			while(space<=(n-i))
			{
				System.out.print(" ");
				space=space+1;
				
			}
			
			
			
			//print ith row
			int j=1;
			while(j<=i)
			{
				System.out.print("*");
				j=j+1;
			}
			
			int k=1;
			while(k<i)
			{
				System.out.print("*");
				k=k+1;
			}
			
			


			System.out.println();
			i=i+1;
		}
		s.close();
		
	}

}
