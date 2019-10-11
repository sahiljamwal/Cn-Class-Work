package com.sahil.NumberStarPattern1;

import java.util.Scanner;

public class runner {

	public static void main(String[] args) {
		// Write your code here

		Scanner s = new Scanner(System.in);
		int n = s.nextInt();

		int i = 1;
		while (i <= n) {

			int j = n;
			while (j > 0) {
				if (i != j) {
					System.out.print(j);
					j--;
				} else {
					System.out.print("*");
					j--;
				}

			}

			System.out.println();
			i++;
		}

		s.close();

	}
}