package Satck1;

import java.util.Stack;

public class Stack1 {
public static void main(String[] args) {
	Stack<Integer> l=new Stack<Integer>();
	l.push(10);
	l.push(20);
	l.push(30);
	l.push(40);
	System.out.println(l);
	System.out.println(l.peek());
	System.out.println(l.pop());
	System.out.println(l.pop());
	System.out.println(l.pop());
	System.out.println(l.pop());
	System.out.println(l);
	System.out.println(l.empty());
	System.out.println(l.search(10));
	
}
}
