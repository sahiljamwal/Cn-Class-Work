package com.sahil.practise.Swap_two_Node_of_LL;




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
public class Solution {
	public static  LinkedListNode<Integer> swap_nodes(LinkedListNode<Integer> head,int i,int j){
        
        int count=0;
            LinkedListNode<Integer> p1=null;
            LinkedListNode<Integer> p2=null;
            LinkedListNode<Integer> c1=null;
            LinkedListNode<Integer> c2=null;
        LinkedListNode<Integer> temp=head;
        
        if((i==0 || j==0 )&& (Math.abs(i-j)!=1))
        {
            p1=c1=head;
            while(count<i-1 || count<j-1)
            {
                count++;
                head=head.next;
            }
            p2=head;
            c2=head.next;
                      
            LinkedListNode<Integer> temp1=c1.next;
            LinkedListNode<Integer> temp2=c2.next;
            p1.next=null;
            p2.next=null;
            
            
            c1.next=null;
            c2.next=null;
            
            temp=c2;
            c2.next=temp1;
            
            p2.next=c1;
            c1.next=temp2;
        
            return temp;
        }
        
        else if((i!=0&&j!=0) && Math.abs(i-j)==1)
        {
            while(count<i-1 && count<j-1)
            {
                count++;
                head=head.next;
            }
            p1=head;
            c1=head.next;
            p2=p1;
            c2=c1.next;
            
            
           
            
            c1.next=c2.next;
            c2.next=null;
            p1.next=c2;
            c2.next=c1;
            
            return temp;
            
            
        }
        
       else if((i==0||j==0) && (Math.abs(i-j)==1))
       {
           p1=head;
           p2=head;
           c1=head;
           c2=head.next;
           
     
           
           c1.next=null;
           c1.next=c2.next;
           c2.next=null;
           c2.next=c1;
           temp=c2;
           
           return temp;
       }
        
        else
        {
            while(count<i-1 && count<j-1)
            {
                count++;
                head=head.next;
            }
            p1=head;
            c1=head.next;
            
            while(count<i-1 || count<j-1)
            {
                count++;
                head=head.next;
            }
            p2=head;
            c2=head.next;
            
            p1.next=null;
            p2.next=null;
            LinkedListNode<Integer> temp1=c1.next;
            LinkedListNode<Integer> temp2=c2.next;
            c1.next=null;
            c2.next=null;
            
            p1.next=c2;
            c2.next=temp1;
            p2.next=c1;
            c1.next=temp2;
            
            
            return temp;
        }
        
      
        
        
		
	}
}