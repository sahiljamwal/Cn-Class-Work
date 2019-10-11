package com.sahil.practise.SumOfEvenOdd;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		
		int no=n;
		int counter=0;
		while(no>0)
		{
			no=no/10;
			counter++;
		}
		
		int sum_even=0;
		int sum_odd=0;
		
		int i=1;
		while(i<=counter)
		{
			int q=n/10;
			int r=n%10;
			
			if(r%2==0)
				sum_even+=r;
			else
				sum_odd+=r;
			
			n=q;
			i=i+1;
		}
		System.out.println(sum_even+" "+sum_odd);
		
		s.close();
	}
}
