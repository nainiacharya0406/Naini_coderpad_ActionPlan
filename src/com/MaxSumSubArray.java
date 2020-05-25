package com;

public class MaxSumSubArray {

	public static void main(String[] args) {
			int[] arr = {-2, -3, 4, -1, -2, 1, 5, -3};
			System.out.println("Max sum is : "+maxSum(arr));
	}

	private static int maxSum(int[] arr) {
		int max_soFar = 0;
		int max_curr = 0;
		for(int i=0; i<arr.length;i++) {
			max_curr = max_curr+arr[i];
			if(max_curr < 0) {
				max_curr = 0;
			}
			if(max_soFar < max_curr) {
				max_soFar = max_curr;
			}
		}
		return max_soFar;
	}

}
