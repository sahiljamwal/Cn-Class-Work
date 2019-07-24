package com.sahil.practise.Bubble_Sort_Iterative_LinkedList;


public class Solution {
    
    public static int getLength(LinkedListNode<Integer> head)
    {
        LinkedListNode<Integer> temp=head;
        int count=0;
        while(temp!=null)
        {
            temp=temp.next;
            count++;
        }
        return count;
    }



	public static LinkedListNode<Integer> bubbleSort(LinkedListNode<Integer> head )
	{
		//Write your code here
      
                LinkedListNode<Integer> previous=null;
                LinkedListNode<Integer> current=head;
        
    
            for(int i=0;i<getLength(head);i++)
            {
                previous=null;
                current=head;
                 while(current.next!=null)
            {
                      
                
                if(current.data>current.next.data)
                {
                    LinkedListNode<Integer> next=current.next;
                    if(previous==null)
                    {
                        current.next=next.next;
                        next.next=current;
                        previous=next;
                        head=previous;
                
                        
                    }    
                        
                    else
                    {
                        previous.next=current.next;
                        current.next=next.next;
                        next.next=current;
                        
                        previous=next;
                            
                    }
                    
                    //current=current.next;
                    
                            
                }
                else
                {
                    if(previous!=null)
                    {
                        current=current.next;
                        previous=previous.next;
                    }  
                    else
                    {
                        previous=current;
                        current=current.next;
                    }
                    
                }
            }
            }
           
        
        return head;
        
	}



}

