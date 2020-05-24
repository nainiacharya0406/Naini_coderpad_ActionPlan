package com;

public class StackImplementation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack stc = new Stack();
		stc.push(4);
		stc.push(2);
		stc.push(1);
		stc.push(5);
		System.out.println("Top element is : "+stc.peek());
		System.out.println("Checking isEmpty before pop : "+stc.isEmpty());
		System.out.println("popped element is : "+stc.pop());
		System.out.println("Checking isEmpty after pop: "+stc.isEmpty());
		System.out.println("Top element is : "+stc.peek());
		

	}

}
