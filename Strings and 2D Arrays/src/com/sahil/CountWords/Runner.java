package com.sahil.CountWords;

import java.util.Scanner;

public class Runner {

	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		String str = s.nextLine();
		System.out.println(Solution.countWords(str));
	}

}
