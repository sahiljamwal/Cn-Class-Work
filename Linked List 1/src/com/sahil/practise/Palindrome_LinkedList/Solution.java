package com.sahil.practise.Palindrome_LinkedList;


/*
class LinkedListNode<T> {
	public T data;
	public LinkedListNode<T> next;

	public LinkedListNode(T data) {
		this.setData(data);
		this.next = null;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

}
* */
import java.util.ArrayList;
public class Solution {
	public static boolean isPalindrome_2(LinkedListNode<Integer> head) 
    {
        LinkedListNode<Integer> temp=head;
        ArrayList<Integer> arr1=new ArrayList<Integer>();
        ArrayList<Integer> arr2=new ArrayList<Integer>();
        while(temp!=null)
        {
            arr1.add(temp.data);
            temp=temp.next;
        }
        for(int i=arr1.size()-1;i>=0;i--)
        {
            arr2.add(arr1.get(i));
        }
        
        int flag=0;
        for(int i=0;i<arr1.size();i++)
        {
            if(arr1.get(i)==arr2.get(i))
            {
                flag=0;
            }
            else 
            {
                flag=-1;
                break;
            }
        }
        if(flag==0)
            return true;
        else
            return false;
        
    }
}