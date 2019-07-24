package com.sahil.practise.Balanced_Parenthesis;

import java.util.Scanner;

public class Main {

	static Scanner s = new Scanner(System.in);
	
	public static void main(String[] args) {
		String input = s.nextLine();
		System.out.println(Solution.checkBalanced(input));
	}
}