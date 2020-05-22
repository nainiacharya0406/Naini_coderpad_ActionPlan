package com;

public class SecondSmallest {
	
	public static void secondSmallNumber(int[] arr){
		int first = Integer.MAX_VALUE, second = Integer.MAX_VALUE; 
		for(int i=0; i<arr.length; i++) {
			if (arr[i] < first) 
            { 
                second = first; 
                first = arr[i]; 
            }else if (arr[i] < second && arr[i] != first) 
                second = arr[i]; 
        } 
		System.out.println("First element : "+first);
		System.out.println("second element : "+second);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {5,8,2,9,1,66,8,0};
		secondSmallNumber(arr);
	}

}
