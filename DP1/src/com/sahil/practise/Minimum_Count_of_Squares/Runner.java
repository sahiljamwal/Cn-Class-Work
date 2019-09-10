package com.sahil.practise.Minimum_Count_of_Squares;

import java.util.Scanner;

public class Runner {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		System.out.println(Solution.minCount(n));
		s.close();
	}
}