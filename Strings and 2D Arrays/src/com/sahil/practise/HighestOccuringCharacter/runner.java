package com.sahil.practise.HighestOccuringCharacter;

import java.util.Scanner;

public class runner {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String input = s.nextLine();
		System.out.println(solution.highestOccuringCharacter(input));
		s.close();
	}
}
