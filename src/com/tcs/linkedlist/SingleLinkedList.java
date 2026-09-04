package com.tcs.linkedlist;

class Node
{
	int value;
	Node next;
}


public class SingleLinkedList {
	Node head,tail;
	public void creation(int data)
	{
		Node node = new Node();
		node.value = data;
		node.next = null;
		head = tail = node;
		System.out.print(node.value+" ");
	}
	
	public void insertion(int index,int data)
	{
		Node node = new Node();
		node.value=data;
		if(index == 0)
		{
			node.next=head;
			head=node;
		}
		else {
			node.next=null;
			tail=tail.next=node;
		}
	}
	
	public void traverse()
	{
		System.out.println("*****Forward Traverse*****");
		Node temp=head;
		while (temp!=null) {
			System.out.print(temp.value+" ");
			temp=temp.next;
		}
	}
	
	public void reverseTraverse()
	{
		Node temp=reverse();
		while (temp!=null) {
			System.out.print(temp.value+" ");
			temp=temp.next;
		}
	}
	
	public Node reverse()
	{
		Node prev=null, mid=null,cn=head; 
		while(cn!=null)
		{
			prev=mid;
			mid=cn;
			cn=cn.next;
			mid.next=prev;
		}
		return mid;
	}
	
	public void searching(int searchValue)
	{
		System.out.println("*****Searching*****");
		Node temp=head;
		while(temp!=null)
		{
			if(temp.value==searchValue)
			{
				System.out.println("Element found");
				return;
			}
			temp = temp.next;
		}
		System.out.println("Element not found");
	}
	
	public static void main(String[] args) {
		SingleLinkedList linkedList = new SingleLinkedList();
		linkedList.creation(10);
		linkedList.insertion(1, 20);
		linkedList.insertion(2, 30);
		linkedList.insertion(3, 40);
		linkedList.insertion(5, 50);
		
		linkedList.traverse();
		
		System.out.println("\n******Reverse Traverse*****");
		linkedList.reverseTraverse();
		
		linkedList.searching(50);
	}
}
