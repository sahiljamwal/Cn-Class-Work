package com.sahil.ArrangeNumbersInArray;

import java.util.Scanner;

public class Runner {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int arr[] = Solution.arrange(n);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
			s.close();
		}
	}

}
