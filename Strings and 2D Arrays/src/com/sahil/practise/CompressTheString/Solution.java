package com.sahil.practise.CompressTheString;

public class Solution {

	public static String compress(String inputString) {
		// Write your code here
		String ans = "";
		ans += inputString.charAt(0);
		int count = 1;
		for (int i = 1; i < inputString.length(); i++) {
			if (inputString.charAt(i) == inputString.charAt(i - 1) && i == inputString.length() - 1) {
				count++;
				ans = ans + (char) (count + 48);
				break;
			}

			else if (inputString.charAt(i) == inputString.charAt(i - 1)) {
				count++;
			} else if (inputString.charAt(i) != inputString.charAt(i - 1)) {

				if (count > 1) {
					ans = ans + (char) (count + 48);
					count = 1;
					ans = ans + inputString.charAt(i);
				} else if (count == 1) {
					ans = ans + inputString.charAt(i);

				}

			}
		}

		return ans;

	}

}
