package com.sahil.SumofEvenNumberstillN;

import java.util.Scanner;
public class Solution {


	public static void main(String[] args) {
		
	Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		
		int sum=0;
		
		int i=1;
		while(i<=n)
		{
			if(i%2==0)
			{
				sum+=i;
			}
			i=i+1;
		}
		System.out.println(sum);
		s.close();
	}
	

}
