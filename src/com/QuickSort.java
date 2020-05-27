package com;

public class QuickSort {

	public static void main(String[] args) {
		int[] arr = {10,49,50,9,70,100,22};
		int[] res = sortQuick(arr, 0, arr.length-1);
		for(int i=0; i<res.length; i++) {
			System.out.print(res[i]+" ");
		}
		

	}

	private static int[] sortQuick(int[] arr, int left, int right) {
		
		if(left < right) {
			int mid = divide(arr, left, right);
			sortQuick(arr, left, mid-1);
			sortQuick(arr, mid, right);
		}
		return arr;
	}

	private static int divide(int[] arr, int left, int right) {
		int pivot = arr[right];
		int i = left-1;
		for(int j=left; j<arr.length; j++) {
			if(arr[j] < pivot) {
				i++;
				int temp = arr[i]; 
                arr[i] = arr[j]; 
                arr[j] = temp; 
			}
		}
		int temp = arr[i+1]; 
        arr[i+1] = arr[right]; 
        arr[right] = temp; 
		return i+1;
	}

}
