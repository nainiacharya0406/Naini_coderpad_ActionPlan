package com;

public class LinearSearch {
	
	public static void main(String[] args) {
		int[] arr = {22,55,77,2,44, 89};
		System.out.println(searchLinear(arr, 55));
	}

	private static int searchLinear(int[] arr, int data) {
		for(int i=0; i<arr.length; i++) {
			if(arr[i] ==  data) {
				return i;
			}
		}
		return Integer.MIN_VALUE;
		
	}

}
