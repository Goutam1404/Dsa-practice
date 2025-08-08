package Stack;
import java.util.*;
public class stack02 {
	//pushing the element at bottom
	static void pushBottom(Stack<Integer> st,int data) {
		if(st.isEmpty()) {
		 st.push(data);
		 return;
		}
		int top=st.pop();
		pushBottom(st,data);
		 st.push(top);
		}
	
	//reversing the string using stack
	static String reverseString(String s) {
		Stack<Character> st=new Stack<>();
		int i=0;
		while(i<s.length()) {
			st.push(s.charAt(i));
			i++;
		}
		StringBuilder sb=new StringBuilder();
		while(!st.isEmpty()) {
			sb.append(st.pop());
		}
		return sb.toString();
	}
	
	//valid parentheses
	static boolean isValid(String str) {
		Stack<Character> check=new Stack<>();
		for(char c:str.toCharArray()) {
			if(c=='{' || c=='(' || c=='[') {
				check.push(c);
			}			
			else {
				if(check.isEmpty()) return false;
				char ch=check.peek();
				if(c=='}' && ch=='{' || c==')'&& ch=='(' || c==']' && ch=='[') {
						check.pop();
						continue;
				}
				return false;
			  }
		}
		return true;
	}
	
	public static void main(String args[]) {
		Stack<Integer> st=new Stack<>();
		st.push(1);
		st.push(2);
		st.push(3);
		st.push(4);
		st.push(5);
		System.out.println(st.isEmpty());	
		pushBottom(st, 6);
		while(!st.isEmpty()) {
			System.out.println(st.pop());
		}
		System.out.println(reverseString("hello"));
		System.out.println(isValid("()")); //true
		System.out.println(isValid("()[]{}"));//true
		System.out.println(isValid("([)]")); //false
	}
}
