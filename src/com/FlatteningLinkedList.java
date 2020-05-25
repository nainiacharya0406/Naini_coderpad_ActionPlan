package com;

public class FlatteningLinkedList {
	DownLinkedList head;

	public static void main(String[] args) {
		FlatteningLinkedList list = new FlatteningLinkedList();
		list.head = list.push(list.head, 30); 
		list.head = list.push(list.head, 8); 
		list.head = list.push(list.head, 7); 
		list.head = list.push(list.head, 5); 
		list.head.next = list.push(list.head.next, 20); 
		list.head.next = list.push(list.head.next, 10); 

		list.head.next.next = list.push(list.head.next.next, 50);
		list.head.next.next = list.push(list.head.next.next, 22);
		list.head.next.next = list.push(list.head.next.next, 19);

		list.head.next.next.next = list.push(list.head.next.next.next, 45);
		list.head.next.next.next = list.push(list.head.next.next.next, 40);
		list.head.next.next.next = list.push(list.head.next.next.next, 2);
		list.head.next.next.next = list.push(list.head.next.next.next, 6);

		list.flatten(list.head);
		list.printList(list.head);



	}

	private void printList(DownLinkedList head) {
		DownLinkedList temp = head;
		while(temp !=null) {
			System.out.print(temp.data +" ");
			temp = temp.down;
		}
		
	}

	private DownLinkedList push(DownLinkedList head_ptr, int data) {
		DownLinkedList temp =  new DownLinkedList(data);
		temp.down = head_ptr;
		head_ptr = temp;
		return head_ptr;
	}
	private DownLinkedList flatten(DownLinkedList head_ptr) {
		if(head_ptr == null || head_ptr.next == null) {
			return null;
		}
		head_ptr.next = flatten(head_ptr.next);
		head_ptr = merge(head_ptr, head_ptr.next);
		return head_ptr;
	}

	private DownLinkedList merge(DownLinkedList node1, DownLinkedList node2) {
		if(node1 == null) {
			return node2;
		}
		if(node2 == null) {
			return  node1;
		}
		
		DownLinkedList result ;
		if(node1.data < node2.data) {
			result = node1;
			result.down = merge(node1.down, node2);
		}
		else{
			result = node2;
			result.down = merge(node2.down, node1);
		}
		result.next = null;  
        return result; 
	}

}
