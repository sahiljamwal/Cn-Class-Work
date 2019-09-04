package com.sahil.Implementation;


public class Trie {

	private TrieNode root;
	
	public Trie()
	{
		root=new TrieNode('\0');
	}
	
	public void add(TrieNode root,String word)
	{
		if(word.length()==0)
		{
			root.isTerminating=true;
			return;
		}
		
		int childIndex=word.charAt(0)-'a';
		TrieNode child=root.children[childIndex];
		if(child==null)
		{
			child=new TrieNode(word.charAt(0));
			root.children[childIndex]=child;
			root.childCount++;
		}
		
		add(child,word.substring(1));
	}
	
	public void add(String word)
	{
		add(root,word);
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
	        return search(root,word);
		}

	public void remove(String word)
	{
		remove(root,word);
	}
	
	public void remove(TrieNode root,String word)
	{
		if(word.length()==0)
		{
			root.isTerminating=false;
			return;
		}
		int childIndex=word.charAt(0)-'a';
		TrieNode child = root.children[childIndex];
		if(child==null)
		{
			return;
		}
		
		remove(child,word.substring(1));
		
		if(!child.isTerminating && child.childCount==0)
		{
			root.children[childIndex]=null;
			child=null;
			root.childCount--;
		}
	}

}
