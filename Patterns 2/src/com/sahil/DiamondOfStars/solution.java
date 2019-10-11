package com.sahil.DiamondOfStars;

public class solution {

	public static void print(int n) {
		// Write your code here

		int n1 = (n + 1) / 2;
		int n2 = n1 - 1;

		int i = 1;
		while (i <= n1) {
			int space = 1;
			while (space <= n1 - i) {
				System.out.print(" ");
				space++;
			}

			int j = 1;
			while (j <= i) {
				System.out.print("*");
				j++;
			}

			int k = 1;
			while (k <= i - 1) {
				System.out.print("*");
				k++;
			}

			System.out.println();
			i++;
		}

		i = n2;
		while (i >= 1) {
			int space = 1;
			while (space <= (n2 - i + 1)) {
				System.out.print(" ");
				space++;
			}

			int j = 1;
			while (j <= i) {
				System.out.print("*");
				j++;
			}

			int k = 1;
			while (k <= (i - 1)) {
				System.out.print("*");
				k++;
			}

			System.out.println();
			i--;
		}
	}

}
