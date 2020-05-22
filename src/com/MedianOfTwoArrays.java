package com;

public class MedianOfTwoArrays {
	public static int median(int[] arr1, int[] arr2) {
		int[] arr3 = new int[arr1.length+arr2.length];
		int median = 0;
		int len3 = arr3.length;
		int i=0, j=0,k=0;
		while(i<arr1.length && j< arr2.length) {
			if(arr1[i] < arr2[j]) {
				arr3[k] = arr1[i];
				i++;
				k++;
			}else {
				arr3[k] = arr2[j];
				j++;
				k++;
			}
		}
			while (i < arr1.length) 
				arr3[k++] = arr1[i++]; 
			while (j < arr2.length) 
				arr3[k++] = arr2[j++];
			
			//median 
			if(len3 %2 == 0) {
				median = (arr3[(len3)/2] + arr3[(len3-1) / 2])/2;
			}else {
				median = arr3[arr3.length/2];
			}
		return median;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = {1,12,15,26,38};
		int[] arr2 = {2,13,17,3};
		System.out.println(median(arr1, arr2));

	}

}
