package com.sahil.practise.Delete_every_N_nodes;


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
public class solution {
	public static LinkedListNode<Integer> skipMdeleteN(LinkedListNode<Integer> head, int M, int N) {
            
        LinkedListNode<Integer> temp=head;
        int flag=0,count=0;
        while(temp!=null)
        {
            while(count<M-1)
            {
                count++;
                if(temp.next!=null)
                    temp=temp.next;
                else
                {
                    flag=-1;
                    break;
                }
            }
            LinkedListNode<Integer> tempTail=temp;
            if(flag==0)
            {
                count=0;
            }
            else
            {
                tempTail.next=null;
                break;
            }
           
            while(count<N)
            {
                count++;
                if(temp.next!=null)
                    temp=temp.next;
                else
                {
                    flag=-1;
                    break;
                }
            }
            if(flag==0)
            {
                count=0;
                tempTail.next=null;
                tempTail.next=temp.next;
                temp=temp.next;
            }
            else
            {
                tempTail.next=null;
                break;
            }
            
            
        }
        return head;
        
	}
}
