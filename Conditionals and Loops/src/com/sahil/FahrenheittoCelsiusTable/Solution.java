package com.sahil.FahrenheittoCelsiusTable;

import java.util.Scanner;
public class Solution {


	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
		int S=s.nextInt();
		int E=s.nextInt();
		int W=s.nextInt();
		
		int i=S;
		while(i<=E)
		{
			int f=i;
			int c=(int)((5.0/9)*(f-32));
			System.out.println(f+"\t"+c);
			i=i+W;
		}
		s.close();
	}

}
