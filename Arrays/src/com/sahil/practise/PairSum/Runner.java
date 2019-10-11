package com.sahil.practise.PairSum;

import java.util.Scanner;

public class Runner {
	static Scanner s = new Scanner(System.in);

	public static int[] takeInput() {
		int size = s.nextInt();
		int arr[] = new int[size];
		for (int i = 0; i < size; i++) {
			arr[i] = s.nextInt();
		}
		return arr;
	}

	public static void main(String[] args) {
		int[] input = takeInput();
		int x = s.nextInt();
		Solution.pairSum(input, x);
	}
}