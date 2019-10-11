package com.sahil.ZerosAndStarsPattern;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {

		/*
		 * Read input as specified in the question. Print output as specified in
		 * the question.
		 */
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();

		int i = 1;
		while (i <= n) {
			int j = 1;
			while (j <= n) {
				if (i != j) {
					System.out.print("0");
					j++;
				} else {
					System.out.print("*");
					j++;
				}
			}

			System.out.print("*");

			j--;
			while (j >= 1) {
				if (i != j) {
					System.out.print("0");
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
