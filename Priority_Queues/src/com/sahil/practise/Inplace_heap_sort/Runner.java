package com.sahil.practise.Inplace_heap_sort;

import java.util.Scanner;

public class Runner {

	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		int n = s.nextInt();
		int input[] = new int[n];
		for(int j = 0; j < n; j++) {
			input[j] = s.nextInt();
		}
		Solution.inplaceHeapSort(input);
		for(int i : input) {
			System.out.print(i + " ");
		}
	}
}