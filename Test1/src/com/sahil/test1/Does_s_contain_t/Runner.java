package com.sahil.test1.Does_s_contain_t;

import java.util.Scanner;

public class Runner {
	public static void main(String[] args) {
		String a, b;
		Scanner s = new Scanner(System.in);
		a = s.nextLine();
		b = s.nextLine();
		System.out.print(Solution.checkSequence(a,b));
		s.close();
	}
}