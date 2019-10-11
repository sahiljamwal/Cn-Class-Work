package com.sahil.NthFibonacciNumber;

import java.util.Scanner;

public class Solution {


	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		
		int first=0;
		int second=1;
		int third;
		int []term=new int[1000];
		term[0]=first;
		term[1]=second;
		
		for(int i=3;i<=n+1;i++)
		{
			third=first+second;
			term[i-1]=third;
			first=second;
			second=third;
		}
		System.out.println(term[n]);
		s.close();
	}

}
