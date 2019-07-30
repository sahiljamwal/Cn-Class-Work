package com.sahil.test1.Split_Array;

import java.util.Scanner;


public class runner {

	static Scanner s = new Scanner(System.in);
	
	public static void main(String[] args) {
		int n = s.nextInt();
		int input[] = new int[n];
		for(int i = 0; i < n; i++) {
			input[i] = s.nextInt();
		}
		System.out.println(solution.splitArray(input));
	}
}
