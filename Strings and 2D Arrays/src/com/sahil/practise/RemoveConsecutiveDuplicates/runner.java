package com.sahil.practise.RemoveConsecutiveDuplicates;

import java.util.Scanner;

public class runner {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String input = s.next();
		System.out.println(solution.removeConsecutiveDuplicates(input));
		s.close();
	}
}
