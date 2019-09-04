package com.sahil.Implementation;

public class Runner {

	public static void main(String[] args) {
		Trie tr=new Trie();
		tr.add("news");
		tr.add("this");
		
		System.out.println(tr.search("news"));
		tr.remove("news");
		System.out.println(tr.search("news"));
	}
	

}
