package Stack;
import java.util.*;
public class Stack01 {
	//Implementing stack using arraylist
	static class Stack{
		List<Integer> arr=new ArrayList<>();
		
		boolean isEmpty() {
			return arr.size()==0;
		}
		
		void push(int data) {
			arr.add(data);
		}
		
		void pop() {
			if(isEmpty()) {
				System.out.println("Stack is empty");
				return ;
			}
			arr.remove(arr.size()-1);
		}
		
		int peek() {
			if(isEmpty()) {
				System.out.println("Stack is empty");
				return -1;
			}
			return arr.get(arr.size()-1);
		}
	
	}

	//Implementing stack using Linked list
	static class Node{
		int data;
		Node next;
		Node(int data){
			this.data=data;
			this.next=null;
		}
	}
	
	static class StackLL{
		Node head=null;
		boolean isEmpty() {
			return head==null;
		}
		
		void push(int data) {
			Node newNode=new Node(data);
			if(isEmpty()) {
				head=newNode;
				return ;
			}
			newNode.next=head;
			head=newNode;		
		}
		
		void pop() {
			if(isEmpty()) {
				head=null;
				return ;
			}
			head=head.next;
		}
		
		int peek() {
			if(isEmpty()) {
				return -1;
			}
			return head.data;
		}
	}
	
	
	public static void main(String[] args) {
		//Implementing stack using arraylist
		
//		Stack st1=new Stack();
//		System.out.println(st1.isEmpty());
//		st1.push(4);
//		st1.push(3);
//		st1.push(2);
//		while(!st1.isEmpty()) {			
//			System.out.println(st1.peek());
//			st1.pop();
//		}
//		System.out.println(st1.isEmpty());
		
		//Implementing stack using Linked list
		StackLL st2=new StackLL();
		System.out.println(st2.isEmpty());
		st2.push(4);
		st2.push(3);
		st2.push(2);
		while(!st2.isEmpty()) {			
			System.out.println(st2.peek());
			st2.pop();
		}
		System.out.println(st2.isEmpty());
		
		//Implementing stack using stack framework
//		Stack<Integer> s=new Stack<>();
//		System.out.println(s.isEmpty());
//		s.push(4);
//		s.push(3);
//		s.push(2);
//		while(!s.isEmpty()) {			
//			System.out.println(s.peek());
//			s.pop();
//		}
//		System.out.println(s.isEmpty());
	}

}
