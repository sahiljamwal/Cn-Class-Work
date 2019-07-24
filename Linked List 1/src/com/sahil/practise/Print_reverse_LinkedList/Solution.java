package com.sahil.practise.Print_reverse_LinkedList;


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
	public static void printReverseRecursive(LinkedListNode<Integer> root)
    {
        LinkedListNode<Integer> temp=root;
        ArrayList<Integer> arr=new ArrayList<Integer>();
        while(temp!=null)
        {
            arr.add(temp.data);
            temp=temp.next;
        }
        for(int i=arr.size()-1;i>=0;i--)
        {
            System.out.print(arr.get(i)+" ");
        }
        
    }
}
