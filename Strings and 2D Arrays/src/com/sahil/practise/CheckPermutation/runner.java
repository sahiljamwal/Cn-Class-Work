package com.sahil.practise.CheckPermutation;

import java.util.Scanner;

public class runner {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String input1 = s.next();
		String input2 = s.next();
		System.out.println(solution.isPermutation(input1, input2));
		s.close();
	}
}
