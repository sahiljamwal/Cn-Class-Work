package com.sahil.test1.Maximum_Profit_on_App;

import java.util.Scanner;

public class runner {
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int input[] = new int[n];
		for(int i=0;i<n;i++)
			input[i] = s.nextInt();
		
		System.out.println(solution.maximumProfit(input));
	}

}
