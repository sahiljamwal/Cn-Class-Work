package com.sahil.PrintAllSubstrings;

public class Solution {

	public static void printSubstrings(String str) {

		for (int i = 0; i < str.length(); i++) {
			System.out.println(str.charAt(i));
			for (int j = i + 1; j < str.length(); j++) {
				System.out.print(str.substring(i, j + 1));
				System.out.println();
			}
		}
	}

}