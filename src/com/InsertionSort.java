package com;

public class InsertionSort {

	public static void sortLinear(int[] arr) {
		int len = arr.length-1;
		for(int i=1; i<len; i++) {
			int key = arr[i];
			int j = i-1;
			while(j >=0 && arr[j] > key) {
				arr[j + 1] = arr[j]; 
				j = j - 1; 
			} 
			arr[j + 1] = key;
		}
		for(int i=0; i<len; i++) {
			System.out.print(arr[i] +" ,");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {12, 11, 13, 5, 6, 7}; 
		sortLinear(arr);

	}

}
