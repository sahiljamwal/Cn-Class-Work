package com.sahil.practise.Count_Words_in_Trie;

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
				case 3 : 
					word = s.next();
					t.remove(word);
					break;
				case 4 : 
					System.out.println(t.countWords());
					break;
				default :
						return;
			}
			choice = s.nextInt();
		}
	}

}