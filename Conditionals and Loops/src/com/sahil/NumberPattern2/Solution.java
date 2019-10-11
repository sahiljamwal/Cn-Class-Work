package com.sahil.NumberPattern2;

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
			while(space<=n-i)
			{
				System.out.print(" ");
				space=space+1;
			}
			
			//print ith row
			int j=1;
			while(j<=i)
			{
				System.out.print(j+(i-1));
				j=j+1;
			}
			
			System.out.println();//end of ith row
			i=i+1;
		}
		s.close();
	}

}
