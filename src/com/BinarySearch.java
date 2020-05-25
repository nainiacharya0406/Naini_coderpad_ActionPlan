package com;

public class BinarySearch {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7,8,9,89};
		int first = 0;
		int last = arr.length-1;
		System.out.println(searchBinary(arr, 9 , first, last));

	}

	private static int searchBinary(int[] arr, int data,  int first, int last) {
		if (last >= first) { 
			int mid = first + (last - first) / 2;
			if (arr[mid] == data) {
				return mid; 
			} 
			if(data < arr[mid]) {
				return searchBinary(arr, data, first, mid-1);
			}		
			if(data > arr[mid]) {
				return searchBinary(arr, data, mid+1, last);
			}
		}
		return -1;
	}

}
