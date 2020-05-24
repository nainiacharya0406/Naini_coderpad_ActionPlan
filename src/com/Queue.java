package com;

public class Queue {
	ListNode front;
	ListNode rear;

	public void enQueue(int data) {
		ListNode temp = new ListNode(data);
		if(this.rear == null) {
			front = rear = temp;
		}else {
			rear.next = temp;
			this.rear = temp;
		}
	}

	public void deQueue() throws NullPointerException {
		if(rear == null) {
			throw new NullPointerException("Queue is empty");
		}else {
			ListNode temp = front.next;
			front.next = null;
			this.front = temp;

		}		
	}

	public int front() {
		return front.data;

	}

	public int size() throws NullPointerException{
		ListNode temp = this.front;
		int count=0;
		if(rear == null) {
			throw new NullPointerException("Queue is empty");
		}else {
			while(temp.next != null) {
				temp = temp.next;
				count++;
			}
		}
		return count+1;
	}

	public Boolean isEmpty() {
		return (rear == null);

	}

}
