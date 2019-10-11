package com.sahil.practise.TermsOfAP;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Write your code here
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();

		int i = 1;
		while (i <= n) {
			int ans = 0;
			ans = ((3 * i) + 2);
			if (ans % 4 != 0) {
				System.out.print(ans + " ");
			}

			if (ans % 4 == 0) {
				n++;

			}

			i++;
		}
		s.close();
	}
}
