package com;

import java.util.Stack;

public class RecurssiveStackStort {

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(30); 
		stack.push(-5); 
		stack.push(18); 
		stack.push(14); 
		stack.push(-3); 

		sortStack(stack); 

		System.out.println(" \n\nStack elements after sorting:"); 
		printStack(stack); 

	}

	private static void sortStack(Stack<Integer> stack) {
		if(!stack.isEmpty()) {
			int data=stack.pop();
			sortStack(stack);
			insert(stack, data);
		}


	}

	private static void insert(Stack<Integer> stack, int data) {
		if(stack.isEmpty() || data > stack.peek()) {
			stack.push(data);
			return;
		}
		int temp = stack.pop();
		insert(stack, data);
		stack.push(temp);
	}

	private static void printStack(Stack<Integer> stack) {
		while(!stack.isEmpty()) {
			System.out.print(stack.pop()+ " ");
		}

	}

}
