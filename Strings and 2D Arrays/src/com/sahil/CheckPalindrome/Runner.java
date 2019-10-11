package com.sahil.CheckPalindrome;

import java.util.Scanner;

public class Runner {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		System.out.println(Solution.checkPalindrome(str));
		s.close();
	}

}
