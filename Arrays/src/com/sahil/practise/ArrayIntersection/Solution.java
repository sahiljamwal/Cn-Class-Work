package com.sahil.practise.ArrayIntersection;

public class Solution {

	public static void intersections(int[] input1, int[] input2) {

		for (int i = 0; i < input1.length; i++) {
			for (int j = 0; j < input2.length; j++) {
				if (input2[j] == input1[i]) {

					System.out.println(input1[i]);
					input2[j] = -9999999;

					break;
				}
			}
		}
	}
}