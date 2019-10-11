package com.sahil.SpiralPrint;

public class Solution {

	public static void spiralPrint(int matrix[][]) {
		// Write your code here

		int n = matrix.length;
		int m = matrix[0].length;
		int rs = 0;
		int re = n - 1;
		int cs = 0;
		int ce = m - 1;
		int count = 0;
		while (count != (n * m)) {
			for (int j = cs; j <= ce; j++) {
				System.out.print(matrix[rs][j] + " ");
				count++;
			}
			rs++;

			for (int i = rs; i <= re; i++) {
				System.out.print(matrix[i][ce] + " ");
				count++;
			}
			ce--;

			for (int j = ce; j >= cs; j--) {
				System.out.print(matrix[re][j] + " ");
				count++;
			}
			re--;

			for (int i = re; i >= rs; i--) {
				System.out.print(matrix[i][cs] + " ");
				count++;
			}
			cs++;

		}

	}
}