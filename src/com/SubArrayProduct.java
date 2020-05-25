package com;

public class SubArrayProduct {

	// No.of subset such that their prouct is less than target.
	public static void main(String[] args) {
		int[] arr = {10,3,5,2,7,9};
		int target = 27;
		System.out.println(subArray(arr, target));
	}

	private static int subArray(int[] arr, int target) {
		int n = arr.length;  
	    long product = 1; 
	    int res = 0; 
	    for (int start = 0, end = 0; end < n; end++) { 
	  
	    	product = product* arr[end]; 
	          
	        while (start < end && product >= target)  
	        	product /= arr[start++];      
	        
	        if (product < target) { 
	            int len = end - start + 1; 
	            res += len; 
	        } 
	    } 
	  
	    return res; 
	}

}
