package com.sahil.Check_Palindrome_recursive;

import java.util.Scanner;

public class runner {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String input = s.nextLine();
		System.out.println(solution.isStringPalindrome(input));
	}
}
