package com.sahil.practise.PalindromePair;

import java.util.ArrayList;
import java.util.Scanner;

public class Runner {

	static Scanner s = new Scanner(System.in);
	
	public static void main(String[] args) {
		int n = s.nextInt();
		ArrayList<String> input = new ArrayList<String>();
		for(int i = 0; i < n; i++) {
			String word = s.next();
			input.add(word);
		}
		Trie t = new Trie();
		System.out.println(t.findPalindromePair(input));
	}
}