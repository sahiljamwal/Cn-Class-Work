package com.sahil.practise.CheckNumberSequence;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Write your code here

		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = s.nextInt();
		}
		int prev = arr[0];
		int flag = 0;
		boolean isDecreasing = true;

		for (int i = 1; i < arr.length; i++) {
			int current = arr[i];

			if (current == prev) {
				flag = -1;
				break;
			}

			else if (prev > current) {
				if (isDecreasing == true) {
					isDecreasing = true;
					flag = 0;
				} else {
					flag = -1;
					break;
				}
			}

			else if (prev < current) {
				if (isDecreasing == true) {
					isDecreasing = false;
					flag = 0;
				} else {
					isDecreasing = false;
					flag = 0;
				}
			}

			prev = arr[i];
		}

		if (flag == -1)
			System.out.println("false");
		else
			System.out.println("true");

		s.close();
	}

}
