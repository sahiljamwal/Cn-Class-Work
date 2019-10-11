package com.sahil.practise.ReverseOfANumber;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Write your code here
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int ans = 0;

		int no = n;
		int counter = 0;
		while (no > 0) {
			no /= 10;
			counter++;
		}

		int i = 0;
		while (i < counter) {
			int q = n / 10;
			int r = n % 10;
			ans += (r * Math.pow(10, counter - i - 1));
			n = q;
			i++;

		}
		System.out.println(ans);
		s.close();
	}
}
