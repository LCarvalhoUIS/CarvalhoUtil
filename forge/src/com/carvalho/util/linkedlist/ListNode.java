package com.carvalho.util.linkedlist;

public class ListNode {
	

	private ListNode next;
	private ListNode previous;
	private int data;
	
	
	public ListNode(){
		previous=null;
		next=null;
		data=0;
		
	}
	
	public ListNode(ListNode next){
		
		this.next=next;
		data=0;
			
		}
	
	
	public void setData(int data)
	{
		this.data=data;
	}
	public int getData()
	{
		return data;
	}
	
	public void setNext(ListNode next)
	{
		if(this.next!=null)
		{
		ListNode temp=next;
		next=this.next;
		this.next=temp;
		}
		else {
			this.next=next;
		}
		next.setPrevious(this);
		
	}

	
	public ListNode getNext()
	{
		return next;
	}
	
	public void setPrevious(ListNode previous)
	{
		if(this.previous!=null)
		{
		ListNode temp=previous;
		previous=this.previous;
		this.previous=temp;
		}
		else {
			this.previous=previous;
		}
		
	}

	
	public ListNode getPrevious()
	{
		return previous;
	}
	
	public ListNode getFirstInList()
	{
		ListNode First=null;
		if(this.previous!=null)
			First=getPrevious();
		return First;
	}
	
}
