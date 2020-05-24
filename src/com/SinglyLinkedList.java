package com;

public class SinglyLinkedList {
	ListNode head;
	private  SinglyLinkedList add(SinglyLinkedList list, int data) {
		ListNode newNode = new ListNode(data);
		newNode.next = null;
		if(list.head == null) {
			list.head = newNode;
		}else {
			ListNode current = list.head;
			while(current.next !=null) {
				current = current.next;
			}
			current.next = newNode;
		}
		return list;
	}
	
	
	private SinglyLinkedList delete(SinglyLinkedList list, int data) {
		if(list.head == null) {
			throw new NullPointerException("List is empty");
		}else {
			ListNode current = list.head;
			ListNode previous = current;
			while(current.data != data) {
				previous = current;
				current = current.next;
			}
			previous.next = current.next;
		}
		return list;
	}
	
	private void printList(SinglyLinkedList list) {
		ListNode current = list.head;
		while(current.next != null) {
			System.out.println(current.data);
			current = current.next;
		}
	}

	public static void main(String[] args) {
		SinglyLinkedList list = new SinglyLinkedList();
		list = list.add(list, 1); 
        list = list.add(list, 2); 
        list = list.add(list, 3); 
        list = list.add(list, 4); 
        list = list.add(list, 5); 
        list = list.delete(list, 3);
        list.printList(list);
	}
}
