package com.sahil.practise.HighestOccuringCharacter;

//highest occurring character in the String.
public class solution {

	public static char highestOccuringCharacter(String inputString) {
		// Write your code here

		int n = inputString.length();
		char ch[] = inputString.toCharArray();
		int c[] = new int[n];
		char c1[] = new char[n];
		int k = 0;
		int count = 1;

		for (int i = 0; i < n - 1; i++) {
			count = 1;
			for (int j = i + 1; j < n; j++) {
				if (ch[i] == ch[j] && ch[j] != 'A') {
					count++;
					ch[j] = 'A';
					c[k] = count;
					c1[k] = ch[i];

				}

			}

			k++;

		}
		for (int i = 0; i < k; i++) {
			if (c[0] < c[i]) {
				c[0] = c[i];
				c1[0] = c1[i];
			}

		}

		return c1[0];
	}
}
