package com.sahil.practise.RemoveCharacter;

import java.util.Scanner;

public class runner {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String input = s.nextLine();
		char c = s.next().charAt(0);
		System.out.println(solution.removeAllOccurrencesOfChar(input, c));
		s.close();
	}
}
