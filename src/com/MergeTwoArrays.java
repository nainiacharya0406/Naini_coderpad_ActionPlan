package com;

public class MergeTwoArrays {

	public static int[] merge(int[] arr1, int[] arr2) {
		int[] arr3 = new int[arr1.length+arr2.length];
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
		return arr3;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = {1,12,15,26,38};
		int[] arr2 = {2,13,17,30,45};
		int[] arr3 = merge(arr1, arr2);
		for(int i=0; i<arr3.length;i++) {
			System.out.print(arr3[i] + ", ");
		}

	}

}
