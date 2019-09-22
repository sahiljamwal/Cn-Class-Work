package com.sahil.practise.PatternMatching;

import java.util.ArrayList;
import java.util.Scanner;

public class Runner {

	static Scanner s = new Scanner(System.in);
	
	public static void main(String[] args) {
		Trie t = new Trie();
		int n = s.nextInt();
		ArrayList<String> input = new ArrayList<String>();
		for(int i = 0; i < n; i++) {
			String word = s.next();
			input.add(word);
		}
		String pattern = s.next();
		System.out.println(t.patternMatching(input, pattern));
	}
}