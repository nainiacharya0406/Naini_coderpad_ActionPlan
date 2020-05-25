package com;

import java.util.HashSet;
import java.util.Set;

public class IntersectionOfLinkedList {

	public static void main(String[] args) {
		ListNode n1 = new ListNode(1); 
		n1.next = new ListNode(2); 
		n1.next.next = new ListNode(3); 
		n1.next.next.next = new ListNode(4); 
		n1.next.next.next.next = new ListNode(5); 
		n1.next.next.next.next.next = new ListNode(6); 
		n1.next.next.next.next.next.next = new ListNode(7); 
		// list 2 
		ListNode n2 = new ListNode(10); 
		n2.next = new ListNode(9); 
		n2.next.next = new ListNode(8); 
		n2.next.next.next = n1.next.next.next.next; 
		System.out.println(intersectionPoint(n1, n2));

	}

	private static int intersectionPoint(ListNode n1, ListNode n2) {
		
		Set<Integer> set = new HashSet<Integer>();
		while(n1.next != null) {
			set.add(n1.data);
			n1 = n1.next;
		}
		while(n2!=null) {
			if(set.contains(n2.data)) {
				return n2.data;
			}
			n2=n2.next;
		}
		return -1;
	}

}
