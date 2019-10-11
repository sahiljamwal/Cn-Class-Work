package com.sahil.FahrenheitToCelsiusTable;

import java.util.Scanner;

public class Runner{

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int start = s.nextInt();
		int end = s.nextInt();
		int step = s.nextInt();
		Solution.printFahrenheitTable(start, end, step);
		s.close();
	}
}