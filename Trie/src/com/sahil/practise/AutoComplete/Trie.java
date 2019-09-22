package com.sahil.practise.AutoComplete;

import java.util.ArrayList;



class TrieNode{
	char data;
	boolean isTerminating;
	TrieNode children[];
	int childCount;

	public TrieNode(char data) {
		this.data = data;
		isTerminating = false;
		children = new TrieNode[26];
		childCount = 0;
	}
}

public class Trie {
	private TrieNode root;
	
	public Trie() {
		root = new TrieNode('\0');
	}

	private void add(TrieNode root, String word){
		if(word.length() == 0){
			root.isTerminating = true;
			return;
		}		
		int childIndex = word.charAt(0) - 'a';
		TrieNode child = root.children[childIndex];
		if(child == null){
			child = new TrieNode(word.charAt(0));
			root.children[childIndex] = child;
			root.childCount++;
		}
		add(child, word.substring(1));
	}

	public void add(String word){
		add(root, word);
	}
	
	private void searchHelper(TrieNode root,String word,String ans)
    {
      try
      {
      if(word.length()==0)
      {
        if(root.isTerminating == true)
        {
          System.out.println(ans);
        }
        for(int i=0;i<26;i++)
        {
          TrieNode temp=root.children[i];
          if(temp !=null)
          {
            searchHelper(temp,word,ans+temp.data);
          }
        }
      }
      int childIndex=word.charAt(0)-'a';
      TrieNode child=root.children[childIndex];
      if(child == null)
      {
        return ;
      }
      ans=ans+word.charAt(0);
      searchHelper(child,word.substring(1),ans);

    }
      catch(Exception e)
      {
        
      }
    }

    public void  search(String word)
    {
      searchHelper(root,word,"");
    }
	
	public void autoComplete(ArrayList<String> input, String word) {
		
		for(int i=0;i<input.size();i++)
		{
			String temp=input.get(i);
			add(temp);
		}
		
		search(word);
		
		
	}
}