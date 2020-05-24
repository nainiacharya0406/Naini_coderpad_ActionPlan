package com;

public class BubbleSort {
	public static void sortBubble(int[] arr) {
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i] > arr[j]) {
					int temp= arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}				
			}
		}
		for(int k=0; k<arr.length; k++) {
			System.out.println(arr[k]);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2,5,7,9,1,4};
		sortBubble(arr);

	}

}
