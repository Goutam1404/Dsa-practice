package LinkedList;

import LinkedList.LinkedList01.Node;

//** DOUBLY LINKED LIST

public class LinkedList02 {
	class Node{
		int data;
		Node next;	
		Node prev;	
		
		 Node(int data) {
			 this.prev=null;
			this.data=data;
			this.next=null;
		}
	}
	
	static Node head;
	static Node tail;
	static int size=0;
	
	void createList(int data) {
		Node newNode=new Node(data);
		if(head==null) {
		head=tail=newNode;
		size++;
		System.out.println("LinkedList created");
		}
		return ;
	}
	
	void addFirst(int data) {
		if(head==null) {
			createList(data);
			return;
		}
		size++;
		Node newNode=new Node(data);
		newNode.next=head;
		head.prev=newNode;
		newNode.prev=null;
		head=newNode;
		System.out.println(data+" is added to the list");
	}
	
	void addLast(int data) {
		if(head==null) {
			createList(data);
			return;
		}
		size++;
		Node newNode=new Node(data);		
			tail.next=newNode;
			newNode.prev=tail;
			tail =newNode;
			System.out.println(data+" is added to the list");
	}
	
	void printList() {
		if(head==null) {
			System.out.println("List not created!!!");
			return ;
		}
		
		Node temp=head;
		while(temp!=null) {
			System.out.print(temp.data+"<=>");
			temp=temp.next;
		}
		System.out.print("null");
		System.out.println();
	}

	void removeFirst() {
		if(head==null) {
			System.out.println("List not created!!!");
			return ;
		}
		int data=head.data;
		head=head.next;
		head.prev=null;
		System.out.println(data+" is removed.");
	}
	
	void removeLast() {
		if(head==null) {
			System.out.println("List not created!!!");
			return ;
		}
		int data=tail.data;
		tail=tail.prev;
		tail.next=null;
		System.out.println(data+" is removed.");
	}
	
	void reverseList() {
		if(head==null) {
			System.out.println("List not created!!!");
			return ;
		}
		if(head.next==null) return ;
		
		Node prev=null;
		Node curr=head;
		Node temp;
		while(curr!=null) {
			temp=curr.next;
			curr.next=prev;
			curr.prev=temp;
			prev=curr;
			curr=temp;
		}
		head=prev;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList02 ll=new LinkedList02();
		ll.createList(5);
		ll.addFirst(4);
		ll.addFirst(3);
		ll.addFirst(2);
		ll.addLast(6);
		ll.addLast(7);
		ll.removeFirst(); 
		ll.removeLast();
		ll.printList();
		ll.reverseList();
		ll.printList();
	}

}
