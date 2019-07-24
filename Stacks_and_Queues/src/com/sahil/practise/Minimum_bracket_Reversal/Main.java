package com.sahil.practise.Minimum_bracket_Reversal;


import java.util.Scanner;



public class Main {

	static Scanner s = new Scanner(System.in);
	public static void main(String[] args) {

		String str = s.nextLine();
		System.out.println(Solution.countBracketReversals(str));

	}

}
