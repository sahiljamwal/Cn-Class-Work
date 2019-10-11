package com.sahil.practise.BinaryToDecimal;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Write your code here
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();

		int no = n;
		int counter = 0;
		while (no > 0) {
			no /= 10;
			counter++;
		}

		int sum = 0;
		for (int i = 0; i < counter; i++) {
			int q = n / 10;
			int r = n % 10;
			sum += (r * (Math.pow(2, i)));
			n = q;

		}
		System.out.println(sum);
		s.close();
	}
}
