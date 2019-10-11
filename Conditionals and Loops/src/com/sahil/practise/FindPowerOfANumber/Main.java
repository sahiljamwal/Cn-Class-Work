package com.sahil.practise.FindPowerOfANumber;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
			Scanner s=new Scanner(System.in);
		int x=s.nextInt();
		int n=s.nextInt();
		
		int mul=1;
		int i=1;
		while(i<=n)
		{
			mul=mul*x;
			i=i+1;
		}
		System.out.println(mul);
		s.close();
	}
}
