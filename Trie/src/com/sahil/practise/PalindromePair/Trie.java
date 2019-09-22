package com.sahil.practise.PalindromePair;


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
	public int count;
	public Trie() {
		root = new TrieNode('\0');
	}

	private void add(TrieNode root, String word){
		if(word.length() == 0){
			if (!root.isTerminating) {
				root.isTerminating = true;
				return;
			}
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

	public boolean search(TrieNode root,String word)
    {
        boolean ans=false;
        if(word.length()==0)
        {
            ans=true;
            return ans;
        }
        
        int childIndex=word.charAt(0)-'a';
        TrieNode child=root.children[childIndex];
        if(child==null)
        {
            return ans;
        }
        ans = search(child,word.substring(1));
        
        return ans;
        
    }
    
	public boolean search(String word){
		// add your code here
        return search(root,word);
	}

	public boolean findPalindromePair(ArrayList<String> vect) {
		
		try{
            
            for(int i=0;i<vect.size();i++)
		{
			String word=vect.get(i);
			add(word);
		}
		
		for(int i=0;i<vect.size();i++)
		{
			String word=vect.get(i);
			String wordReverse="";
			for(int j=word.length()-1;j>=0;j--)
			{
				wordReverse+=word.charAt(j);
			}
			 if(search(wordReverse))
				 return true;
			for(int j=1;j<wordReverse.length()-1;j++)
			{
				if(search(wordReverse.substring(j)))
					return true;
			}
			
		}
		
		
            
            
        }
		catch(Exception e)
        {
            
        }
            
		return false;
		
	}

}


