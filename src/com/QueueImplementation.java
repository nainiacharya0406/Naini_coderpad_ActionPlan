package com;


public class QueueImplementation {

	public static void main(String[] args) {
		Queue que = new Queue();
		System.out.println("Is queue empty : "+que.isEmpty());
		que.enQueue(4);
		que.enQueue(2);
		que.enQueue(2);
		que.enQueue(1);
		que.enQueue(9);
		
		que.deQueue();
		System.out.println("Front element in queue is: "+que.front());
		System.out.println("Size of queue is : "+que.size());
		System.out.println("Is queue empty : "+que.isEmpty());
		

	}

}
