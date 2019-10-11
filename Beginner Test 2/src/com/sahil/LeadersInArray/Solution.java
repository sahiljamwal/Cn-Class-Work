package com.sahil.LeadersInArray;

public class Solution {

	public static void leaders(int[] input) {
		/*
		 * Your class should be named Solution Don't write main(). Don't read
		 * input, it is passed as function argument. Print output and don't
		 * return it. Taking input is handled automatically.
		 */

		int ans[] = new int[input.length];
		int flag = 0;
		int index = 0;

		for (int i = 0; i < input.length; i++) {
			for (int j = i + 1; j < input.length; j++) {

				if (input[i] >= input[j]) {
					flag = -1;
				} else {
					flag = 0;
					break;
				}

			}
			if (flag == -1 || input.length == 1 || i == input.length - 1) {
				ans[index] = input[i];
				index++;
				System.out.print(ans[index - 1] + " ");
			}

		}

	}

}
