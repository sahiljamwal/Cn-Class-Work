package com.sahil.Check_Number_in_Array;

import java.util.Scanner;

public class Runner {

	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		int n = s.nextInt();
		int input[] = new int[n];
		for(int i = 0; i < n; i++) {
			input[i] = s.nextInt();
		}
		int x = s.nextInt();
		System.out.println(Solution.checkNumber(input, x));
	}
}
