package com.sahil.CountWords;

public class Solution {

	public static int countWords(String str) {

		int space = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 32) {
				space++;
			}
		}

		return (space + 1);

	}

}
