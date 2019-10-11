package com.sahil.MinimumLengthWord;

import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		
		System.out.println(Solution.minLengthWord(str));
		s.close();
	}

}
