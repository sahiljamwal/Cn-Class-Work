package com.sahil.practise.SecondLargestInArray;

import java.util.Arrays;

public class SecondLargest {

	public static int secondLargestElement(int[] arr) {

		Arrays.sort(arr);

		int n = arr.length;
		int flag = 0;

		int ans = -1;
		for (int i = n - 1; i > 0; i--) {
			if (arr[i] != arr[i - 1]) {
				ans = arr[i - 1];
				flag = 1;
				break;
			}

			else
				flag = -1;

		}

		if (arr.length <= 1 || flag == -1)
			return (-2147483648);

		else
			return (ans);

	}
}