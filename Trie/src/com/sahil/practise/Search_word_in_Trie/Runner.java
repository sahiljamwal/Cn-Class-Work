package com.sahil.practise.Search_word_in_Trie;

import java.util.Scanner;

public class Runner {

	static Scanner s = new Scanner(System.in);
	
	public static void main(String[] args) {
		Trie t = new Trie();
		int choice = s.nextInt();
		
		while(choice != -1) {
			String word;
			switch(choice) {
				case 1 : // insert
					word = s.next();
					t.add(word);
					break;
				case 2 : // search
					word = s.next();
					System.out.println(t.search(word));
					break;
				default :
						return;
			}
			choice = s.nextInt();
		}
	}

}