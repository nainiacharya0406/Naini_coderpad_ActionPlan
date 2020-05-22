package com;

public class SubsetSum {
	public static int subset(int num, int[] arr) {
		int sum = 0;
		int start=0;
		int end = start+1;
		int min = arr.length+1;
		int subsetpre = 0;
		int subsetPost = 0;
		for(start=0; start<arr.length; start++) {
			sum = arr[start];
			for(end=start+1; end<arr.length; end++) {
				sum = sum+arr[end];
				if(sum > num && end-start+1 < min) {
					min = end-start+1;
					subsetPost = end;
					subsetpre=start;
				}
			}
		}
		for(int i=subsetpre; i<subsetPost;i++) {
			System.out.println("Subset: "+arr[i]);
		}
		return  min;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 51;
		int[] arr = {1, 4, 45, 6, 0, 19};
		System.out.println(subset(num, arr));

	}

}
