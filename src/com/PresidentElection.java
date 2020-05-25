package com;

import java.util.ArrayList;

public class PresidentElection {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		int k=2;
		System.out.println(president(list, k));
		

	}

	private static int president(ArrayList<Integer> list, int k) {
		int i=0;
		while(i<k && i<list.size()) {
			if(i==k) {
				list.remove(i);
			}
			i++;
		}
		return list.get(0);
	}

}
