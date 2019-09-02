package com.sahil.practise.Buy_the_ticket;

import java.util.Scanner;

public class Runner {

	static Scanner s = new Scanner(System.in);
	
	public static void main(String[] args) {
		int n = s.nextInt();
		int input[] = new int[n];
		for(int i = 0; i < n; i++) {
			input[i] = s.nextInt();
		}
		int k = s.nextInt();
		System.out.println(Solution.buyTicket(input, k));
	}

}