package com;

public class Stack {
	int capacity = 10;
	int[] arr = new int[capacity];
	int top = -1;

	public int pop() {
		if(top > -1) {
			int data = arr[top];
			arr[top--] = Integer.MIN_VALUE;
			return data;
		}else {
			return 0;
		}
				
	}

	public void push(int data) {
		if(top<capacity) {
			arr[++top] = data;
		}else {
			System.out.println("Stack overflow");
		}
	}

	public Boolean isEmpty() {
		if(top > -1) {
			return false;
		}
		return true;
	}

	public int peek() {
		if(top>-1) {
			return arr[top];
		}else {
			return 0;
		}
		
		
	}
	

}
