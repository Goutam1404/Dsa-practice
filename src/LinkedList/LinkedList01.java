package LinkedList;

public class LinkedList01 {
	class Node{
		int data;
		Node next;	
		
		 Node(int data) {
			this.data=data;
			this.next=null;
		}
	}
	
	static Node head;
	static Node tail;
	static int size=0;
	boolean isEmpty() {
		if(head==null) {
			return true;
		}
		return false;
	}
	
	void createList(int data) {
		Node newNode=new Node(data);
		if(!isEmpty()) {
			System.out.println("The linked list is already created");
			return;
		}
		head=tail=newNode;
		size++;
		System.out.println("LinkedList is created");
	}
	
	void addFirst(int data) {
		if(isEmpty()) {
			System.out.println("Create the list first");
			return ;
		}
		size++;
		Node newNode=new Node(data);
		if(head!=null) {
			newNode.next=head;
			head=newNode;
			System.out.println(data+" is added to the list");
			return;
		}
		System.out.println("The linked list is not created");
	}
	
	void addLast(int data) {
		if(isEmpty()) {
			System.out.println("Create the list first");
			return ;
		}
		size++;
		Node newNode=new Node(data);	
		if(tail!=null) {
			tail.next=newNode;
			tail =newNode;
			System.out.println("Data is added inside the list");
			return;
		}
		System.out.println("The linked list is not created");
	}
	
	void addMiddle(int data,int index) {
		if(isEmpty()) {
			System.out.println("Create the list first");
			return ;
		}
		if(index==0) {
			addFirst(data);
			return ;
		}
		size++;
		Node newNode=new Node(data);
		Node temp=head;
		int count=0;
		while(count<index-1) {
			temp=temp.next;
			count++;
		}
//		temp=temp.next;
		newNode.next=temp.next;
		temp.next=newNode;
		
	}
	
	void printList() {
		if(isEmpty()) {
			System.out.println("List is empty");
			return ;
		}
		Node temp=head;
		while(temp!=null) {
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
		System.out.println();
	}
	
	void removeFirst() {
		if(isEmpty()) {
			System.out.println("List is empty");
			return ;
		}
		if(size==1) {
			head=tail=null;
			size--;
			return ;
		}
		size--;
		head=head.next;
		System.out.println("Node deleted successfully");
	}

	void removeLast() {
		if(isEmpty()) {
			System.out.println("List is empty");
			return ;
		}
		if(size==1) {
			head=tail=null;
			size--;
			return ;
		}
		size--;
		Node temp=head;
		for(int i=0;i<size-2;i++) {
			temp=temp.next;
		}
		temp.next=null;
		tail=temp;
		System.out.println("Node deleted successfully");
	}
	
	//Iterative approach 0(n)
	void searchInList(int val) {
		if(isEmpty()) {
			System.out.println("List is not created");
			return ;
		}
		int count=0;
		Node temp=head;
		while(temp!=null) {
			if(temp.data==val) {
				 System.out.println("Value found at: "+count);
				 return ;
			}
			count++;
			temp=temp.next;
		}
		System.out.println("Not found the value");
	}
	
	void reverseList() {
		Node prev=null;
		Node curr=tail=head;
		Node temp;
		//null 1<- prev 2<- curr 3 temp 4->null
		while(curr!=null) {
			temp=curr.next;
			curr.next=prev;
			prev=curr;
			curr=temp;
		}
		head=prev;
	}
	
	//removing nth node from end
//	6,7,8,9,10 n=3 size-n=2
	void removeNthNode(int n) {
		int sz=size;
		if(sz==1) {
			removeFirst();
			return ;
		}
		int i=1;
		int find=sz-n; //n=3 find=2
		Node prev=head;
		while(i<find) { //i=2 find=2
			prev=prev.next;  //prev=7, 
			i++;
		}
		prev.next=prev.next.next;
		System.out.println("Node deleted from nth node");
	}
	
	public static void main(String[] args) {
	
		// TODO Auto-generated method stub
		LinkedList01 ll=new LinkedList01();
		ll.createList(5);
//		ll.addFirst(4);
//		ll.addFirst(3);
//		ll.addFirst(2);
		ll.printList();
//		ll.addFirst(1);
//		ll.addMiddle(6, 4);
//		System.out.println(ll.size);
//		ll.removeFirst();
//		ll.printList();
//		System.out.println(ll.size);
//		ll.reverseList();
		ll.removeNthNode(2);
		ll.printList();
		
		System.gc();
	}

}
