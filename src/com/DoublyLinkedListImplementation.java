package com;

public class DoublyLinkedListImplementation {
	
	DoublyLinkedList head;

	public static void main(String[] args) {
		DoublyLinkedListImplementation list = new DoublyLinkedListImplementation();
		list.add(list,2);
		list.add(list, 1);
		list.add(list, 3);
		list.add(list,4);
		list.add(list, 5);
		list.add(list, 6);
		list.printDoublyLinkedList(list);
		list.delete(list, 4);
		list.printDoublyLinkedList(list);

	}

	private void delete(DoublyLinkedListImplementation list, int data) {
		DoublyLinkedList curr = list.head;
		DoublyLinkedList prev = curr;
		while(curr.data != data) {
			prev = curr;
			curr = curr.next;
		}
		prev.next = curr.next;
		curr.next.prev = prev;
		
	}

	private void printDoublyLinkedList(DoublyLinkedListImplementation list) {
		DoublyLinkedList temp = list.head;
		System.out.print("List : ");
		while(temp.next !=null) {
			System.out.print(temp.data);
			temp=temp.next;
		}
		System.out.println();
		
	}

	private void add(DoublyLinkedListImplementation list, int data) {
		DoublyLinkedList temp = new DoublyLinkedList(data);
		temp.next = null;
		temp.prev = null;
		if(list.head == null) {
			list.head = temp;
		}else {
			DoublyLinkedList curr = list.head;
			while(curr.next != null) {
				curr = curr.next;
			}
			curr.next = temp;
			temp.prev = curr;
		}		
	}

}
