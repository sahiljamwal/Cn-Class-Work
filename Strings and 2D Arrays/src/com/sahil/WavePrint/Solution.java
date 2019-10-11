package com.sahil.WavePrint;

public class Solution {

	// input - input 2D array
	public static void wavePrint(int input[][]) {

		// Write your code here
		for (int j = 0; j < input[0].length; j++)

		{
			if (j % 2 == 0) {
				for (int i = 0; i < input.length; i++)

				{
					System.out.print(input[i][j] + " ");
				}
			}

			else {
				for (int i = input.length - 1; i >= 0; i--)

				{
					System.out.print(input[i][j] + " ");
				}
			}

		}

	}

}
