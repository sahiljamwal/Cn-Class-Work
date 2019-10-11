package com.sahil.practise.RemoveConsecutiveDuplicates;

public class solution {

	public static String removeConsecutiveDuplicates(String input) {

		String ans = "";

		ans += input.charAt(0);

		int index = 0;
		for (int i = 1; i < input.length(); i++) {

			if (ans.charAt(index) != input.charAt(i)) {
				index++;
				ans += input.charAt(i);

			}

		}
		return ans;

	}
}
