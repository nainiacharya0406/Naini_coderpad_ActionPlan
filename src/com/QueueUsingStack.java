package com;

import java.util.Stack;

public class QueueUsingStack {
	static class Queue { 
        Stack<Integer> stack1; 
    } 
	

	public static void main(String[] args) {
		Queue q = new Queue();
		q.stack1 = new Stack<Integer>();
		enQueue(q, 1); 
        enQueue(q, 2); 
        enQueue(q, 3); 
        print(q);
        System.out.println("popped element: "+deQueue(q) + " "); 
        System.out.println("popped element: "+deQueue(q) + " "); 
        System.out.println("popped element: "+deQueue(q) + " "); 
		

	}


	private static void print(Queue q) {
		for(int i =0; i< q.stack1.size(); i++) {
			System.out.print(q.stack1.elementAt(i) + ", ");
		}
		
	}


	private static int deQueue(Queue q) {
		int x, item = 0;
		if(q.stack1.isEmpty()) {
			return -1;
		}else if(q.stack1.size() == 1){
			return q.stack1.pop();
		}else {
			x = pop(q.stack1);
			item = deQueue(q);
			push(q.stack1, x);
		}
		
		return item;
	}


	private static int pop(Stack<Integer> top) {
		if(top == null) {
			return -1;
		}else {
			return top.pop();
		}
	}


	private static void enQueue(Queue q, int data) {
		push(q.stack1, data);
		
	}


	private static void push(Stack<Integer> stack1, int data) {
		stack1.push(data);
		
	}

}
