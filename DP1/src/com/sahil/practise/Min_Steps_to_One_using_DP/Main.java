package com.sahil.practise.Min_Steps_to_One_using_DP;

import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		System.out.println(SolutionM.countStepsTo1(n));
		s.close();
	}

}
