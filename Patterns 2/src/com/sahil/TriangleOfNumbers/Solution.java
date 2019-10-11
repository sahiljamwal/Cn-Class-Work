package com.sahil.TriangleOfNumbers;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		
		int i=1;
		while(i<=n)
		{
			int space=1;
			while(space<=n-i)
			{
				System.out.print(" ");
				space++;
			}
			
			int j=1;
			int start=i;
			while(j<=i)
			{
				System.out.print(start);
				start++;
				j++;
			}
			
			int k=1;
			int temp=2*i-2;
			while(k<i)
			{
				System.out.print(temp);
				temp--;
				
				k++;
			}
			
			
			
			System.out.println();
			i++;
		}
		s.close();
	}
}
