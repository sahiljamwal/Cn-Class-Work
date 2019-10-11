package com.sahil.PrintAllSubstrings;

import java.util.Scanner;

public class Runner {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		Solution.printSubstrings(str);
		s.close();
	}

}
